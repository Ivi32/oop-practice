public class Automobil {
    //Napisati klasu Automobil. Automobil ima
    //1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
    //2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
    //3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
    //Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku

    private String marka;
    private String model;
    private int serijskiBroj;
    Vlasnik vlasnik;

    public Automobil(String marka, String model, int serijskiBroj, Vlasnik vlasnik) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnik = new Vlasnik();
    }

    public Automobil(String marka, String model, int serijskiBroj) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
    }

    public Automobil() {
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marka je: ").append(marka).append("\n");
        sb.append("Model je: ").append(model).append("\n");
        sb.append("Serijski broj je: ").append(serijskiBroj).append("\n");
        if(vlasnik == null)
            System.out.println("Nema vlasnika");
        else
            sb.append("Vlasnik je: ").append(vlasnik.getIme());
        return sb.toString();
    }
}
