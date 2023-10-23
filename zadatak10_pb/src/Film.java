public class Film {
    //Napisati klasu Film koja sadrzi atribute:
    //	- String ime
    //	- int godinaPremijere (godina kada je film prvi put prikazan; 1888 - 2021) (default = 2021)
    //	- double ocena (ocena filma, [1.0, 10.0]) (default = 1.0)
    //	- String sadrzaj (kratak sadrzaj filma)
    //	- int sati, minuti, sekunde (koliko sati, minuti i sekundi traje film| [0, 10), [0, 59], [0, 59] ) (default = 1, 30, 0)
    //
    //Napisati konstruktor(e) i proveriti da li su unosi validni. Ako uslovi nisu validni, postaviti ih na default vrednosti.
    //Napisati toString() metod:
    //	"{ime} {godinaPremijere} {ocena}
    //	 Duzina trajanja: {sati} : {minuti} : {sekunde}
    //	 {sadrzaj}"

    private String ime;
    private int godinaPremijere;
    private double ocena;
    private String sadrzaj;

    private int sati, minuti, sekunde;

    public Film(String ime, int godinaPremijere, double ocena, String sadrzaj, int sati, int minuti, int sekunde) {
        this.ime = ime;

        if(godinaPremijere >= 1888 && godinaPremijere <= 2021)
            this.godinaPremijere = godinaPremijere;
        else
            this.godinaPremijere = 2021;

        if(ocena >= 1 && ocena <=10)
            this.ocena = ocena;
        else
            this.ocena = 1;

        this.sadrzaj = sadrzaj;

        if(sati >= 0 && sati < 10)
            this.sati = sati;
        else
            this.sati = 1;

        if(minuti >= 0 && minuti <= 30)
            this.minuti = minuti;
        else
            this.minuti = 30;

        if(sekunde >= 0 && sekunde <= 59)
            this.sekunde = sekunde;
        else
            this.sekunde =0;

    }

    public Film() {
    }

    public String getIme() {
        return ime;
    }

    public int getGodinaPremijere() {
        return godinaPremijere;
    }

    public double getOcena() {
        return ocena;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public int getSati() {
        return sati;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSekunde() {
        return sekunde;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setGodinaPremijere(int godinaPremijere) {
        this.godinaPremijere = godinaPremijere;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    public void setSati(int sati) {
        this.sati = sati;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public void setSekunde(int sekunde) {
        this.sekunde = sekunde;
    }

    //Napisati toString() metod:
    //	"{ime} {godinaPremijere} {ocena}
    //	 Duzina trajanja: {sati} : {minuti} : {sekunde}
    //	 {sadrzaj}"


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(godinaPremijere).append(" ").append(ocena).append("\n");
        sb.append("Duzina trajanja: ").append(sati).append(" : ").append(minuti).append(" : ")
                .append(sekunde).append("\n");
        sb.append(sadrzaj);
        return sb.toString();

    }
}
