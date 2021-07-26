public class ConBlindajeFortaleza extends Nave{
    Nave nave;

    public ConBlindajeFortaleza(Nave nave){
        this.nave = nave;
    }

    @Override
    public String getDescripcion(){
        String s = "- Blindaje: Fortaleza\n";
        return nave.getDescripcion() + s;
    }

    @Override
    public int getPrecio(){
        return nave.getPrecio() + 20000;
    }
}
