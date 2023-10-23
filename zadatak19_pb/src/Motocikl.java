public class Motocikl extends Vozilo{
    //Napisati klasu Motocikl koja prosiruje klasu Vozilo i nema atribute
    //
    //Motocikl se pokrece tako sto ispisuje poruku "Vozim"
    //Motocikl trosi "Benzin" kao gorivo
    //
    //Overridovati toString() metod:
    //"<marka> <tip> je presao <kilometraza>km."

    public Motocikl(String marka, String tip, double kilometraza) {
        super(marka, tip, kilometraza);
    }

    @Override
    public void pokreniSe() {
        System.out.println("vozim");
    }

    @Override
    public String potrosnja() {
        return "benzin";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getMarka()).append(" ").append(getTip()).append(" je presao ")
                .append(getKilometraza()).append(" km.");
        return sb.toString();
    }
}
