import javax.xml.stream.XMLStreamException;
import javax.xml.xquery.XQException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws XQException {
        Scanner scanner = new Scanner(System.in);
        GestorDB gestorDB = new GestorDB();
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println();
            System.out.println("###################################################################");
            System.out.println("##                            MENÚ                               ##");
            System.out.println("## 1. Districtes que tenen com a mínim un registre               ##");
            System.out.println("## 2. Nombre d'accidents a un barri                              ##");
            System.out.println("## 3. Llista d'accidents a cada mes (de més accidents a menys)   ##");
            System.out.println("## 4. Accidents en horari nocturn (22h a 06h) durant tot l'any   ##");
            System.out.println("## 5. Total de vehicles implicats en accidents durant tot l'any  ##");
            System.out.println("## 6. Tipus de lesions provocades per els accidents              ##");
            System.out.println("## 7. Insert registre                                            ##");
            System.out.println("## 8. Delete registre                                            ##");
            System.out.println("## 9. Replace registre                                           ##");
            System.out.println("## 10. Salir                                                     ##");
            System.out.println("###################################################################");

            try {
                System.out.print("Escriu una de les opcions: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n*** Districtes que tenen com a mínim un registre ***");
                        gestorDB.getBarris();
                        break;
                    case 2:
                        numeroAccidents();
                        break;
                    case 3:
                        System.out.println("\n*** Llista d'accidents a cada mes (de més accidents a menys) ***");
                        gestorDB.getmesAmbMesAccidents();
                        break;
                    case 4:
                        System.out.println("\n*** Accidents en horari nocturn (22h a 06h) durant tot l'any ***");
                        gestorDB.getAccidentsEnUnHorari();
                        break;
                    case 5:
                        System.out.println("\n*** Total de vehicles implicats en accidents durant tot l'any ***");
                        gestorDB.getVehiclesImplicats();
                        break;
                    case 6:
                        System.out.println("\n*** Tipus de lesions provocades per els accidents ***");
                        gestorDB.getTipusLesionats();
                        break;
                    case 7:
                        insertRegistre();
                        break;
                    case 8:
                        deleteregistre();
                        break;
                    case 9:
                        refactorregistre();
                        break;
                    case 10:
                        salir = true;
                        gestorDB.tancarSessió();
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            } catch (XMLStreamException e) {
                e.printStackTrace();
            }
        }
    }
    public static void numeroAccidents() throws XQException, XMLStreamException {
        Scanner scanner = new Scanner(System.in);
        GestorDB gestorDB = new GestorDB();
        System.out.println("\n*** Nombre d'accidents a un barri ***");
        System.out.print("Escriu el barri que vols consultar quants accidents han hagut durant 2015: ");
        String barri = scanner.nextLine();
        gestorDB.getNAccidentsBarri(barri);
        gestorDB.tancarSessió();
    }

    public static void deleteregistre() throws XQException {
        Scanner scanner = new Scanner(System.in);
        GestorDB gestorDB = new GestorDB();
        System.out.print("Indica el número d'expedient del registre que vols esborrar: ");
        int num = scanner.nextInt();
        gestorDB.deleteRegistre(num);
        gestorDB.tancarSessió();
    }

    public static void refactorregistre() throws XQException {
        Scanner scanner = new Scanner(System.in);
        GestorDB gestorDB = new GestorDB();
        System.out.print("Indica el número d'expedient del registre que vols modificar: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Indica el nou nom de districte per a aquest registre: ");
        String str = scanner.nextLine();
        gestorDB.refactorRegistre(num,str);
        gestorDB.tancarSessió();
    }

    public static void insertRegistre() throws XQException {
        Scanner scanner = new Scanner(System.in);
        GestorDB gestorDB = new GestorDB();

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
        gestorDB.tancarSessió();
    }
}