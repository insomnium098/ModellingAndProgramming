//package practica2;

public class Hamburguesa1 extends Hamburguesa{
    @Override
    void prepararCarne(){
        System.out.println("Preparamos carne normal");
    }

    public Hamburguesa1(boolean llevaQueso){
        this.llevaQueso = llevaQueso;
    }

}