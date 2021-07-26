public class ConBlindajeSimple extends Nave{
    Nave nave;

    public ConBlindajeSimple(Nave nave){
        this.nave = nave;
    }

    @Override
    public String getDescripcion(){
        String s = "- Blindaje: Simple\n";
        return nave.getDescripcion() + s;
    }

    @Override
    public int getPrecio(){
        return nave.getPrecio() + 5000;
    }
}
