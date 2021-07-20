public class PanNormal extends Producto{
    public PanNormal(){
        ingredientes = "Pan normal";
        costo = 3;
    }

    @Override
    public int getCosto(){
        return costo;
    }
}
