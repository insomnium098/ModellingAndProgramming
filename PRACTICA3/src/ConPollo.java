public class ConPollo extends Producto {
    // producto sera el objeto que contenga toda la informacion necesaria y solo 'decoraremos'
    // los elementos extra debidos al ingrediente en cuestion
    Producto producto;
    int cantidad;

    public ConPollo(Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }
    // Anadimos el pollo
    @Override
    public String getIngredientes(){
        return producto.getIngredientes() + "\nPollo".repeat(cantidad);
    }

    // Aumentamos el costo del sanwicch
    @Override
    public int getCosto(){
        return producto.getCosto() + 1 * cantidad;
    }
}
