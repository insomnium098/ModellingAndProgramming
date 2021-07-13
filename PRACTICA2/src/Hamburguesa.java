//package practica2;

public abstract class Hamburguesa {

    public boolean llevaQueso = false;

//    public Hamburguesa(boolean llevaQueso){
//        this.llevaQueso = llevaQueso;
//    }

    abstract void prepararCarne();

    public final void cocinar(){
     ponerCarne();
     ponerMayonesa();
     ponerMostaza();
     prepararCarne();
     ponerCarne();
     if (llevaQueso) {
         ponerQueso();
        }
     ponerVegetales();
     ponerCatsup();
     ponerPan();
    }

    void ponerPan(){
        System.out.println("Ponemos el pan");
    }
    void ponerMayonesa(){
        System.out.println("Ponemos la mayonesa");
    }
    void ponerMostaza(){
        System.out.println("Ponemos la mostaza");
    }
    void ponerCarne(){
        System.out.println("Ponemos la carne");
    }
    void ponerQueso(){
        System.out.println("Ponemos el queso");
    }
    void ponerVegetales(){
        System.out.println("Ponemos los vegetales");
    }
    void ponerCatsup(){
        System.out.println("Ponemos la catsup");
    }




}