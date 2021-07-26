public class ConViajeIntercontinental extends Nave{
    Nave nave;

    public ConViajeIntercontinental(Nave nave){
        this.nave = nave;
    }

    @Override
    public String getDescripcion(){
        String s = "- Sistema de propulsion: Viaje intercontinental\n";
        return nave.getDescripcion() + s;
    }

    @Override
    public int getPrecio(){
        return nave.getPrecio() + 5000;
    }
}
