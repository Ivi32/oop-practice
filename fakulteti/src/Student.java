import java.util.ArrayList;
import java.util.List;

public class Student {
    //Kreirati Klasu Student koja ima sledece parametre:
    //-(String) Ime
    //-(List<Integer>) Listu ocena
    //-(int) Trenutnu godinu studiranja
  private String ime;
  private List<Integer> listaOcena;
  private int trenutnaGodinaStudiranja;

    public Student(String ime, List<Integer> listaOcena, int trenutnaGodinaStudiranja) {
        this.ime = ime;
        this.listaOcena = listaOcena;
        this.trenutnaGodinaStudiranja = trenutnaGodinaStudiranja;
    }

    public Student() {
    }

    public String getIme() {
        return ime;
    }

    public List<Integer> getListaOcena() {
        return listaOcena;
    }

    public int getTrenutnaGodinaStudiranja() {
        return trenutnaGodinaStudiranja;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setListaOcena(List<Integer> listaOcena) {
        this.listaOcena = listaOcena;
    }

    public void setTrenutnaGodinaStudiranja(int trenutnaGodinaStudiranja) {
        this.trenutnaGodinaStudiranja = trenutnaGodinaStudiranja;
    }

    //Takodje poseduje metodu prosek() koja vraca prosek svih njegovih ocena;
    
    public double prosek(){
        double suma = 0;
        for (int ocena:listaOcena) {
            suma += ocena;
        }
        return suma/listaOcena.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ").append(ime).append(" je na ").append(trenutnaGodinaStudiranja)
                .append(" godini studiranja ").append("\n")
                .append("Ocene su mu/joj: ").append(listaOcena);
        return sb.toString();
    }
}
