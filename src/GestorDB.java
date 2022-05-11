import net.xqj.exist.ExistXQDataSource;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.xquery.*;

public class GestorDB {
    public XQConnection conn;

    public GestorDB() throws XQException {
        XQDataSource xqs = new ExistXQDataSource();
        xqs.setProperty("serverName", "192.168.0.22");
        xqs.setProperty("port", "8080");
        conn = xqs.getConnection();
    }

    public void tancarSessió() throws XQException { conn.close(); }

    public void getBarris() throws XQException, XMLStreamException {
        XQExpression expr = conn.createExpression();

        //XQResultSequence resultNom = expr.executeQuery(
                //"distinct-values(//Accidentalitat2015/Registre/Nomdistricte/text())" );

        XQResultSequence resultNom = expr.executeQuery(
                """ 
                        let $names := for $name in //Accidentalitat2015/Registre/Nomdistricte/text()
                        return ($name)
                        for $name in distinct-values($names)
                        return <N>{$name}</N>
                        """
        );
        /*
        <A>{
          let $names :=
            for $name in //Accidentalitat2015/Registre/Nomdistricte/text()
            return ($name)
          for $name in distinct-values($names)
          return <N>{$name, '-', count($names[. eq $name])}</N>
        }</A>
         */

        while (resultNom.next()) {
            //resultNom.writeSequence(System.out, null);
            XMLStreamReader xmlStreamReader = resultNom.getItemAsStream();
            //System.out.println(xmlStreamReader.getElementText());
            for (; xmlStreamReader.hasNext(); xmlStreamReader.next())
                if (xmlStreamReader.getEventType() == XMLStreamConstants.CHARACTERS) System.out.println(xmlStreamReader.getText());
        }
    }

    public void getNAccidentsBarri(String barri) throws XQException, XMLStreamException {
        XQExpression expr = conn.createExpression();

        XQResultSequence resultBarri = expr.executeQuery(
                " for $c in collection(\"/db/GRUP1B\")" +
                        "let $naccidents:= count($c/Accidentalitat2015/Registre[Nomdistricte='"+barri+"'])" +
                        "return" +
                        "<i>{$naccidents}</i>");

        while (resultBarri.next()) {
            XMLStreamReader xmlStreamReader = resultBarri.getItemAsStream();
            for (; xmlStreamReader.hasNext(); xmlStreamReader.next())
                if (xmlStreamReader.getEventType() == XMLStreamConstants.CHARACTERS) System.out.println("Han hagut: "+xmlStreamReader.getText()+" accidents");
        }
    }

    // mes amb més accidents order by accidents
    public void getmesAmbMesAccidents() throws XQException, XMLStreamException {
        XQExpression expr = conn.createExpression();

        XQResultSequence resultMes = expr.executeQuery(
                """
                        let $names := for $name in //Accidentalitat2015/Registre/Nommes/text()
                        return ($name)
                        for $name in distinct-values($names)
                        order by count($names[. eq $name]) descending
                        return <N>{$name, '-', count($names[. eq $name])}</N>
                        """
        );

        while (resultMes.next()) {
            XMLStreamReader xmlStreamReader = resultMes.getItemAsStream();
            for (; xmlStreamReader.hasNext(); xmlStreamReader.next())
                if (xmlStreamReader.getEventType() == XMLStreamConstants.CHARACTERS) System.out.println(xmlStreamReader.getText());
        }
    }

    // mostra el accidents que han hagut entre Horadedia 23 y Horadedia 06
    public void getAccidentsEnUnHorari() throws XQException, XMLStreamException {
        XQExpression expr = conn.createExpression();
        /* https://stackoverflow.com/questions/1198253/xpath-how-to-select-elements-based-on-their-value
        collection('/db/GRUP1B')//*[contains(text(),"12") and contains(name(),"Horadedia")]

        for $c in collection('/db/GRUP1B')
            let $naccidents:= count($c//*[contains(text(),"12") and contains(name(),"Horadedia")  ])
            return
                <i>{$naccidents}</i>

        for $c in collection('/db/GRUP1B')
            where ($c/Accidentalitat2015/Registre/Horadedia[text() ge 4 and text() le 18])
            return count($c/Accidentalitat2015/Registre/Horadedia)
         */

        XQResultSequence resultMes = expr.executeQuery(
                """
                        for $c in collection('/db/GRUP1B')
                           let $naccidents:= count($c//Accidentalitat2015/Registre/Horadedia[contains(text(),"22") or contains(text(),"23") or
                           contains(text(),"00") or contains(text(),"01") or contains(text(),"02") or contains(text(),"03") or contains(text(),"04") or
                           contains(text(),"05") or contains(text(),"06")])
                           return
                             <i>{$naccidents}</i>
                        """
        );

        while (resultMes.next()) {
            XMLStreamReader xmlStreamReader = resultMes.getItemAsStream();
            for (; xmlStreamReader.hasNext(); xmlStreamReader.next())
                if (xmlStreamReader.getEventType() == XMLStreamConstants.CHARACTERS) System.out.println("Durant l'horari nocturn han hagut: "+xmlStreamReader.getText()+" accidents");
        }
    }

    // total de vehicles implicats en els accidents
    public void getVehiclesImplicats() throws XQException, XMLStreamException {
        XQExpression expr = conn.createExpression();

        XQResultSequence resultVehicle = expr.executeQuery(
                """
                        for $c in collection('/db/GRUP1B')
                           let $nvehicles:= sum($c/Accidentalitat2015/Registre/Numerodevehiclesimplicats)
                           return
                               <i>{$nvehicles}</i>
                        """
        );

        while (resultVehicle.next()) {
            XMLStreamReader xmlStreamReader = resultVehicle.getItemAsStream();
            for (; xmlStreamReader.hasNext(); xmlStreamReader.next())
                if (xmlStreamReader.getEventType() == XMLStreamConstants.CHARACTERS) System.out.println("Total vehicles implicats: "+xmlStreamReader.getText()+" vehicles");
        }
    }

    // Numerodelesionatslleus y Numerodelesionatsgreus en tot l'any
    public void  getTipusLesionats() throws XQException, XMLStreamException {
        XQExpression expr = conn.createExpression();

        XQResultSequence resultTipusLesio = expr.executeQuery(
                """
                        for $c in collection('/db/GRUP1B')
                           let $nlesiolleu:= sum($c/Accidentalitat2015/Registre/Numerodelesionatslleus)
                           let $nlesiogreu:= sum($c/Accidentalitat2015/Registre/Numerodelesionatsgreus)
                           return
                               <i>{"Han hagut: ",$nlesiolleu," lesionats lleus y ",$nlesiogreu," lesionats greus"}</i>
                        """
        );

        while (resultTipusLesio.next()) {
            XMLStreamReader xmlStreamReader = resultTipusLesio.getItemAsStream();
            for (; xmlStreamReader.hasNext(); xmlStreamReader.next())
                if (xmlStreamReader.getEventType() == XMLStreamConstants.CHARACTERS) System.out.println(xmlStreamReader.getText());
        }
    }
}