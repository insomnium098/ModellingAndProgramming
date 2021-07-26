public class ConMisil extends Nave{
    Nave nave;

    public ConMisil(Nave nave){
        this.nave = nave;
    }

    @Override
    public String getDescripcion(){
        String s = "- Arma: Misiles de plasma\n";
        return nave.getDescripcion() + s;
    }

    @Override
    public int getPrecio(){
        return nave.getPrecio() + 10000;
    }
}
