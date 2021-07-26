public class ConPiloto extends Nave{
    Nave nave;

    public ConPiloto(Nave nave){
        this.nave = nave;
    }

    @Override
    public String getDescripcion(){
        String s = "- Cabina: 1 piloto\n";
        return nave.getDescripcion() + s;
    }

    @Override
    public int getPrecio(){
        return nave.getPrecio() + 5000;
    }
}
