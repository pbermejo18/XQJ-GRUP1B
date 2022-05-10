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

    public void tancarSessió() throws XQException {
        conn.close();
    }

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
                if (xmlStreamReader.getEventType() == XMLStreamConstants.CHARACTERS) System.out.println(xmlStreamReader.getText());
        }
    }
}