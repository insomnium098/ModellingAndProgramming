package mdyp.practica1;

import java.util.ArrayList;

public class Cliente implements Observador {
    private String nombre, direccion;
    private Integer rfc, numCel, dinero;
    private ArrayList<Servicio> listaServicios;

    public Cliente(String nombre, String direccion, Integer rfc, Integer numCel, Integer dinero){

        this.nombre = nombre;
        this.direccion = direccion;
        this.rfc = rfc;
        this.numCel = numCel;
        this.dinero = dinero;
        this.listaServicios = new ArrayList<>();

    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public Integer getrfc(){
        return this.rfc;
    }

    public Integer getNumCel(){
        return this.numCel;
    }

    public Integer getDinero(){
        return this.dinero;
    }

    public ArrayList<Servicio> getListaServicios(){
        return this.listaServicios;
    }

    /*
    Metodos para subscribirse a los servicios
     */

    public void agregaServicio(Servicio servicio){
        listaServicios.add(servicio);
    }

    public void cancelarServicio(Servicio servicio){
        listaServicios.remove(servicio);
    }

    public void actualizaServicio(Servicio servicio){

        //Obtenemos el nombre del servicio y el tipo

        for (Servicio serv : listaServicios){
            if(serv.getNombreServicio().equals(servicio.getNombreServicio())){
                listaServicios.remove(serv);
                break;
            }
        }

        System.out.println("Actualizando servicio a " + servicio.getNombreServicio());

        agregaServicio(servicio);

    }

    @Override
    public void update(String mensaje) {
        System.out.println(mensaje);

    }

    public void cobra(Integer cobro){
        this.dinero -= cobro;
    }
}
