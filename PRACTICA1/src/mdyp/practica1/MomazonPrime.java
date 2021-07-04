package mdyp.practica1;

public class MomazonPrime implements Servicio {
    private String nombreServicio;
    private String tipoPaquete;
    private Integer precio;


    public MomazonPrime(){
        this.nombreServicio = "MomazonPrime";
        this.tipoPaquete = "Prime";
        this.precio = 100;

    }

    @Override
    public String getNombreServicio(){
        return this.nombreServicio;
    }
    @Override

    public String getTipoPaquete(){
        return this.tipoPaquete;
    }
    @Override

    public Integer getPrecio(){
        return this.precio;
    }


}
