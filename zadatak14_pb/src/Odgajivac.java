import java.util.ArrayList;
import java.util.List;

public class Odgajivac extends Vlasnik{
    //Napisati Klasu Odgajivac koji nasledjuje klasu Vlasnik i ima atribute:
//- String kategorija
//
//Napisati sve potrebne konstruktore
//
//Napisati sve gettre i settere
//
//Napisati metode:
//1. ispisiSveLjubimceKojeOdgajas() - koja ispisuje sve ljubimce koje odgajivac odgaja.
//2. vratiSveLjubimceKojeOdgajas() - koja vraca ArrayListu ljubimaca koje odgajivac odgaja.
//Odgajivac odgaja one ljubimce ciji se tip poklapa sa Kategorijom odgajivaca
//(npr Odgajivac.kategorija = "Pas", Ljubimac.red = "Pas")
//
//Overridovati toString() metod:
//"<ime> <prezime> <brojGodina> ima ljubimce:
// <ljubimac1.toString()>
// ...
// <ljubimacN.toString()>
// A odgaja ljubimce:
// <ljubimacKojegOdgajas1.toString()>
// ...
// <ljubimacKojegOdgajasK.toString()>"

    private String kategorija;

    public Odgajivac(String ime, String prezime, int godine, List<Ljubimac> ljubimci, String kategorija) {
        super(ime, prezime, godine, ljubimci);
        this.kategorija = kategorija;
    }

    public Odgajivac() {
        this.kategorija = "";
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    //Napisati metode:
    //1. ispisiSveLjubimceKojeOdgajas() - koja ispisuje sve ljubimce koje odgajivac odgaja.
    private void ispisiSveLjubimceKojeOdgajas() {
        StringBuilder sb = new StringBuilder();
        System.out.printf("Ljubimce koj odgaja su:").append("\n");
        for (Ljubimac ljubimac: this.getLjubimci()) {
            if (ljubimac.getRed().equalsIgnoreCase(this.kategorija));
            sb.append(ljubimac).append("\n");
        }
    }
    //2. vratiSveLjubimceKojeOdgajas() - koja vraca ArrayListu ljubimaca koje odgajivac odgaja.
    //Odgajivac odgaja one ljubimce ciji se tip poklapa sa Kategorijom odgajivaca
    //(npr Odgajivac.kategorija = "Pas", Ljubimac.red = "Pas")
    public List<Ljubimac> vratiSveLjubimceKojeOdgajas()
    {
        List<Ljubimac> ljubimciKojeOdgaja = new ArrayList<>();
        for (Ljubimac ljubimac: this.getLjubimci()) {
            if (ljubimac.getRed().equalsIgnoreCase(this.kategorija))
                ljubimciKojeOdgaja.add(ljubimac);
        }
        return ljubimciKojeOdgaja;
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
        sb.append(super.toString());
        sb.append("A odgaja ljubimce:");
        for (Ljubimac ljubimac : vratiSveLjubimceKojeOdgajas()) {
            sb.append(ljubimac.toString());
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }
}
