public abstract class Producto {
    // ingredientes seran todos los elementos que lleve el sanwichh
    // La variable costo nos ayudara a llevar el rastro del costo sin importar cuantos ingredientes se anadan
    String ingredientes;
    int costo = 0;


    public String getIngredientes(){
        return ingredientes;
    }

    // Metodo abstracto para que cada ingrediente implemente su getCosto y anada su precio
    public abstract int getCosto();
}
