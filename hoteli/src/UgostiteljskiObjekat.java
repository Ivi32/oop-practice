import java.util.ArrayList;
import java.util.List;

public abstract class UgostiteljskiObjekat implements Ugostljivo{
    //Napisati abstraktnu klasu UgostiteljskiObjekat koji implementira interfejs Ugostljivo i ima naredne atribute:
    //- String naziv
    //- List<Radnik> radnici
    private String naziv;
    private List<Radnik> radnici;
    //Napisati konstruktore:
    //- Jedan potpun konstruktor koji prima sve argumente
    //- Jedan konstruktor koji prima String naziv a radnike postavlja na novu praznu ArrayList-u
    //- Jedan konstruktor koji prima Listu radnika a naziv postavlja na prazan String

    public UgostiteljskiObjekat(String naziv, List<Radnik> radnici) {
        this.naziv = naziv;
        this.radnici = radnici;
    }

    public UgostiteljskiObjekat(String naziv) {
        this.naziv = naziv;
        this.radnici = new ArrayList<>();
    }

    public UgostiteljskiObjekat(List<Radnik> radnici) {
        this.radnici = radnici;
        this.naziv = "";
    }

    //Enkapsulirati sve podatke i napisati gettere i settere za sva polja

    public String getNaziv() {
        return naziv;
    }

    public List<Radnik> getRadnici() {
        return radnici;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setRadnici(List<Radnik> radnici) {
        this.radnici = radnici;
    }

    //Napisati metode:
    //- public String ispisiRadnike()
    // Za svakog radnika vrsi njegovu serilizaciju.
    // Serilizaciju svakog radnika vrsiti u novom redu po principu:
    //"<Serilizacija 1. radnika>
    // <Serilizacija 2. radnika>
    // ....
    // <Serilizacija N. radnika>"

    //- public double ukupnaPlata() //Vraca ukupnu platu svih svojih radnika
    public double ukupnaPlata(){
        double suma = 0;
        for (Radnik r:radnici) {
            suma += r.getPlata();
        }
        return suma;
    }

    public String ispisiRadnike(){
        StringBuilder sb = new StringBuilder();
        for (Radnik r:radnici) {
            sb.append(r.toString()).append("\n");
        }
        return sb.toString().substring(0, sb.toString().length()-1);
    }
    //Napisati abstraktne metode:
    //- public abstract double bruto(); //Vraca bruto zaradu UgostiteljskogObjekta
    //- public abstract double neto(); //Vraca neto zaradu UgostiteljskogObjekta
    public abstract double bruto();
    public abstract double neto();
    //Serilizovati klasu na sledeci nacin:
    //"<naziv> | brojZaposlenih: <brojZaposlenihRadnika>"

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append(" | ").append("brojZaposlenih: ").append(radnici.size());
        return sb.toString();
    }
}
