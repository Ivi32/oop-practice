public class Auto extends Vozilo{
    //Napisati klasu Auto koja prosiruje klasu Vozilo i nema atribute
    //
    //Auto se pokrece tako sto ispisuje poruku "Vozim"
    //Auto trosi "Dizel" kao gorivo
    //
    //Overridovati toString() metod:
    //"<marka> <tip> je presao <kilometraza>km."


    public Auto(String marka, String tip, double kilometraza) {
        super(marka, tip, kilometraza);
    }


    @Override
    public void pokreniSe() {
        System.out.println("vozim");
    }

    @Override
    public String potrosnja() {
        return "gorivo";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getMarka()).append(" ").append(getTip()).append(" je presao ")
                .append(getKilometraza()).append(" km.");
        return sb.toString();
    }
}
