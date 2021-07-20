public class PizzaNormal implements Pizza {
    String queso;
    String carne;
    String masa;

    public PizzaNormal(){
        queso = "Chedar";
        carne = "Jamon";
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
