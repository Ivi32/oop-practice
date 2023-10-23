public class Autobus extends Vozilo{
    //Napisati klasu Autobus koja nasledjuje klasu Vozilo i ima atribute:
    //- int brojPutnika
    //
    //Autobus ima 8 tockova
    //
    //Napisati 2 konstruktora:
    //- Jedan koji prima broj putnika
    //- Podrazumevani koji ne prima argumente i postavlja broj putnika na 0
    //
    //Napisati sve gettere i settere
    //
    //
    //
    //Napisati metode:
    //1. dodajPutnika() - koja dodaje jednog putnika u Autobus, pazeci da Autobus moze najvise imati 90 putnika.
    //2. oduzmiPutnika() - koja oduzima jednog putnika iz Autobusa, pazeci da Autobus moze imati najmanje 0 putnika.
    //3. dodajPutnika(int n) - koja dodaje n putnika u Autobus. Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
    //4. oduzmiPutnika(int n) - koja oduzima n putnika iz Autobusa. Ukoliko nema n putnika u Autobus, izbaciti sve putnike iz Autobusa.
    //5. isprazniAutobus() - izbacuje sve putnike iz Autobusa
    //6. napuniAutobus() - puni Autobus sa 2
    //
    //
    //Overridovati sve metode iz natklase..

    private int brojPutnika;

    public Autobus(String registarskiBroj, String marka, String tip, int brojPutnika) {
        super(registarskiBroj, marka, tip);
        this.brojPutnika = brojPutnika;
    }

    public Autobus(String registarskiBroj, String marka, String tip) {
        super(registarskiBroj, marka, tip);
        this.brojPutnika = 0;
    }

    public int getBrojPutnika() {
        return brojPutnika;
    }

    public void setBrojPutnika(int brojPutnika) {
        this.brojPutnika = brojPutnika;
    }

    public void dodajPutnika(){
        if(brojPutnika < 90)
            brojPutnika++;
    }

    public void oduzmiPutnika(){
        if(brojPutnika > 0)
            brojPutnika--;
    }

    public void dodajPutnika(int n){
        int brojac = 0;
        while(brojPutnika < 90 && brojac < n) {
            brojPutnika++;
            brojac++;
        }
    }
    public void oduzmiPutnika(int n) {
        int brojac = 0;
        while(brojPutnika > 0 && brojac < n) {
            brojPutnika--;
            brojac++;
        }

    }
    public void isprazniAutobus(){
        brojPutnika = 0;
    }

    public void napuniAutobus(){
        brojPutnika = 90;
    }

    @Override
    public char vratiKategoriju() {
        return 'D';
    }

    @Override
    public int brojTockova() {
        return 8;
    }

    @Override
    public int brojPutnika() {
        return brojPutnika;
    }
}
