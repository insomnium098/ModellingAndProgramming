public class PizzaBasica implements Pizza {
    String queso;
    String carne;
    String masa;

    public PizzaBasica(){
        queso = "Manchego";
        carne = "Jamon";
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
