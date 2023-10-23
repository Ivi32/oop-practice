import java.util.ArrayList;

public class Vlasnik extends Osoba{
    //Napisati klasu Vlasnik koja ima atribute:
    //- ArrayListLjubimac> ljubimci
    private ArrayList<Ljubimac> ljubimci;

    //Napraviti jedan pun konstruktor i jedan konstruktor koji ne prima
    //ArrayListu, vec kreira sam novu, praznu ArrayListu

    public Vlasnik(String ime, String prezime, int brojGodina, ArrayList<Ljubimac> ljubimci) {
        super(ime, prezime, brojGodina);
        this.ljubimci = ljubimci;
    }

    public Vlasnik() {
        this.ljubimci = new ArrayList<>();
    }

    //Napisati sve gettere i ssettere

    public ArrayList<Ljubimac> getLjubimci() {
        return ljubimci;
    }

    public void setLjubimci(ArrayList<Ljubimac> ljubimci) {
        this.ljubimci = ljubimci;
    }

    //Napisati metode:
    //1. dodajLjubimca - koja dodaje ljubimca u listu ljubimaca
    public void dodajLjubimca(Ljubimac ljubimac){
        ljubimci.add(ljubimac);
    }
    //2. oduzmiLjubimca - koja oduzima ljubimca iz liste ljubimaca
    public void oduzmiLjubimca (Ljubimac ljubimac){
        for (Ljubimac lj:ljubimci) {
            if(lj.getIme().equalsIgnoreCase(ljubimac.getIme()) && lj.getRed().equalsIgnoreCase(ljubimac.getRed())) {
                ljubimci.remove(lj);
                return;
            }
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
        sb.append(super.toString()).append(" ima ljubimce:").append("\n");
        for (Ljubimac lj:ljubimci) {
            sb.append(lj.toString()).append("\n");
            sb.append("\n");
        }
        return sb.toString().substring(0, sb.toString().length()-1);
    }
}
