import java.util.ArrayList;

public class Kamion extends Vozilo {
    //Napisati klasu Kamion koja nasledjuje klasu Vozilo i ima atribute:
    //- int brojPutnika
    //- ArrayList<String> proizvodi
    //
    //Kamion ima 10 tockova
    //
    //Napisati 2 konstruktora:
    //- Jedan koji prima broj putnika i listu proizvoda koje prenosi
    //- Podrazumevani koji ne prima argumente i postavlja listu proizvoda na novu praznu listu
    //
    //Napisati sve gettere i settere
    //
    //
    //
    //Napisati metode:
    //1. dodajPutnika() - koja dodaje jednog putnika u Kamion, pazeci da kamion moze najvise imati 1 putnika.
    //2. oduzmiPutnika() - koja oduzima jednog putnika iz Kamiona, pazeci da kamion moze imati najmanje 0 putnika.
    //3. dodajPutnika(int n) - koja dodaje n putnika u Kamiona. Ukoliko ne mogu da stanu svih n putnika,
    // onda ih dodati do gornje granice
    //4. oduzmiPutnika(int n) - koja oduzima n putnika iz Kamiona.
    // Ukoliko nema n putnika u autu, izbaciti sve putnike iz kamiona.
    //5. isprazniKamion() - izbacuje sve putnike im kamiona
    //6. napuniKamion() - puni kamion sa 2 putnika
    //7. dodajProizvod(String s) - koji dodaje proizvod u kamion
    //8. oduzmiProizvod(String s) - koji oduzima proizvod iz kamiona
    //
    //
    //Overridovati sve metode iz natklase.
    private int brojPutnika;
    private ArrayList<String> proizvodi;

    public Kamion(String registarskiBroj, String marka, String tip, int brojPutnika, ArrayList<String> proizvodi) {
        super(registarskiBroj, marka, tip);
        this.brojPutnika = brojPutnika;
        this.proizvodi = proizvodi;
    }

    public Kamion(String registarskiBroj, String marka, String tip) {
        super(registarskiBroj, marka, tip);
    }

    public int getBrojPutnika() {
        return brojPutnika;
    }

    public ArrayList<String> getProizvodi() {
        return proizvodi;
    }

    public void setBrojPutnika(int brojPutnika) {
        this.brojPutnika = brojPutnika;
    }

    public void setProizvodi(ArrayList<String> proizvodi) {
        this.proizvodi = proizvodi;
    }

    public void dodajPutnika() {
        if (brojPutnika == 0)
            brojPutnika++;
    }

    public void oduzmiPutnika() {
        if (brojPutnika == 1)
            brojPutnika--;
    }

    public void dodajPutnika(int n) {
        int brojac = 0;
        while (brojPutnika < 1 && brojac < n) {
            brojPutnika++;
            brojac++;
        }
    }

    public void oduzmiPutnika(int n) {
        int brojac = 0;
        while (brojPutnika > 0 && brojac < n) {
            brojPutnika--;
            brojac++;
        }

    }

    public void isprazniKamion() {
        brojPutnika = 0;
    }

    public void napuniKamion() {
        brojPutnika = 1;
    }

    //7. dodajProizvod(String s) - koji dodaje proizvod u kamion
    //8. oduzmiProizvod(String s) - koji oduzima proizvod iz kamiona

    public void dodajProizvod(String s) {
        proizvodi.add(s);
    }

    public void oduzmiProizvod(String s) {
        proizvodi.remove(s);
    }

    @Override
    public char vratiKategoriju() {
        return 'C';
    }

    @Override
    public int brojTockova() {
        return 10;
    }

    @Override
    public int brojPutnika() {
        return brojPutnika;
    }
}
