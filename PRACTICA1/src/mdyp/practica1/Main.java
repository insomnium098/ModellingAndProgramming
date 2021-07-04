package mdyp.practica1;
public class Main {

    public static void main(String[] args) {
        System.out.println("Prueba de practica 1");

        Banco banco = new Banco();


        Cliente prueba = new Cliente("Tono", "Nardos40",
                8888, 232323, 100);

        Servicio momazonPrime = new MomazonPrime();
        Servicio mextel20 = new Mextel("20Mbps");

        prueba.agregaServicio(momazonPrime);
        prueba.agregaServicio(mextel20);


        banco.registrar(prueba);
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
