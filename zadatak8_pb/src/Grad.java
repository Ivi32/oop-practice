public class Grad {
    //Napisati klasu grad koja ima sledece polja/atribute
    //	- ime(String)
    //	- brojStanovnika(int)
    //	- drzava(String)
    //Napisati sledece metode
    //	konstruktor - samo jedan, ( sva polja su obavezna)
    //	getter i setter
    //	toString
    //		Ime grada: <ime>
    //		Broj stanovnika: <brojStanovnika>
    //		Drzava: <drzava>

    private String ime;
    private int brojStanovnika;
    private String drzava;

    public Grad(String ime, int brojStanovnika, String drzava) {
        this.ime = ime;
        this.brojStanovnika = brojStanovnika;
        this.drzava = drzava;
    }

    public String getIme() {
        return ime;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Ime grada: ").append(ime).append("\n");
       sb.append("Broj stanovnika: ").append(brojStanovnika).append("\n");
       sb.append("Drzava: ").append(drzava);

       return sb.toString();

    }
}
