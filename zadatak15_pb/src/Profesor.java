import java.util.ArrayList;
import java.util.List;

public class Profesor extends Osoba{
    ////Napisati klasu Profesor koja prosiruje klasu Osoba i ima atribute:
    ////- ArrayList<String> predmetiKojePredaje;
    ////
    ////Napisati 2 konstruktora:
    ////- Jedan koji prima sve argumente
    ////- Podrazuemvani koji postavlja listu predmeta na novu praznu listu
    ////
    ////Napisati sve gettere i settere
    ////
    ////Napisati metode:
    ////1. add(String predmet) - koja dodaje predmet na listu predmete
    ////2. add(String predmet, int i) - koja postavlja predmet na index i u listi predmeta
    ////3. addAll(ArrayList<String> predmeti) - koja postavlja sve predmete iz prosledjene liste na listu predmeta koje profesor predaje
    ////4. remove(int i) - koja brise predmet sa indeksa i iz liste predmeta
    ////5. remove(String predmet) - koja brise predmet sa istim imenom iz liste predmeta kao prosledjeni predmet
    ////
    ////Omoguciti da mozemo porediti dva objekta ove klase.
    ////
    ////Overridovati toString() metod:
    ////"<ime> <prezime> <brojGodina> je profesor i predaje:
    //// [<predmet1>, ..., <predmetN>]"

    private List<String> predmetiKojePredaje;

    public Profesor(String ime, String prezime, double brojGodina, List<String> predmetiKojePredaje) {
        super(ime, prezime, brojGodina);
        this.predmetiKojePredaje = predmetiKojePredaje;
    }

    public Profesor() {
        this.predmetiKojePredaje = new ArrayList<>();
    }

    public List<String> getPredmetiKojePredaje() {
        return predmetiKojePredaje;
    }

    public void setPredmetiKojePredaje(List<String> predmetiKojePredaje) {
        this.predmetiKojePredaje = predmetiKojePredaje;
    }

    //Napisati metode:
    //1. add(String predmet) - koja dodaje predmet na listu predmete
    public void add(String predmet){
        this.predmetiKojePredaje.add(predmet);
    }
    //2. add(String predmet, int i) - koja postavlja predmet na index i u listi predmeta
    private void  add(String predmet, int i){
        this.predmetiKojePredaje.add(i,predmet);
    }

    //3. addAll(ArrayList<String> predmeti) - koja postavlja sve predmete
    // iz prosledjene liste na listu predmeta koje profesor predaje

    public void addAll(List<String> predmenti){
        this.predmetiKojePredaje.addAll(predmenti);
    }
    //4. remove(int i) - koja brise predmet sa indeksa i iz liste predmeta
    public void  remove(int i){
        this.predmetiKojePredaje.remove(i);
    }
    //5. remove(String predmet) - koja brise predmet sa istim imenom iz liste predmeta kao prosledjeni predmet
    private void remove(String predmeti){
        this.predmetiKojePredaje.remove(predmeti);
    }
    //
    //Omoguciti da mozemo porediti dva objekta ove klase.
    //
    //Overridovati toString() metod:
    //"<ime> <prezime> <brojGodina> je profesor i predaje:
    // [<predmet1>, ..., <predmetN>]"

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getIme()).append(" ")
                .append(this.getPrezime()).append(" ")
                .append(this.getBrojGodina()).append(" je profesor i predaje:")
                .append("\n");
        sb.append("[");
        for (String p : this.predmetiKojePredaje) {
            sb.append(p.toString()).append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
