public class PizzaUltra implements Pizza {
    String queso;
    String carne;
    String masa;

    public PizzaUltra(){
        queso = "Chedar";
        carne = "Salchicha";
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
