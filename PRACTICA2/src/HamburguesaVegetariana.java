//package practica2;

public class HamburguesaVegetariana extends Hamburguesa{
    @Override
    void prepararCarne(){
        System.out.println("Hamburguesa Vegetariana, no lleva carne real");
    }
    @Override
    void ponerCarne(){
        System.out.println("Ponemos la carne no real");
    }

    public HamburguesaVegetariana(boolean llevaQueso){
        this.llevaQueso = llevaQueso;
    }

}