package mdyp.practica1;

public class MemeFlix implements Servicio {
    private String nombreServicio;
    private String tipoPaquete;
    private Integer precio;


    public MemeFlix(String tipoPaquete){
        this.nombreServicio = "MemeFlix";
        this.tipoPaquete = tipoPaquete;
        if (tipoPaquete.equals("1 Dispositivo")){
            this.precio = 100;
        } else if (tipoPaquete.equals("2 Dispositivos")){
            this.precio = 200;
        } else if (tipoPaquete.equals("4 Dispositivos")){
            this.precio = 300;
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
