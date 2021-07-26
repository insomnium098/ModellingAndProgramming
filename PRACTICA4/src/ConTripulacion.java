public class ConTripulacion extends Nave{
    Nave nave;

    public ConTripulacion(Nave nave){
        this.nave = nave;
    }

    @Override
    public String getDescripcion(){
        String s = "- Cabina: Tripulacion pequena\n";
        return nave.getDescripcion() + s;
    }

    @Override
    public int getPrecio(){
        return nave.getPrecio() + 10000;
    }
}
