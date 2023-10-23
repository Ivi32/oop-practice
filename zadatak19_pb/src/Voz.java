public class Voz implements Pokretljivo{
    //Napisati klasu Voz koja implementuje interfejs Pokretljivo i ima atribute:
    //- TipVoza tipVoza
    //- int brojVagona
    //
    //napraviti sve odgovarajuce konstruktore pazeci na logiku i sve gettere i settere
    //
    //Voz se pokrece tako sto ispisuje poruku "Dobio sam zeleno svetlo"
    //Voz trosi "Struja" kao gorivo
    //
    //Overridovati toString() metod:
    //"<tip> sa <brVagona> vagona."
    private String tipVoza;
    private int brojVagona;

    public Voz(String tipVoza, int brojVagona) {
        this.tipVoza = tipVoza;
        this.brojVagona = brojVagona;
    }

    public String getTipVoza() {
        return tipVoza;
    }

    public int getBrojVagona() {
        return brojVagona;
    }

    public void setTipVoza(String tipVoza) {
        this.tipVoza = tipVoza;
    }

    public void setBrojVagona(int brojVagona) {
        this.brojVagona = brojVagona;
    }

    @Override
    public void pokreniSe() {
        System.out.println("Dobio sam zeleno svetlo");
    }

    @Override
    public String potrosnja() {
        return "struja";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(tipVoza).append(" sa ").append(brojVagona).append(" vagona");
        return sb.toString();
    }
}
