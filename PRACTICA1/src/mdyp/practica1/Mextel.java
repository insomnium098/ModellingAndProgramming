package mdyp.practica1;

public class Mextel implements Servicio {
    private String nombreServicio;
    private String tipoPaquete;
    private Integer precio;


    public Mextel(String tipoPaquete){
        this.nombreServicio = "Mextel";
        this.tipoPaquete = tipoPaquete;
        if (tipoPaquete.equals("20Mbps")){
            this.precio = 349;
        } else if (tipoPaquete.equals("30Mbps")){
            this.precio = 399;
        } else if (tipoPaquete.equals("150Mbps")){
            this.precio = 549;
        } else {
            this.precio = 0;
        }
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
