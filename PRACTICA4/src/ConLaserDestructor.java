public class ConLaserDestructor extends Nave {
    Nave nave;

    public ConLaserDestructor(Nave nave){
        this.nave = nave;
    }

    @Override
    public String getDescripcion(){
        String s = "- Arma: Laser destructor de planetas\n";
        return nave.getDescripcion() + s;
    }

    @Override
    public int getPrecio(){
        return nave.getPrecio() + 20000;
    }
}
