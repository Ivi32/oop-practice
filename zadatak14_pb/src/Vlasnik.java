import java.util.ArrayList;
import java.util.List;

public class Vlasnik extends Osoba{
    ////Napisati klasu Vlasnik koja ima atribute:
    ////- ArrayListLjubimac> ljubimci
    ////
    ////Napraviti jedan pun konstruktor i jedan konstruktor koji ne prima
    ////ArrayListu, vec kreira sam novu, praznu ArrayListu
    ////
    ////Napisati sve gettere i ssettere
    ////
    ////Napisati metode:
    ////1. dodajLjubimca - koja dodaje ljubimca u listu ljubimaca
    ////2. oduzmiLjubimca - koja oduzima ljubimca iz liste ljubimaca
    ////
    ////Overridovati toString() metod:
    ////"<ime> <prezime> <brojGodina> ima ljubimce:
    //// <ljubimac1.toString()>
    //// ...
    //// <ljubimacN.toString()>"

    private List<Ljubimac> ljubimci;

    //Napraviti jedan pun konstruktor i jedan konstruktor koji ne prima
    ////ArrayListu, vec kreira sam novu, praznu ArrayListu

    public Vlasnik(String ime, String prezime, int godine, List<Ljubimac> ljubimci) {
        super(ime, prezime, godine);
        this.ljubimci = ljubimci;
    }

    public Vlasnik() {
        this.ljubimci = new ArrayList<>();
    }

    //Napisati sve gettere i ssettere
    public List<Ljubimac> getLjubimci() {
        return ljubimci;
    }

    public void setLjubimci(List<Ljubimac> ljubimci) {
        this.ljubimci = ljubimci;
    }

    //Napisati metode:
    //1. dodajLjubimca - koja dodaje ljubimca u listu ljubimaca
    public void dodajLjubimca(Ljubimac ljubimac){
        this.ljubimci.add(ljubimac);
    }
    //2. oduzmiLjubimca - koja oduzima ljubimca iz liste ljubimaca
    public void  oduzmiLjubimca(Ljubimac ljubimac){
        //this.ljubimci.remove(ljubimac);
        for (Ljubimac ljubimac1: this.ljubimci) {
            if (ljubimac1.getIme().equalsIgnoreCase(ljubimac.getIme()))
                this.ljubimci.remove(ljubimac1);
        }
    }

    //Overridovati toString() metod:
    //"<ime> <prezime> <brojGodina> ima ljubimce:
    // <ljubimac1.toString()>
    // ...
    // <ljubimacN.toString()>"

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getIme()).append(" ")
                .append(this.getPrezime()).append(" ")
                .append(this.getBrojGodine()).append(" ")
                .append("ima ljubimace:").append("\n");

        for (Ljubimac ljubimac: ljubimci) {
            sb.append(ljubimac.toString()).append("\n");
        }

        return sb.toString();
    }
}
