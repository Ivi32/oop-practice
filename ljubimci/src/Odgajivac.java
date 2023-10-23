import java.util.ArrayList;

public class Odgajivac extends Vlasnik {
    //Napisati Klasu Odgajivac koji nasledjuje klasu Vlasnik i ima atribute:
    //- String kategorija
    private String kategorija;

    //Napisati sve potrebne konstruktore

    public Odgajivac(String ime, String prezime, int brojGodina, ArrayList<Ljubimac> ljubimci, String kategorija) {
        super(ime, prezime, brojGodina, ljubimci);
        this.kategorija = kategorija;
    }

    public Odgajivac() {
        this.kategorija = "";
    }

    //Napisati sve gettre i settere

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    //Napisati metode:
    //1. ispisiSveLjubimceKojeOdgajas() - koja ispisuje sve ljubimce koje odgajivac odgaja.
    public void ispisiSveLjubimceKojeOdgajas() {
        StringBuilder sb = new StringBuilder();
        sb.append("Svi ljubimci koje odgaja odgajivac:").append("\n");
        sb.append(super.toString());
    }

    //2. vratiSveLjubimceKojeOdgajas() - koja vraca ArrayListu ljubimaca koje odgajivac odgaja.
    //Odgajivac odgaja one ljubimce ciji se tip poklapa sa Kategorijom odgajivaca
    //(npr Odgajivac.kategorija = "Pas", Ljubimac.red = "Pas")
    public ArrayList<Ljubimac> vratiSveLjubimceKojeOdgajas() {
        ArrayList<Ljubimac> ljubimciOdgajivaca = new ArrayList<>();
        for (Ljubimac lj : this.getLjubimci()) {
            if (lj.getRed().equalsIgnoreCase(this.kategorija))
                ljubimciOdgajivaca.add(lj);
        }
        return ljubimciOdgajivaca;
    }
    //Overridovati toString() metod:
    //"<ime> <prezime> <brojGodina> ima ljubimce:
    // <ljubimac1.toString()>
    // ...
    // <ljubimacN.toString()>
    // A odgaja ljubimce:
    // <ljubimacKojegOdgajas1.toString()>
    // ...
    // <ljubimacKojegOdgajasK.toString()>"


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return super.toString();
    }
}