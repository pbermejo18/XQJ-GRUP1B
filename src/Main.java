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

        // INSERT
        System.out.print("Número d'expedient: ");
        int numero_expedient = scanner.nextInt();

        System.out.print("Codi districte: ");
        int codi_districte = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nom districte: ");
        String nom_districte = scanner.nextLine();

        System.out.print("Nk barri: ");
        int nk_barri = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nom barri: ");
        String nom_barri = scanner.nextLine();

        System.out.print("Codi carrer: ");
        int codi_carrer = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nom carrer: ");
        String nom_carrer = scanner.nextLine();

        System.out.print("Número postal: ");
        String num_postal_caption = scanner.nextLine();

        System.out.print("Dia de la setmana (text): ");
        String descripcio_dia_setmana = scanner.nextLine();

        System.out.print("Dia de la setmana (número): ");
        String dia_setmana = scanner.nextLine();

        System.out.print("Descripcio tipus de día: ");
        String descripcio_tipus_dia = scanner.nextLine();

        System.out.print("Nk any: ");
        int nKAny = scanner.nextInt();

        System.out.print("Mes de l'any: ");
        int mes_de_any = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nom del mes: ");
        String nom_mes = scanner.nextLine();

        System.out.print("Día del mes: ");
        int dia_de_mes = scanner.nextInt();

        System.out.print("Hora del día: ");
        int hora_de_dia = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Descripció torn: ");
        String descripcio_torn = scanner.nextLine();

        System.out.print("Descripció causa vianant: ");
        String descripcio_causa_vianant = scanner.nextLine();

        System.out.print("Número de víctimes: ");
        int num_victimas = scanner.nextInt();

        System.out.print("Número de lesionats lleus: ");
        int num_lesionats_lleus = scanner.nextInt();

        System.out.print("Número de lesionats greus: ");
        int num_lesionats_greus = scanner.nextInt();

        System.out.print("Número de vehicles: ");
        int num_vehicles = scanner.nextInt();

        System.out.print("Coordenades UTMY: ");
        float coordenadaUTMY = scanner.nextFloat();

        System.out.print("Coordenades UTMX: ");
        float coordenadaUTMX = scanner.nextFloat();

        Registre registre = new Registre(numero_expedient, codi_districte, nom_districte, nk_barri, nom_barri, codi_carrer, nom_carrer,
                num_postal_caption,descripcio_dia_setmana,dia_setmana,descripcio_tipus_dia,nKAny,mes_de_any,nom_mes,dia_de_mes,hora_de_dia,
                descripcio_torn,descripcio_causa_vianant,num_victimas,num_lesionats_lleus,num_lesionats_greus,num_vehicles,coordenadaUTMY,coordenadaUTMX);

        gestorDB.insertRegistre(registre);
*/
        // DELETE
        gestorDB.deleteRegistre(1);

        gestorDB.tancarSessió();
    }
}