public class Ljubimac {
    //Napisati klasu Ljubimac koja ima atribute:
//- String ime
//- String red
//- int brojNogu
//- boolean leti
//- double tezina
//
//Napraviti jedan konstruktor koji prima sve argumente
//Napraviti jedan prazan konstruktor koji postavlja sve niske na "" a ostale vrednosti na podrazumevane
//
//Napisati sve gettere i settere
//
//Overridovati toString() metod:
//"Ime ljubimca je: <ime>
// Tip ljubimca je: <red>
// Ovaj ljubimac ima: <brojNogu> nogu
// Ovaj ljubimac leti/ne leti
// Ovaj ljubimca je tezak: <tezina>kg."

    private String ime;
    private String red;
    private int brojNogu;
    private boolean leti;
    private double tezina;

    //Napraviti jedan konstruktor koji prima sve argumente
    //Napraviti jedan prazan konstruktor koji postavlja sve niske na "" a ostale vrednosti na podrazumevane

    public Ljubimac(String ime, String red, int brojNogu, boolean leti, double tezina) {
        this.ime = ime;
        this.red = red;
        this.brojNogu = brojNogu;
        this.leti = leti;
        this.tezina = tezina;
    }

    public Ljubimac() {
        this.ime = "";
        this.red = "";
        this.brojNogu = 0;
        this.leti = false;
        this.tezina = 0.0;
    }

    //Napisati sve gettere i settere

    public String getIme() {
        return ime;
    }

    public String getRed() {
        return red;
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public boolean isLeti() {
        return leti;
    }

    public double getTezina() {
        return tezina;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public void setLeti(boolean leti) {
        this.leti = leti;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    //Overridovati toString() metod:
    //"Ime ljubimca je: <ime>
    // Tip ljubimca je: <red>
    // Ovaj ljubimac ima: <brojNogu> nogu
    // Ovaj ljubimac leti/ne leti
    // Ovaj ljubimca je tezak: <tezina>kg."

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime ljubimca je: ").append(this.ime).append("\n")
                .append("Tip ljubimca je: ").append(this.red).append("\n")
                .append("Ovaj ljubimac ima: ").append(this.brojNogu).append(" nogu").append("\n")
                .append("Ovaj ljubimac ").append(this.leti ? "leti": "ne leti").append("\n")
                .append("Ovaj ljubimac je tezak: ").append(this.tezina).append("kg.");
        return sb.toString();
    }
}
