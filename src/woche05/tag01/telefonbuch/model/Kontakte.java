package woche05.tag01.telefonbuch.model;

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


    public Kontakte(String strNachname, String strVorname, long lTelefonnummer,
                    String strEmail) {
       // super();
        this.strVorname =strVorname;
        this.strNachname = strNachname;
        this.lTelefonnummer = lTelefonnummer;
        this.strEmail = strEmail;
    }
}
