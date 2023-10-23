public class Osoba {
    private String ime;
    private String prezime;
    private int brojGodine;

    public Osoba(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodine = godine;
    }

    public Osoba() {
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojGodine() {
        return brojGodine;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBrojGodine(int brojGodine) {
        this.brojGodine = brojGodine;
    }

}
