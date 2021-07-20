public class PanAjonjoli extends Producto{
    public PanAjonjoli(){
        ingredientes = "Pan con ajonjoli";
        costo = 4;
    }

    @Override
    public int getCosto(){
        return costo;
    }
}
