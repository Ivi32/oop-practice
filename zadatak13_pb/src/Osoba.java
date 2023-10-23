public class Osoba {
    //Napisati klasu Osoba kao i do sada. (Mozete iskoristiti vec napisanu)
    private String ime;
    private String prezime;
    private int brojGodina;

    public Osoba(String ime, String prezime, int brojGodina) {
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

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Osoba: ").append(ime).append(" ").append(prezime).append(" ");
        sb.append("Broj godina: ").append(brojGodina);
        return sb.toString();
    }
}
