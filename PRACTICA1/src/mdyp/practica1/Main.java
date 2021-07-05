package mdyp.practica1;
public class Main {

    public static void main(String[] args) {

        ///Primero inicializaremos todos los servicios
        Servicio memeflix1 = new MemeFlix("1 Dispositivo");
        Servicio memeflix2 = new MemeFlix("2 Dispositivo");
        Servicio memeflix3 = new MemeFlix("3 Dispositivo");
        Servicio memeflix4 = new MemeFlix("4 Dispositivo");

        Servicio momazonPrime = new MomazonPrime();

        Servicio mextel20 = new Mextel("20Mbps");
        Servicio mextel30 = new Mextel("30Mbps");
        Servicio mextel150 = new Mextel("150Mbps");

        Servicio issi30 = new Issi("30Mbps");
        Servicio issi50 = new Mextel("50Mbps");
        Servicio issi100 = new Mextel("100Mbps");

        //Inicializamos el banco y los clientes


        Banco banco = new Banco();



        Cliente prueba = new Cliente("Tono", "Nardos40",
                8888, 232323, 200);


        ///test mes 1


        prueba.agregaServicio(momazonPrime);
        prueba.agregaServicio(mextel20);

        banco.registrar(prueba);
        banco.cobrarCliente();



        //mes2
        prueba.actualizaServicio(mextel30);
        banco.cobrarCliente();

        /*

        for (Servicio serv : prueba.getListaServicios()){
            System.out.println(serv.getNombreServicio());
            System.out.println(serv.getPrecio());

        }

        System.out.println("---------");

        prueba.cancelarServicio(momazonPrime);
        for (Servicio serv : prueba.getListaServicios()){
            System.out.println(serv.getNombreServicio());
            System.out.println(serv.getPrecio());

        }

         */




    }
}
