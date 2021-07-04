package mdyp.practica1;
import java.util.ArrayList;
public class Banco implements Sujeto {
    ArrayList<Cliente> listaClientes;
    String mensajeAClientes;

    public Banco(){
    this.listaClientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    @Override
    public void registrar(Cliente cliente) {
        listaClientes.add(cliente);
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
            cl.update(cl.getNombre() + ": Resumen de pagos del mes : ");
            cl.update("---------------------------------------");
            int cobroTotal = 0;
            //Obtenemos la lista de servicios que tiene el cliente
            ArrayList<Servicio> serviciosCliente = cl.getListaServicios();
            for (Servicio serv : serviciosCliente){


                //Revisamos si el cliente tiene dinero, si tiene se le coba y se le avisa,
                //Si no, se le envia un mensaje de advertencia

                if (cl.getDinero() - serv.getPrecio() >= 0){
                    cl.update("Cobrando: " + serv.getNombreServicio() + " " + serv.getTipoPaquete() + " " + serv.getPrecio() + "$");
                    cl.cobra(serv.getPrecio());
                    cobroTotal += serv.getPrecio();
                } else {
                    cl.update("Suspension de servicio: " + serv.getNombreServicio() + " por falta de pago");
                }

            }

            cl.update("---------------------------------------");

            cl.update("Cobro total del mes: " + cobroTotal + "$");
            cl.update("Tu cuenta tiene ahora: " + cl.getDinero() + "$");
        }
    }
}
