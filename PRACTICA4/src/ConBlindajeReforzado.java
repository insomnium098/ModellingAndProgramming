public class ConBlindajeReforzado extends Nave{
    Nave nave;

    public ConBlindajeReforzado(Nave nave){
        this.nave = nave;
    }

    @Override
    public String getDescripcion(){
        String s = "- Blindaje: Reforzado\n";
        return nave.getDescripcion() + s;
    }

    @Override
    public int getPrecio(){
        return nave.getPrecio() + 10000;
    }
}
