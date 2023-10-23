import javax.swing.plaf.PanelUI;
import java.awt.desktop.AboutEvent;
import java.util.ArrayList;

public class Kupac {
    //Napisati klasu Kupac koja sadrzi polja:
    //	- Osoba kupac
    //	- double racun (novac sa kojim kupac raspolaze)
    //	- Korpa kopra (korpa nekog kupca)
    //	- ArrayList filmovi (filmovi koje je kupac kupio)
    //
    //Napraviti konstruktor koji pravi novog kupca i postavlja da su korpa i filmovi koje vec poseduje prazni.
    //Omoguciti da kupac moze da ubacuje i izbacuje filmove iz korpe, kao i da pregleda njen sadrzaj.
    //Napisati metodu kupi() - kupuje sve filmove iz korpe i smesta ih u listu filmova,
    // ako kupac ima dovoljno novca za to i ispisuje:
    //	"Uspesno kupljeno {brojStavki} filmova".
    //	U suprotnom ispisuje poruku:
    //	"Nemate dovoljno novca!
    //	 Potrebno: {ukupnaCenaKorpe}
    //	 Na raspolaganju: {racun}"
    //Napisati metodu pregledajFilmove() - ispisuje sve filmove koje kupac poseduje:
    //	"{nazivFilma1} {brojKopijaFilma1}"
    //	.
    //	.
    //	.
    //	"{nazivFilmaN} {brojKopijaFilmaN}"
    //	"Ukupno filmova: {brojFilmova}"
    //	"Ukupna duzina trajanja: {sati} : {minuti} : {sekunde}"

    private Osoba kupac;
    private double racun;
    private Korpa korpa;
    private ArrayList<Film> filmovi;

    public Kupac(Osoba kupac, double racun, Korpa korpa, ArrayList<Film> filmovi) {
        this.kupac = kupac;
        this.racun = racun;
        this.korpa = new Korpa();
        this.filmovi = new ArrayList<>();
    }

    public Osoba getKupac() {
        return kupac;
    }

    public double getRacun() {
        return racun;
    }

    public Korpa getKorpa() {
        return korpa;
    }

    public ArrayList<Film> getFilmovi() {
        return filmovi;
    }

    public void setKupac(Osoba kupac) {
        this.kupac = kupac;
    }

    public void setRacun(double racun) {
        this.racun = racun;
    }

    public void setKorpa(Korpa korpa) {
        this.korpa = korpa;
    }

    public void setFilmovi(ArrayList<Film> filmovi) {
        this.filmovi = filmovi;
    }
    //Omoguciti da kupac moze da ubacuje i izbacuje filmove iz korpe, kao i da pregleda njen sadrzaj.
    public void ubaciUKorpu(Film f){
        korpa.dodajFilmUKorpu(f);
    }

    public void izbaciIzKorpe(Film f){
        korpa.izbaciIzKorpe(f);
    }

    public void pregledajsadrzajKorpe(){
        korpa.ispisiInventarKorpe();
    }
    //Napisati metodu kupi() - kupuje sve filmove iz korpe i smesta ih u listu filmova,
    // ako kupac ima dovoljno novca za to i ispisuje:
    //	"Uspesno kupljeno {brojStavki} filmova".
    //	U suprotnom ispisuje poruku:
    //	"Nemate dovoljno novca!
    //	 Potrebno: {ukupnaCenaKorpe}
    //	 Na raspolaganju: {racun}"

    public void kupi(){
        StringBuilder sb = new StringBuilder();
        if (korpa.getUkupnaCena() <= this.racun){
            //this.filmovi = korpa.getKorpa();
            for (Film f: korpa.getKorpa()) {
                filmovi.add(f);
            }
            sb.append("Uspesno kupljeno ")
                    .append(filmovi.size())
                    .append(" filmova");
            korpa.izbaciSveIzKorpe();
        }else {
            sb.append("Nemate dovoljno novca!")
                    .append("Potrebno: ")
                    .append(korpa.getUkupnaCena())
                    .append("Na raspolaganju: ")
                    .append(this.racun);
        }
    }

    //Napisati metodu pregledajFilmove() - ispisuje sve filmove koje kupac poseduje:
    //	"{nazivFilma1} {brojKopijaFilma1}"
    //	.
    //	.
    //	.
    //	"{nazivFilmaN} {brojKopijaFilmaN}"
    //	"Ukupno filmova: {brojFilmova}"
    //	"Ukupna duzina trajanja: {sati} : {minuti} : {sekunde}"
    public void pregledajFilmove(){

    }

}
