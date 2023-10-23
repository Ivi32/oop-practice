import java.util.ArrayList;
import java.util.List;

public class Uckenik extends Osoba{
    //Napisati klasu Ucenik koja nasledjuje klasu Osoba i ima atribute:
//- ArrayList<Double> ocene;
//
//Uvek paziti da ocena mora biti u intervalu [1.0, 5.0]
//
//Napisati 2 konstruktora:
//- Jedan koji prima sve argumente
//- Podrazumevani koja postavlja listu na novu praznu listu
//
//Napisati sve gettere i settere
//
//Napisati metode:
//1. dodajOcenu(double x) - koja dodaje ocenu x u listu ocena.
//2. promeniOcenu(double x, int i) - koja menja ocenu na indexu i u ocenu x.
//3. izbrisiOcenu(int i) - koja brise ocenu na indeksu i
//4. izbrisiOcenu(double x) - koja brise ocenu x
//5. prosek() - koja vraca ucenikov prosek. Ukoliko ucenik ima barem jednu jedinicu (bilo koji broj x, 1.0 <= x < 2.0)
//6. kakavJeDjak() - koja vraca string na sledeci nacin:
// "Nedovoljan" - ako ima barem jednu jedinicu
// "Dovoljan" - ako je prosek u intervalu [2.0, 2.5)
// "Dobar" - ako je prosek u intervalu [2.5. 3.5)
// "Vrlo dobar" - ako je prosek u intervalu [3.5, 4.5)
// "Odlican" - inace
//
//Overridovati toString() metod:
//"<ime> <prezime> <brGodina> ima ocene:
// [<ocena1>, <ocena2>, ..., <ocenaN>]
// Prosek: <prosek>"

    private List<Double> ocene;

    public Uckenik(String ime, String prezime, double brojGodina, List<Double> ocene) {
        super(ime, prezime, brojGodina);
        this.ocene = ocene;
    }

    public Uckenik() {
        this.ocene = new ArrayList<>();
    }

    public List<Double> getOcene() {
        return ocene;
    }

    public void setOcene(List<Double> ocene) {
        this.ocene = ocene;
    }
    private boolean validnaOcena(double ocena){
        if(ocena >= 1.0 && ocena <= 5.0)
            return true;
        else
            return false;
    }
    //Napisati metode:
    //1. dodajOcenu(double x) - koja dodaje ocenu x u listu ocena.
    public void dodajOcenu(double x){
        if (validnaOcena(x))
            this.ocene.add(x);
    }
    //2. promeniOcenu(double x, int i) - koja menja ocenu na indexu i u ocenu x.
    public void promeniOcenu(double x, int i){
        if (validnaOcena(x))
            this.ocene.add(i, x);
    }
    //3. izbrisiOcenu(int i) - koja brise ocenu na indeksu i
    public void izbrisiOcenu(int i){
        this.ocene.remove(i);
    }
    //4. izbrisiOcenu(double x) - koja brise ocenu x
    public void izbrisiOcenu(double x){
        if (validnaOcena(x))
            this.ocene.remove(x);
    }
    //5. prosek() - koja vraca ucenikov prosek. Ukoliko ucenik ima barem jednu jedinicu (bilo koji broj x, 1.0 <= x < 2.0)
    public double prosek(){
        double suma = 0.0;
        for (double ocena: ocene) {
            if(ocena == 1)
                return 1;

            suma += ocena;

        }
        return suma/ocene.size();
    }
    //6. kakavJeDjak() - koja vraca string na sledeci nacin:
    // "Nedovoljan" - ako ima barem jednu jedinicu
    // "Dovoljan" - ako je prosek u intervalu [2.0, 2.5)
    // "Dobar" - ako je prosek u intervalu [2.5. 3.5)
    // "Vrlo dobar" - ako je prosek u intervalu [3.5, 4.5)
    // "Odlican" - inace
    //
    public String kakavJeDjak(){
        for (double ocena: ocene) {
            if (ocena == 1.0)
                return "Nedovoljan";
        }

        double prosek = prosek();
        if (prosek >= 2.0 && prosek < 2.5)
            return "Dovoljan";
        if (prosek >= 2.5 && prosek < 3.5)
            return "Dobar";
        if (prosek >= 3.5 && prosek < 4.5)
            return "Vrlo dobar";
        if (prosek >= 4.5 && prosek <= 5.0)
            return "Odlican";

        return "Greska";
    }

    //Overridovati toString() metod:
    //"<ime> <prezime> <brGodina> ima ocene:
    // [<ocena1>, <ocena2>, ..., <ocenaN>]
    // Prosek: <prosek>"

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getIme()).append(" ")
                .append(this.getIme()).append(" ")
                .append(this.getBrojGodina()).append(" ima ocene:")
                .append("\n");

        sb.append("[");
        for (double o:this.ocene) {
            sb.append(o).append(",");
        }
        sb.append("]").append("\n");
        sb.append("Prosek: ").append(prosek());
        return sb.toString();
    }
}
