
import java.util.List;

//Napisati Klasu Gimnazijalac koja nasledjuje klasu Ucenik i ima atribute:
//- String maturski
//
//Napraviti 2 konstruktora:
//- Jedan koji prima sve argumente
//- Podrazumevani koji postavlja maturski na ""
//
//Paziti da prilikom kreiranja Gimnazijalca broj godina mora biti u intervalu [15, 19].
//Ukoliko se prosledi nevalidan broj godina, postaviti ih na 15
//
//Napisati sve gettere i settere
//
//Overridovati metod prosek() tako da na svaku ocenu oduzima 0.1 prilikom racunajna proseka, pazeci da se ne predje donja granica od 1.0 po oceni.
//
//Overridovati toString() metod:
//"<ime> <prezime> <brojGodima> pohadja gimnaziju.
// Ocene: [<ocena1>, <ocena2>, ..., <ocenaN>]
// Prosek: <prosek>"{
public class Gimnazija extends Uckenik{
    private String maturski;

    public Gimnazija(String ime, String prezime, double brojGodina, List<Double> ocene, String maturski) {
        super(ime, prezime, (brojGodina >= 15 || brojGodina <= 19 ? brojGodina : 15), ocene);
        this.maturski = maturski;
    }

    public Gimnazija() {
        this.maturski = "";
    }

    public String getMaturski() {
        return maturski;
    }

    public void setMaturski(String maturski) {
        this.maturski = maturski;
    }

    @Override
    public void setBrojGodina(double brojGodina) {
        super.setBrojGodina(vratiKorigovanBrojGodina(brojGodina));
    }

    private double vratiKorigovanBrojGodina(double brojGodina){
        return validanBrojGodina(brojGodina) ? brojGodina : 15;
    }
    private boolean validanBrojGodina(double brojGodina){
        return brojGodina >= 15 || brojGodina <= 19;
    }

    //Overridovati metod prosek() tako da na svaku ocenu oduzima 0.1 prilikom racunajna proseka, pazeci da se ne predje donja granica od 1.0 po oceni.
    @Override
    public double prosek() {
        double suma = 0.0;
        for (double ocena: getOcene()) {
            if (ocena>=2.1 && ocena <=5)
                ocena-=0.1;
            if (ocena >=2.0)
                suma += ocena;
        }
        return suma/getOcene().size();
    }

    //Overridovati toString() metod:
    //"<ime> <prezime> <brojGodima> pohadja gimnaziju.
    // Ocene: [<ocena1>, <ocena2>, ..., <ocenaN>]
    // Prosek: <prosek>"

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getIme()).append(" ")
                .append(this.getIme()).append(" ")
                .append(this.getBrojGodina()).append(" pohadja gimnaziju")
                .append("\n");

        sb.append("Ocene: [");
        for (double o:this.getOcene()) {
            sb.append(o).append(",");
        }
        sb.append("]").append("\n");
        sb.append("Prosek: ").append(prosek());
        return sb.toString();
    }

}
