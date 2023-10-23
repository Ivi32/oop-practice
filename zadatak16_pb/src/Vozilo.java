public abstract class Vozilo {
    //Napisati abstraktnu klasu Vozilo koje ima atribute:
    //- String registarskiBroj
    //- String marka
    //- String tip
    //
    //Napisati konstruktor koji prima sve argumente
    //
    //Napisati sve gettere i settere
    //
    //Napisati abstraktne metode:
    //1. char vratiKategoriju() - koja vraca karakter kategorije:
    // 'A' -> ukoliko je u pitanju motocikl
    // 'B' -> ukoliko je u pitanju auto
    // 'C' -> ukoliko je u pitanju kamion
    // 'D' -> ukoliko je u pitanju autobus
    //2. int brojTockova() - koja vraca broj tockova vozila
    //3. int brojPutnika() - koja vraca broj trenutnih putnika vozila
    //
    //Overridovati toString() metod:
    //"<regBroj> <marka> <tip> kategorije <kategorija> ima:
    // Broj tockova: <brTockova>
    // Broj putnika: <brPutnka>"
    //
    //-------------------------------------------------------------------

    private String registarskiBroj;
    private String marka;
    private String tip;

    public Vozilo(String registarskiBroj, String marka, String tip) {
        this.registarskiBroj = registarskiBroj;
        this.marka = marka;
        this.tip = tip;
    }

    public String getRegistarskiBroj() {
        return registarskiBroj;
    }

    public String getMarka() {
        return marka;
    }

    public String getTip() {
        return tip;
    }

    public void setRegistarskiBroj(String registarskiBroj) {
        this.registarskiBroj = registarskiBroj;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    //Napisati abstraktne metode:
    //1. char vratiKategoriju() - koja vraca karakter kategorije:
    // 'A' -> ukoliko je u pitanju motocikl
    // 'B' -> ukoliko je u pitanju auto
    // 'C' -> ukoliko je u pitanju kamion
    // 'D' -> ukoliko je u pitanju autobus
    //2. int brojTockova() - koja vraca broj tockova vozila
    //3. int brojPutnika() - koja vraca broj trenutnih putnika vozila

    public abstract char vratiKategoriju();

    public abstract int brojTockova();
    public abstract int brojPutnika();

    ////Overridovati toString() metod:
    //    //"<regBroj> <marka> <tip> kategorije <kategorija> ima:
    //    // Broj tockova: <brTockova>
    //    // Broj putnika: <brPutnka>"


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(registarskiBroj).append(" ").append(marka).append(" "). append("kategorije ")
                .append(vratiKategoriju()).append(" ima:").append("\n");
        sb.append("Broj tockova: ").append(brojTockova()).append("\n");
        sb.append("Broj putnika: ").append(brojPutnika()).append("\n");
        return sb.toString();
    }
}
