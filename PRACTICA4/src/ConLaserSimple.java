public class ConLaserSimple extends Nave{
    Nave nave;

    public ConLaserSimple(Nave nave){
        this.nave = nave;
    }

    @Override
    public String getDescripcion(){
        String s = "- Arma: Laser simple\n";
        return nave.getDescripcion() + s;
    }

    @Override
    public int getPrecio(){
        return nave.getPrecio() + 5000;
    }
}
