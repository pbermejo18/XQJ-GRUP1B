import javax.xml.stream.XMLStreamException;
import javax.xml.xquery.XQException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws XQException, XMLStreamException {
        Scanner scanner = new Scanner(System.in);
        GestorDB gestorDB = new GestorDB();

        System.out.println("*** Barris que tenen com a mínim un registre ***");
        gestorDB.getBarris();

        System.out.println("\n*** Nombre d'accidents a un barri ***");
        System.out.print("Escriu el barri que vols consultar quants accidents han hagut durant 2015: ");
        String barri = scanner.nextLine();
        gestorDB.getNAccidentsBarri(barri);

        System.out.println("\n*** Llista d'accidents a cada mes (de més accidents a menys) ***");
        gestorDB.getmesAmbMesAccidents();

        System.out.println("\n*** Accidents en horari nocturn (22h a 06h) durant tot l'any ***");
        gestorDB.getAccidentsEnUnHorari();

        System.out.println("\n*** Total de vehicles implicats en accidents durant tot l'any ***");
        gestorDB.getVehiclesImplicats();

        System.out.println("\n*** Tipus de lesions provocades per els accidents ***");
        gestorDB.getTipusLesionats();

        gestorDB.tancarSessió();
    }
}