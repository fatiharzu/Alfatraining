package woche05.tag01.TelefonBuchTodoKommentare.model;
//TODO 7 Kein Klassenkommentar
//TODO 7.1 Dieses Modell stellt einen Bauplan für einen Kontakt dar -> Klassenname im Singular
public class Kontakte {

    private String strVorname;
    private String strNachname;
    private long  lTelefonnummer;
    private String strEmail;


    public Kontakte(){}

    public String getStrVorname() {
        return strVorname;
    }

    public void setStrVorname(String strVorname) {
        this.strVorname = strVorname;
    }

    public String getStrNachname() {
        return strNachname;
    }

    public void setStrNachname(String strNachname) {
        this.strNachname = strNachname;
    }

    public long getlTelefonnummer() {
        return lTelefonnummer;
    }

    public void setlTelefonnummer(long lTelefonnummer) {
        this.lTelefonnummer = lTelefonnummer;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    //TODO 8 Konstruktoren gehören zueinander und zwar unter die Attribute
    public Kontakte(String strNachname, String strVorname, long lTelefonnummer,
                    String strEmail) {
        //TODO 8.1 Auskommentierter Code entfernen, wenn nicht mehr benötigt
       // super();
        this.strVorname =strVorname;
        this.strNachname = strNachname;
        this.lTelefonnummer = lTelefonnummer;
        this.strEmail = strEmail;
    }
}
