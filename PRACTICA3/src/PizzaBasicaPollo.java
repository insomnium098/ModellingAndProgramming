public class PizzaBasicaPollo implements Pizza {
    String queso;
    String carne;
    String masa;

    public PizzaBasicaPollo(){
        queso = "Manchego";
        carne = "Pollo";
        masa = "Masa delgada";
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
