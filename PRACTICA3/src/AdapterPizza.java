public class AdapterPizza extends Producto {
    public Pizza pizza;

    public AdapterPizza(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCosto() {
        String queso = pizza.getQueso();
        String carne = pizza.getCarne();
        String masa = pizza.getMasa();
        int costo = 0;
        switch (queso){
            case "Manchego":
                costo += 2;
                break;
            case "Chedar":
                costo += 3;
                break;
        }
        switch (carne){
            case "Jamon":
                costo += 2;
                break;
            case "Pollo":
                costo += 3;
                break;
            case "Salchicha":
                costo += 5;
                break;
        }
        switch (masa){
            case "Masa gruesa":
                costo += 2;
                break;
            case "Masa delgada":
                costo += 1;
                break;
        }
        return costo;
    }

    @Override
    public String getIngredientes() {
        String s = "";
        s += pizza.getQueso() + '\n';
        s += pizza.getCarne() + '\n';
        s += pizza.getMasa() + '\n';
        return s;
    }
}
