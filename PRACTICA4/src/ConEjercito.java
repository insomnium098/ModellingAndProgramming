public class ConEjercito extends Nave{
    Nave nave;

    public ConEjercito(Nave nave){
        this.nave = nave;
    }

    @Override
    public String getDescripcion(){
        String s = "- Cabina: Ejercito\n";
        return nave.getDescripcion() + s;
    }

    @Override
    public int getPrecio(){
        return nave.getPrecio() + 20000;
    }
}
