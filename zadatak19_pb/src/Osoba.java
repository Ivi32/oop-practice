public class Osoba implements Pokretljivo {
    //Napisati klasu Osoba koja implementuje interfejs Porketljivo i ima atribute
    //- String ime, prezime
    //- int brojGodina
    //
    //Napisati sve odgovarajuce konstruktore i gettere i settere
    //
    //Osoba se pokrece tako sto ispisuje poruku "Setam"
    //Osoba trosi "Kalorija" kao gorivo
    //
    //
    //
    //Overridovati toString() metod:
    //"<ime> <prezime> <brGodina>"
    //
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
    public void pokreniSe() {
        System.out.println("setam");
    }

    @Override
    public String potrosnja() {
        return "kalorija";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append(" ").append(brojGodina);
        return sb.toString();
    }
}
