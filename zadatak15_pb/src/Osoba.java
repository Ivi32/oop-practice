public class Osoba {
    private String ime;
    private String prezime;
    private double brojGodina;

    public Osoba(String ime, String prezime, double brojGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
    }

    public Osoba() {
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public double getBrojGodina() {
        return brojGodina;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBrojGodina(double brojGodina) {
        this.brojGodina = brojGodina;
    }
}
