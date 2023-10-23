public class Automobil extends Vozilo{
    //Napisati klasu Automobil koja nasledjuje klasu Vozilo i ima atribute:
    //- int brojPutnika
    //
    //Auto ima 4 tocka
    //
    //Napisati 2 konstruktora:
    //- Jedan koji prima broj putnika
    //- Podrazumevani koji ne prima argumente
    //
    //Napisati sve gettere i settere
    //
    //Napisati metode:
    //1. dodajPutnika() - koja dodaje jednog putnika u Auto, pazeci da auto moze najvise imati 5 putnika.
    //2. oduzmiPutnika() - koja oduzima jednog putnika iz Auta, pazeci da auto mzoe imati najmanje 0 putnika.
    //3. dodajPutnika(int n) - koja dodaje n putnika u Auto. Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
    //4. oduzmiPutnika(int n) - koja oduzima n putnika iz Auta. Ukoliko nema n putnika u autu, izbaciti sve putnike iz auta.
    //5. isprazniAuto() - izbacuje sve putnike iz auta
    //6. napuniAuto() - puni auto sa 5 putnika
    //
    //
    //Overridovati sve metode iz natklase.

    private int brojPutnika;

    public Automobil(String registarskiBroj, String marka, String tip, int brojPutnika) {
        super(registarskiBroj, marka, tip);
        this.brojPutnika = brojPutnika;
    }

    public Automobil(String registarskiBroj, String marka, String tip) {
        super(registarskiBroj, marka, tip);
    }

    public int getBrojPutnika() {
        return brojPutnika;
    }

    public void setBrojPutnika(int brojPutnika) {
        this.brojPutnika = brojPutnika;
    }

    ////Napisati metode:
    //    //1. dodajPutnika() - koja dodaje jednog putnika u Auto, pazeci da auto moze najvise imati 5 putnika.
    //    //2. oduzmiPutnika() - koja oduzima jednog putnika iz Auta, pazeci da auto mzoe imati najmanje 0 putnika.
    //    //3. dodajPutnika(int n) - koja dodaje n putnika u Auto.
    //    Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
    //    //4. oduzmiPutnika(int n) - koja oduzima n putnika iz Auta.
    //    Ukoliko nema n putnika u autu, izbaciti sve putnike iz auta.
    //    //5. isprazniAuto() - izbacuje sve putnike iz auta
    //    //6. napuniAuto() - puni auto sa 5 putnika

    public void dodajPutnika(){
      if(brojPutnika <= 4)
            brojPutnika++;
    }

    public void oduzmiPutnika(){
        if(brojPutnika > 0)
            brojPutnika--;
    }

    public void dodajPutnika(int n) {
        int brojac = 0;
        while (brojPutnika < 5 && brojac < n) {
            brojPutnika++;
            brojac++;
        }
    }
    public void oduzmiPutnika(int n) {
        int brojac = 0;
        while(brojPutnika > 0 && brojac < n){
                brojPutnika--;
                brojac ++;
        }
    }
    public void isprazniAuto(){
            brojPutnika = 0;
        }

    public void napuniAuto(){
        brojPutnika = 5;
    }

    @Override
    public char vratiKategoriju() {
        return 'B';
    }

    @Override
    public int brojTockova() {
        return 4;
    }

    @Override
    public int brojPutnika() {
        return brojPutnika;
    }
}

