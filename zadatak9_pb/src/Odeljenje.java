import javax.swing.*;
import java.util.ArrayList;

public class Odeljenje {
    //Napisati klasu Odeljenje koja ima sledeca polja:
    //	- String oznaka
    //	- ArrayList dnevnik
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;
    //Napisati 2 konstruktora, opet na isti nacin.

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<>();
    }

    //Napisati gettere i settere za sva polja.

    public String getOznaka() {
        return oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    //Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.
    public void upisiUcenika(Ucenik u) {

        dnevnik.add(u);
    }

    //Napisati metod upisiUcenika(Ucenik u, int redniBroj) koji dodaje ucenika {u} u dnevnik na redni broj {redniBroj}
    public void upisiUcenika(Ucenik u, int redniBroj) {
        dnevnik.add(redniBroj, u);
    }

    //Napisati metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.
    public void ispisiUcenika(Ucenik u) {
        dnevnik.remove(u);
    }

    //Napisati metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.
    public void ispisiUcenika(int i) {
        dnevnik.remove(i);
    }

    //Napisati metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.
    public void pogledajOcene(Ucenik u) {
        System.out.println(u.toString());
    }

    //Napisati metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.
    public void pogledajOcene(int i) {

        dnevnik.get(i).toString();

    }

    //Napisati metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.1
    public void prosecnaOcena(Ucenik u) {
        System.out.println(u.prosek());
    }

    //Napisati metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.
    public void prosecnaOcena(int i) {
        System.out.println(dnevnik.get(i).prosek());

    }

    //Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).
    public double prosecnaOcenaOdeljenja() {
        if (dnevnik.isEmpty())
            return 0;
        double suma = 0;
        for (Ucenik u : dnevnik) {
            suma += u.prosek();
        }
        return suma / dnevnik.size();
    }

    //Napisati metod opisnaOcena(Ucenik u) koja ispisuje:
    //	- "Odlican"; ako je prosek ucenika {u} 4.5 ili vise
    //	- "Vrlo dobar"; ako je prosek ucenika {u} [3.5, 4.5)
    //	- "Dobar"; ako je prosek ucenika {u} [2.5, 3.5)
    //	- "Dovoljan"; ako je prosek ucenika {u} [1.5, 2.5)
    //	- "Nedovoljan"; ako ucenik {u} ima barem jednu jedinicu
    public void opisnaOcena(Ucenik u) {
        if (u.prosek() == 1) {
            System.out.println("Nedovoljan");
            return;
        } else if (u.prosek() >= 4.5) {
            System.out.println("Odlican.");
            return;
        } else if (u.prosek() < 4.5 && u.prosek() >= 3.5) {
            System.out.println("Vrlodobar");
            return;
        } else if (u.prosek() < 3.5 && u.prosek() >= 2.5) {
            System.out.println("Dobar");
            return;
        } else if (u.prosek() < 2.5 && u.prosek() >= 1.5) {
            System.out.println("Dovoljan");
            return;
        }
        System.out.println("Nije moguce odrediti prosek.");

    }

    //Napisati metod izlistajDnevnik() koja vraca String oblika:
    //	{ime} i {prezime} ima ocene:
    //	{ocene}
    //za sve ucenike.
    public String izlistajDnevnik() {
        StringBuilder sb = new StringBuilder();
        for (Ucenik u : dnevnik) {
           sb.append(u.toString());
        }
        return sb.toString();
    }

    //Napisati metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:
    //	- "Veliko odeljenje"; ako ima vise od 25 ucenika
    //	- "Srednje odeljenje"; ako ima ucenika izmedju 15 i 25
    //	- "Malo odeljenje"; ako ima ucenika manje od 15
    public String velicinaOdeljenja() {
        if (dnevnik.size() > 25)
            return "Veliko odeljenje";
        if (dnevnik.size() <= 25 && dnevnik.size() >= 15)
            return "Srednje odeljenje";
        if (dnevnik.size() < 15)
            return "Malo odeljenje";
        return "Greska";
    }
    //Napisati toString() metod:
    //	{Oznaka} odeljenja ima djake:
    //	{Ime1} {Prezime1}
    //	{Ime2} {Prezime2}
    //	.
    //	.
    //	.
    //	{ImeN} {PrezimeN}


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka).append(" odeljenja ima djake: ").append("\n");
        for (Ucenik u : dnevnik) {
            sb.append(u.getIme()).append(" ").append(u.getPrezime()).append("\n");
        }
        return sb.toString();
    }
}

