//package practica2;

public class HamburguesaCarnivora extends Hamburguesa{
    @Override
    void prepararCarne(){
        System.out.println("Preparamos carne normal");
    }

    public HamburguesaCarnivora(boolean llevaQueso){
        this.llevaQueso = llevaQueso;
    }

}