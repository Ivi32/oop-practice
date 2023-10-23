public class Osoba {
    //Napisati klasu Osoba koja ima atribute:
    //- String ime, prezime;
    //- int brojGodina;
    private String ime;
    private String prezime;
    private int brojGodina;

    //Napisati jedan potpun konstruktor koji prima sve argumente
    // i jedan prazan konstruktor koji postavlja ime i prezime na prazan String a brojGodina na 18

    public Osoba(String ime, String prezime, int brojGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
    }

    public Osoba() {
        this.ime = "";
        this.prezime = "";
        this.brojGodina =18;
    }

    //Enkapsulirati sve podatke i napisati gettere i settere za sva polja

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

    //Napisati metode:
    //- public boolean jednaki(Osoba o)
    // Vraca true ako je prosledjena osoba jednaka ovoj (this) osobi.
    // Dve osobe su jednake ako su im svi atributi isti

    public boolean jednaki(Osoba o){
        /*if(this.equals(o))
            return true;
        else
            return false;*/
        if( this.ime.equalsIgnoreCase(o.getIme())
                && this.prezime.equalsIgnoreCase(o.getPrezime())
                 && this.brojGodina == o.getBrojGodina())
            return true;
        else
            return false;
    }

    //Serilizovati klasu na sledeci nacin:
    //"<ime> <prezime> (<brojGodina>)"

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime)
                .append(" ").append("(").append(brojGodina).append(")");
        return sb.toString();
    }

}
