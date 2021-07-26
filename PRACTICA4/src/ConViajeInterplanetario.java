public class ConViajeInterplanetario extends Nave{
    Nave nave;

    public ConViajeInterplanetario(Nave nave){
        this.nave = nave;
    }

    @Override
    public String getDescripcion(){
        String s = "- Sistema de propulsion: Viaje interplanetario\n";
        return nave.getDescripcion() + s;
    }

    @Override
    public int getPrecio(){
        return nave.getPrecio() + 10000;
    }
}
