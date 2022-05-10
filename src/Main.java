import javax.xml.stream.XMLStreamException;
import javax.xml.xquery.XQException;

public class Main {
    public static void main(String[] args) throws XQException, XMLStreamException {
        GestorDB gestorDB = new GestorDB();

        System.out.println("*** Barris que tenen com a mínim un registre ***");
        gestorDB.getBarris();

    }
}