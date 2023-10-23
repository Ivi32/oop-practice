import java.util.ArrayList;
import java.util.List;

//Napisati klasu Student koja nasledjuje klasu Ucenik i ima atribute:
//- ArrayList<String> predmeti
//- ArrayList<Profesor> profesori
//
//Napraviti 2 konstrutkora:
//- Jedan oji prima sve argumente
//- Podrazumevani koji ne prima ni jedan argument i postavlja ove 2 liste na nove prazne ArrayListe.
//
//Napisati sve gettere i settere
//
//Napisati metode:
//1. addPredmet(String s)
//2. addPredmet(String s, int i)
//3. addProfesor(Profesor p)
//4. addProfesor(Profesor p, int i)
//5. removePredmet(String s)
//6. removeProfesor(Profesor p) - Paziti da ovakav profesor postoji u listi! Ako ne postoji, ne raditi nista
//
//Overridovati toString() metod:
//"<ime> <prezime> <brGodina> je student i pohadja predmete:
// <predmet1.toString()>
// ...
// <predmetN.toString()>
// Ovom studentu predaju profesori:
// <profesor1.toString()>
// ...
// <profesorK.toString()>"
public class Student extends Uckenik{

    private List<String> predmeti;
    private List<Profesor> profesori;

    public Student(String ime, String prezime, double brojGodina, List<Double> ocene, List<String> predmeti) {
        super(ime, prezime, brojGodina, ocene);
        this.predmeti = predmeti;
    }

    public Student() {
        this.predmeti = new ArrayList<>();
        this.profesori = new ArrayList<>();
    }

    public List<String> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(List<String> predmeti) {
        this.predmeti = predmeti;
    }

    public List<Profesor> getProfesori() {
        return profesori;
    }

    public void setProfesori(List<Profesor> profesori) {
        this.profesori = profesori;
    }

    //Napisati metode:
    //1. addPredmet(String s)
    public void addPredmet(String s){
        this.predmeti.add(s);
    }
    //2. addPredmet(String s, int i)
    public void addPredmet(String s, int i){
        this.predmeti.add(i,s);
    }
    //3. addProfesor(Profesor p)
    public void addProfesor(Profesor p){
        this.profesori.add(p);
    }
    //4. addProfesor(Profesor p, int i)
    public void addProfesor(Profesor p, int i){
        this.profesori.add(i, p);
    }
    //5. removePredmet(String s)
    public void removePredmet(String s){
        this.predmeti.remove(s);
    }
    //6. removeProfesor(Profesor p) - Paziti da ovakav profesor postoji u listi! Ako ne postoji, ne raditi nista
    public void removeProfesor(Profesor p){
        for (Profesor pul: this.profesori) {
            if (pul.getIme().equalsIgnoreCase(p.getIme()) && pul.getPrezime().equalsIgnoreCase(p.getPrezime()))
                this.profesori.remove(pul);
        }
    }
    //
    //Overridovati toString() metod:
    //"<ime> <prezime> <brGodina> je student i pohadja predmete:
    // <predmet1.toString()>
    // ...
    // <predmetN.toString()>
    // Ovom studentu predaju profesori:
    // <profesor1.toString()>
    // ...
    // <profesorK.toString()>"
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getIme()).append(" ")
                .append(this.getIme()).append(" ")
                .append(this.getBrojGodina()).append(" je student i pohadja predmete:")
                .append("\n");

        for (String p:this.getPredmeti()) {
            sb.append(p).append("\n");
        }

        sb.append("Ovom studentu predaju profesori:");
        for (Profesor p:this.getProfesori()) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}
