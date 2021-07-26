public class ConViajeIntergalactico extends Nave{
    Nave nave;

    public ConViajeIntergalactico(Nave nave){
        this.nave = nave;
    }

    @Override
    public String getDescripcion(){
        String s = "- Sistema de propulsion: Viaje intergalactico\n";
        return nave.getDescripcion() + s;
    }

    @Override
    public int getPrecio(){
        return nave.getPrecio() + 20000;
    }
}
