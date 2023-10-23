public class Motocikl extends Vozilo{
    //Napisati klasu Motocikl koja nasledjuje klasu Vozilo i ima atribute:
    //- int brojPutnika
    //
    //Motocikl ima 2 tocka (Ko mi napise da moze da ima i 3 leti sa kursa!)
    //
    //Napisati 2 konstruktora:
    //- Jedan koji prima broj putnika
    //- Podrazumevani koji ne prima argumente
    //
    //Napisati sve gettere i settere
    //
    //Napisati metode:
    //1. dodajPutnika() - koja dodaje jednog putnika na Motor, pazeci da motocikl moze najvise imati 2 putnika.
    //2. oduzmiPutnika() - koja oduzima jednog putnika sa Motora, pazeci da motor moze imati najmanje 0 putnika.
    //3. dodajPutnika(int n) - koja dodaje n putnika u Motor. Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
    //4. oduzmiPutnika(int n) - koja oduzima n putnika iz Motora. Ukoliko nema n putnika u autu, izbaciti sve putnike sa motocikla.
    //5. isprazniMotor() - izbacuje sve putnike sa motora
    //6. napuniMotor() - puni motor sa 2 putnika

    private int brojPutnika;

    public Motocikl(String registarskiBroj, String marka, String tip, int brojPutnika) {
        super(registarskiBroj, marka, tip);
        this.brojPutnika = brojPutnika;
    }

    public Motocikl(String registarskiBroj, String marka, String tip) {
        super(registarskiBroj, marka, tip);
    }

    public int getBrojPutnika() {
        return brojPutnika;
    }

    public void setBrojPutnika(int brojPutnika) {
        this.brojPutnika = brojPutnika;
    }

    public void dodajPutnika(){
        if(brojPutnika <= 1)
            brojPutnika++;
    }

    public void oduzmiPutnika(){
        if(brojPutnika >= 1)
            brojPutnika--;
    }

    public void dodajPutnika(int n){
        int brojac = 0;
        while(brojPutnika < 2 && brojac < n){
                brojPutnika++;
                brojac ++;
        }
    }
    public void oduzmiPutnika(int n) {
        int brojac = 0;
            while(brojPutnika > 0 && brojac < n) {
                brojPutnika--;
                brojac++;
            }
    }
    public void isprazniMotocikl(){
        brojPutnika = 0;
    }

    public void napuniMotocikl(){
        brojPutnika = 2;
    }

    @Override
    public char vratiKategoriju() {
        return 'A';
    }

    @Override
    public int brojTockova() {
        return 2;
    }

    @Override
    public int brojPutnika() {
        return brojPutnika;
    }
}
