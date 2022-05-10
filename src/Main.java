import javax.xml.stream.XMLStreamException;
import javax.xml.xquery.XQException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws XQException, XMLStreamException {
        Scanner scanner = new Scanner(System.in);
        GestorDB gestorDB = new GestorDB();

        System.out.println("*** Barris que tenen com a mínim un registre ***");
        gestorDB.getBarris();

        System.out.println("\n*** Numero de accidents en un barri");
        System.out.print("Escriu el barri que vols consultar quants accidents han hagut durant 2015: ");
        String barri = scanner.nextLine();
        gestorDB.getNAccidentsBarri(barri);

        gestorDB.tancarSessió();
    }
}