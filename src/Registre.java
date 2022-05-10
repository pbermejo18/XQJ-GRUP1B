public class Registre {
    Long numero_expedient;
    int codi_districte;
    String nom_districte;
    int nk_barri;
    String nom_barri;
    int codi_carrer;
    String nom_carrer;
    String num_postal_caption;
    String descripcio_dia_setmana;
    String dia_setmana;
    String descripcio_tipus_dia;
    int nKAny;
    int mes_de_any;
    String nom_mes;
    int dia_de_mes;
    int hora_de_dia;
    String descripcio_torn;
    String descripcio_causa_vianant;
    int num_victimas;
    int num_lesionats_lleus;
    int num_lesionats_greus;
    int num_vehicles;
    float coordenadaUTMY;
    float coordenadaUTMX;

    public Registre(Long numero_expedient, int codi_districte, String nom_districte, int nk_barri, String nom_barri, int codi_carrer, String nom_carrer, String num_postal_caption, String descripcio_dia_setmana, String dia_setmana, String descripcio_tipus_dia, int nKAny, int mes_de_any, String nom_mes, int dia_de_mes, int hora_de_dia, String descripcio_torn, String descripcio_causa_vianant, int num_victimas, int num_lesionats_lleus, int num_lesionats_greus, int num_vehicles, float coordenadaUTMY, float coordenadaUTMX) {
        this.numero_expedient = numero_expedient;
        this.codi_districte = codi_districte;
        this.nom_districte = nom_districte;
        this.nk_barri = nk_barri;
        this.nom_barri = nom_barri;
        this.codi_carrer = codi_carrer;
        this.nom_carrer = nom_carrer;
        this.num_postal_caption = num_postal_caption;
        this.descripcio_dia_setmana = descripcio_dia_setmana;
        this.dia_setmana = dia_setmana;
        this.descripcio_tipus_dia = descripcio_tipus_dia;
        this.nKAny = nKAny;
        this.mes_de_any = mes_de_any;
        this.nom_mes = nom_mes;
        this.dia_de_mes = dia_de_mes;
        this.hora_de_dia = hora_de_dia;
        this.descripcio_torn = descripcio_torn;
        this.descripcio_causa_vianant = descripcio_causa_vianant;
        this.num_victimas = num_victimas;
        this.num_lesionats_lleus = num_lesionats_lleus;
        this.num_lesionats_greus = num_lesionats_greus;
        this.num_vehicles = num_vehicles;
        this.coordenadaUTMY = coordenadaUTMY;
        this.coordenadaUTMX = coordenadaUTMX;
    }

    public Long getNumero_expedient() {
        return numero_expedient;
    }

    public void setNumero_expedient(Long numero_expedient) {
        this.numero_expedient = numero_expedient;
    }

    public int getCodi_districte() {
        return codi_districte;
    }

    public void setCodi_districte(int codi_districte) {
        this.codi_districte = codi_districte;
    }

    public String getNom_districte() {
        return nom_districte;
    }

    public void setNom_districte(String nom_districte) {
        this.nom_districte = nom_districte;
    }

    public int getNk_barri() {
        return nk_barri;
    }

    public void setNk_barri(int nk_barri) {
        this.nk_barri = nk_barri;
    }

    public String getNom_barri() {
        return nom_barri;
    }

    public void setNom_barri(String nom_barri) {
        this.nom_barri = nom_barri;
    }

    public int getCodi_carrer() {
        return codi_carrer;
    }

    public void setCodi_carrer(int codi_carrer) {
        this.codi_carrer = codi_carrer;
    }

    public String getNom_carrer() {
        return nom_carrer;
    }

    public void setNom_carrer(String nom_carrer) {
        this.nom_carrer = nom_carrer;
    }

    public String getNum_postal_caption() {
        return num_postal_caption;
    }

    public void setNum_postal_caption(String num_postal_caption) {
        this.num_postal_caption = num_postal_caption;
    }

    public String getDescripcio_dia_setmana() {
        return descripcio_dia_setmana;
    }

    public void setDescripcio_dia_setmana(String descripcio_dia_setmana) {
        this.descripcio_dia_setmana = descripcio_dia_setmana;
    }

    public String getDia_setmana() {
        return dia_setmana;
    }

    public void setDia_setmana(String dia_setmana) {
        this.dia_setmana = dia_setmana;
    }

    public String getDescripcio_tipus_dia() {
        return descripcio_tipus_dia;
    }

    public void setDescripcio_tipus_dia(String descripcio_tipus_dia) {
        this.descripcio_tipus_dia = descripcio_tipus_dia;
    }

    public int getnKAny() {
        return nKAny;
    }

    public void setnKAny(int nKAny) {
        this.nKAny = nKAny;
    }

    public int getMes_de_any() {
        return mes_de_any;
    }

    public void setMes_de_any(int mes_de_any) {
        this.mes_de_any = mes_de_any;
    }

    public String getNom_mes() {
        return nom_mes;
    }

    public void setNom_mes(String nom_mes) {
        this.nom_mes = nom_mes;
    }

    public int getDia_de_mes() {
        return dia_de_mes;
    }

    public void setDia_de_mes(int dia_de_mes) {
        this.dia_de_mes = dia_de_mes;
    }

    public int getHora_de_dia() {
        return hora_de_dia;
    }

    public void setHora_de_dia(int hora_de_dia) {
        this.hora_de_dia = hora_de_dia;
    }

    public String getDescripcio_torn() {
        return descripcio_torn;
    }

    public void setDescripcio_torn(String descripcio_torn) {
        this.descripcio_torn = descripcio_torn;
    }

    public String getDescripcio_causa_vianant() {
        return descripcio_causa_vianant;
    }

    public void setDescripcio_causa_vianant(String descripcio_causa_vianant) {
        this.descripcio_causa_vianant = descripcio_causa_vianant;
    }

    public int getNum_victimas() {
        return num_victimas;
    }

    public void setNum_victimas(int num_victimas) {
        this.num_victimas = num_victimas;
    }

    public int getNum_lesionats_lleus() {
        return num_lesionats_lleus;
    }

    public void setNum_lesionats_lleus(int num_lesionats_lleus) {
        this.num_lesionats_lleus = num_lesionats_lleus;
    }

    public int getNum_lesionats_greus() {
        return num_lesionats_greus;
    }

    public void setNum_lesionats_greus(int num_lesionats_greus) {
        this.num_lesionats_greus = num_lesionats_greus;
    }

    public int getNum_vehicles() {
        return num_vehicles;
    }

    public void setNum_vehicles(int num_vehicles) {
        this.num_vehicles = num_vehicles;
    }

    public float getCoordenadaUTMY() {
        return coordenadaUTMY;
    }

    public void setCoordenadaUTMY(float coordenadaUTMY) {
        this.coordenadaUTMY = coordenadaUTMY;
    }

    public float getCoordenadaUTMX() {
        return coordenadaUTMX;
    }

    public void setCoordenadaUTMX(float coordenadaUTMX) {
        this.coordenadaUTMX = coordenadaUTMX;
    }
}