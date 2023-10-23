import java.util.ArrayList;
import java.util.List;

//Napisati klasu Osnovac koja prosiruje klasu Ucenik i ima atribute:
//- ArrayList<String> bojice
//
//Napraviti 2 konstruktora:
//- Jedan koji prima sve atribute
//- Podrazumevani koji postavlja bojice na novu praznu ArrayListu
//
//Paziti da prilikom kreiranja Osnovca broj godina mora biti u intervalu [7, 14]
//Ukoliko se nevalidan broj godina proseldi, postaviti ih na 7
//
//Napisati sve gettere i settere
//
//Napisati metode:
//1. dodajBojicu(String b) - koja dodaje bojicu na listu bojica
//2. dodajBojicu(String b, int i) - koja postavlja bojicu u listu bojica na indeks i
//3. ukloniBojicu(String b) - koja ukljanja bojicu b sa liste bojica
//4. ukloniBojicu(int i) - koja ukljanja bojicu sa indexa i.
//
//Overridovati metod prosek() tako da na svaku ocenu dodati 0.3 prilikom racunanja proseka, pazeci da se ne predje gornja granica od 5.0 po oceni
//
//Overridovati toString() metod:
//"<ime> <prezime> <brojGodima> pohadja osnovnu skolu.
// Ocene: [<ocena1>, <ocena2>, ..., <ocenaN>]
// Prosek: <prosek>"{
public class Osnovac extends Uckenik{
    private List<String> bojice;

    public Osnovac(String ime, String prezime, double brojGodina, List<Double> ocene, List<String> bojice) {
        super(ime, prezime, (brojGodina >= 7 || brojGodina <= 14 ? brojGodina : 7), ocene);
        this.bojice = bojice;
    }

    public Osnovac() {
        this.bojice= new ArrayList<>();
    }

    @Override
    public void setBrojGodina(double brojGodina) {
        super.setBrojGodina(vratiKorigovanBrojGodina(brojGodina));
    }

    private double vratiKorigovanBrojGodina(double brojGodina){
        return validanBrojGodina(brojGodina) ? brojGodina : 7;
    }
    private boolean validanBrojGodina(double brojGodina){
        return brojGodina >= 7 || brojGodina <= 14;
    }

    public List<String> getBojice() {
        return bojice;
    }

    public void setBojice(List<String> bojice) {
        this.bojice = bojice;
    }

    //Napisati metode:
    //1. dodajBojicu(String b) - koja dodaje bojicu na listu bojica
    public void dodajBojicu(String b){
        this.bojice.add(b);
    }
    //2. dodajBojicu(String b, int i) - koja postavlja bojicu u listu bojica na indeks i
    public void dodajBojicu(String b, int i){
        this.bojice.add(i,b);
    }
    //3. ukloniBojicu(String b) - koja ukljanja bojicu b sa liste bojica
    public void ukloniBojicu(String b){
        this.bojice.remove(b);
    }
    //4. ukloniBojicu(int i) - koja ukljanja bojicu sa indexa i.
    public void ukloniBojicu(int i){
        this.bojice.remove(i);
    }
    //
    //Overridovati metod prosek() tako da na svaku ocenu dodati 0.3 prilikom racunanja proseka,
    // pazeci da se ne predje gornja granica od 5.0 po oceni

    @Override
    public double prosek() {
        double suma = 0.0;
        for (double ocena: getOcene()) {
            if (ocena>=2 && ocena <=4.7)
                ocena+=0.3;
            if (ocena >= 2.0)
                suma += ocena;
        }
        return suma/getOcene().size();
    }


    //Overridovati toString() metod:
    //"<ime> <prezime> <brojGodima> pohadja osnovnu skolu.
    // Ocene: [<ocena1>, <ocena2>, ..., <ocenaN>]
    // Prosek: <prosek>"

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getIme()).append(" ")
                .append(this.getIme()).append(" ")
                .append(this.getBrojGodina()).append(" pohadja osnovnu skolu")
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
