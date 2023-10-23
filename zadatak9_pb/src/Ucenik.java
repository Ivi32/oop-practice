import java.sql.Array;
import java.util.ArrayList;

public class Ucenik {
    //Napisati klasu Ucenik koja ima sledeca polja:
    //	- String ime
    //	- String prezime
    //	- ArrayList ocene
    //
    //Napisati 2 konstruktora, jedan koji prima argumente za sva polja, a drugi koji prima ime i prezime,
    // a ocene postavlja na praznu listu.
    //Napisati gettere i settere za sva polja.
    //Napisati toString() metod:
    //	{ime} i {prezime} ima ocene:
    //	{ocene}
    //Napisati metod proske koji racuna prosek Ucenika.

    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene;

    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }

    public double prosek(){
        for (int o:ocene) {
         if(o==1)
             return 1;
        }
        int suma = 0;
        for (int o:ocene) {
            suma += o;
        }
            return (double)suma/ocene.size();
        }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append(" ima ocene:").append("\n");
        for (int o:ocene) {
            sb.append(o).append("\n");
        }
        return sb.toString();
    }
}
