import javax.xml.stream.XMLStreamException;
import javax.xml.xquery.XQException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws XQException, XMLStreamException {
        Scanner scanner = new Scanner(System.in);
        GestorDB gestorDB = new GestorDB();
/*
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
*/
        // INSERT
        System.out.println("Número d'expedient: ");
        int numero_expedient = scanner.nextInt();

        System.out.println("Codi districte: ");
        int codi_districte = scanner.nextInt();

        System.out.println("Nom districte: ");
        String nom_districte = scanner.next();

        System.out.println("Nk barri: ");
        int nk_barri = scanner.nextInt();

        System.out.println("Nom barri: ");
        String nom_barri = scanner.next();

        System.out.println("Codi carrer: ");
        int codi_carrer = scanner.nextInt();

        String nom_carrer = scanner.nextLine();
        String num_postal_caption = scanner.nextLine();
        String descripcio_dia_setmana = scanner.nextLine();
        String dia_setmana = scanner.nextLine();
        String descripcio_tipus_dia = scanner.nextLine();
        int nKAny = scanner.nextInt();
        int mes_de_any = scanner.nextInt();
        String nom_mes = scanner.nextLine();
        int dia_de_mes = scanner.nextInt();
        int hora_de_dia = scanner.nextInt();
        String descripcio_torn = scanner.nextLine();
        String descripcio_causa_vianant = scanner.nextLine();
        int num_victimas = scanner.nextInt();
        int num_lesionats_lleus = scanner.nextInt();
        int num_lesionats_greus = scanner.nextInt();
        int num_vehicles = scanner.nextInt();
        float coordenadaUTMY = scanner.nextFloat();
        float coordenadaUTMX = scanner.nextFloat();

        Registre registre = new Registre(numero_expedient, codi_districte, nom_districte, nk_barri, nom_barri, codi_carrer, nom_carrer,
                num_postal_caption,descripcio_dia_setmana,dia_setmana,descripcio_tipus_dia,nKAny,mes_de_any,nom_mes,dia_de_mes,hora_de_dia,
                descripcio_torn,descripcio_causa_vianant,num_victimas,num_lesionats_lleus,num_lesionats_greus,num_vehicles,coordenadaUTMY,coordenadaUTMX);

        gestorDB.insertRegistre(registre);

        gestorDB.tancarSessió();
    }
}