public class PizzaPollo implements Pizza {
    String queso;
    String carne;
    String masa;

    public PizzaPollo(){
        queso = "Manchego";
        carne = "Pollo";
        masa = "Masa gruesa";
    }

    @Override
    public String getQueso() {
        return queso;
    }

    @Override
    public String getCarne() {
        return carne;
    }

    @Override
    public String getMasa() {
        return masa;
    }
}
