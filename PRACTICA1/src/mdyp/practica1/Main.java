package mdyp.practica1;
public class Main {

    public static void main(String[] args) {

        ///Primero inicializaremos todos los servicios
        Servicio memeflix1 = new MemeFlix("1 Dispositivo");
        Servicio memeflix2 = new MemeFlix("2 Dispositivos");
        Servicio memeflix3 = new MemeFlix("3 Dispositivos");
        Servicio memeflix4 = new MemeFlix("4 Dispositivos");

        Servicio momazonPrime = new MomazonPrime();

        Servicio mextel20 = new Mextel("20Mbps");
        Servicio mextel30 = new Mextel("30Mbps");
        Servicio mextel150 = new Mextel("150Mbps");

        Servicio issi30 = new Issi("30Mbps");
        Servicio issi50 = new Issi("50Mbps");
        Servicio issi100 = new Issi("100Mbps");

        //Inicializamos el banco y los clientes


        Banco banco = new Banco();

        Cliente Alice = new Cliente("Alice", "Wonderland",
                1234, 12345, 20000);
        Alice.agregaServicio(memeflix4);
        Alice.agregaServicio(momazonPrime);
        Alice.agregaServicio(issi100);
        banco.registrar(Alice);

        Cliente Bob = new Cliente("Bob", "ElConstructor",
                345, 6454, 2000);
        Bob.agregaServicio(memeflix4);
        Bob.agregaServicio(momazonPrime);
        Bob.agregaServicio(mextel150);
        banco.registrar(Bob);

        Cliente Charlie = new Cliente("Charlie", "Brown",
                543435, 24212, 7000);
        Charlie.agregaServicio(issi30);
        banco.registrar(Charlie);

        Cliente Diego = new Cliente("Diego", "fdsfds",
                8979, 554646, 6000);
        Diego.agregaServicio(memeflix4);
        Diego.agregaServicio(issi50);
        banco.registrar(Diego);

        Cliente Emma = new Cliente("Emma", "hfshfoqsf",
                899964, 34649, 9000);
        Emma.agregaServicio(memeflix4);
        Emma.agregaServicio(momazonPrime);
        Emma.agregaServicio(issi100);
        banco.registrar(Emma);



        ////Comenzamos la simulacion cada mes
        for (int i = 0; i < 12; i++) {
            ///Caso de Diego sin varo
            if(Diego.getDinero() == 0){
                Diego.cancelarTodosLosServicios();
            }

            ///Caso de Emma en Abril
            if ( i == 3){
                Emma.cancelarTodosLosServicios();
                Emma.agregaServicio(mextel30);
            }

            //Caso de Charlie en Julio

            if (i == 6){
                Charlie.cancelarServicio(issi30);
                Charlie.agregaServicio(mextel20);
                Charlie.agregaServicio(momazonPrime);
            }

            ///Caso de Emma en Agosto
            if ( i == 7){
                Emma.agregaServicio(momazonPrime);
            }


            ///Caso de Diego en Noviembre

            if (i == 10){
                Diego.depositaDinero(6000);
                Diego.agregaServicio(issi30);
            }

            banco.cobrarCliente();



        }








        ///test mes 1







        //mes2
        //prueba.actualizaServicio(mextel30);
        //banco.cobrarCliente();

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
