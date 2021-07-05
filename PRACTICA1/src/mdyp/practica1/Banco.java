package mdyp.practica1;
import java.util.ArrayList;
public class Banco implements Sujeto {
    ArrayList<Cliente> listaClientes;
    String mensajeAClientes;
    Integer mes;

    public Banco(){
    this.listaClientes = new ArrayList<>();
    this.mes = 0;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    @Override
    public void registrar(Cliente cliente) {
        listaClientes.add(cliente);
    }



    //Metodo auxiliar para pasar de un int al mes


    private String getMes(Integer mesInt){
        String mes = "";


        switch (mesInt){
            case 0:
                mes = "Enero";
                break;

            case 1:
                mes = "Febrero";
                break;
            case 2:
                mes = "Marzo";
                break;
            case 3:
                mes = "Abril";
                break;
            case 4:
                mes = "Mayo";
                break;
            case 5:
                mes = "Junio";
                break;
            case 6:
                mes = "Julio";
                break;
            case 7:
                mes = "Agosto";
                break;
            case 8:
                mes = "Septiembre";
                break;
            case 9:
                mes = "Octubre";
                break;
            case 10:
                mes = "Noviembre";
                break;
            case 11:
                mes = "Diciembre";
                break;
        }

        return mes;



    }

    /*

    @Override
    public void removerCliente(Cliente cliente) {

    }

     */

    @Override
    public void cobrarCliente() {
        for (Cliente cl : listaClientes){
            cl.update("---------------------------------------");
            cl.update(cl.getNombre() + ": Resumen de pagos del mes: " + getMes(this.mes));
            cl.update("---------------------------------------");
            int cobroTotal = 0;
            //Obtenemos la lista de servicios que tiene el cliente
            ArrayList<Servicio> serviciosCliente = cl.getListaServicios();
            for (Servicio serv : serviciosCliente){


                //Revisamos si el cliente tiene dinero, si tiene se le coba y se le avisa,
                //Si no, se le envia un mensaje de advertencia

                if (cl.getDinero() - serv.getPrecio() >= 0){
                    cl.update("Cobrando: " + serv.getNombreServicio() + " " + serv.getTipoPaquete() +
                            " " + serv.getPrecio() + "$");
                    cl.cobra(serv.getPrecio());
                    cobroTotal += serv.getPrecio();
                } else {
                    cl.update("Suspension de servicio: " + serv.getNombreServicio() + " " +
                            serv.getTipoPaquete() +" por falta de pago");
                }

            }

            cl.update("---------------------------------------");

            cl.update("Cobro total del mes: " + cobroTotal + "$");
            cl.update("Tu cuenta tiene ahora: " + cl.getDinero() + "$");
        }

        this.mes++;
    }



}
