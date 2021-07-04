package mdyp.practica1;

public class Issi implements Servicio {
    private String nombreServicio;
    private String tipoPaquete;
    private Integer precio;


    public Issi(String tipoPaquete){
        this.nombreServicio = "Issi";
        this.tipoPaquete = tipoPaquete;
        if (tipoPaquete.equals("30Mbps")){
            this.precio = 390;
        } else if (tipoPaquete.equals("50Mbps")){
            this.precio = 590;
        } else if (tipoPaquete.equals("100Mbps")){
            this.precio = 780;
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
