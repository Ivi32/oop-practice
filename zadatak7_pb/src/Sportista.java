public class Sportista {
    //Napisati klasu Sportista. Sportista ima
    //1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
    //2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
    //3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
    //4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi

    private String imePrezime;
    private String sport;
    private String klub;
    private int brojDresa;

    public Sportista(String imePrezime, String sport, String klub, int brojDresa) {
        this.imePrezime = imePrezime;
        this.sport = sport;
        this.klub = klub;
        this.brojDresa = brojDresa;
    }

    public Sportista() {
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getSport() {
        return sport;
    }

    public String getKlub() {
        return klub;
    }

    public int getBrojDresa() {
        return brojDresa;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sportista: ").append(imePrezime).append(" u sportu: ").append(sport)
                .append(" igra za ").append(klub).append(" s brojem dresa: ").append(brojDresa);
        return sb.toString();
    }
}
