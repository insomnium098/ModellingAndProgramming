import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Factory fabrica = new Factory();

    public static void main(String[] args) {
        boolean bandera = true;
        int presupuesto = -1;

        System.out.println("Bienvenido a la tienda galactica");
        System.out.println("Cual es su presupuesto?");
        String respuesta = recibeInputDelUsuario();
        try{
            presupuesto = Integer.parseInt(respuesta);
        } catch (NumberFormatException e){
            System.out.println("Elige una opcion valida.\n");
        }

        while (bandera){

            System.out.println("Escoge el sistema de propulsion");
            String sistema = asignarSistema();
            System.out.println("Escoge el blindaje");
            String blindaje = asignarBlindaje();
            System.out.println("Escoge la cabina");
            String cabina = asignarCabina();
            System.out.println("Escoge las armas");
            String armas = asignarArmas();

            Caracteristicas caracteristicas = new Caracteristicas(sistema, blindaje, cabina, armas);
            Nave nave = fabrica.getNave(caracteristicas);

            bandera = resumen(nave, presupuesto);
            if (bandera) {
                System.out.println("¿Deseas diseñar otra nave o ver nuestro catálogo?");
                boolean bandera1 = true;

                while (bandera1){
                    System.out.println("-- Opciones\n- 1: Disenar otra nave\n- 2: Ver el catalogo\n- 3: Salir");
                    String res = recibeInputDelUsuario();
                    switch (res){
                        case "2":
                            nave = asignarNave();
                            bandera1 = resumen(nave, presupuesto);
                            bandera = bandera1;
                            break;
                        case "1":
                            bandera1 = false;
                            break;
                        default:
                            System.out.println("Elige una opcion valida.\n");
                            break;
                        }

                    }
                }
        }
    }

    private static boolean resumen(Nave nave, int presupuesto) {
        boolean b = presupuesto >= nave.getPrecio();
        if (b) {
            System.out.println("Tu nave esta lista para recoger, estas son sus caracteristicas:");
            System.out.println(nave.getDescripcion());
            System.out.println("Paga en caja la cantidad de: " + nave.getPrecio() + " pumadolares");
        } else{
            System.out.println("El costo de tu nave sobrepasa tu presupuesto");
            System.out.println("Costo nave: " + nave.getPrecio());
        }
        return !b;
    }

    private static Nave asignarNave(){
        boolean bandera = true;
        Nave nave = new Nave();
        while (bandera){
            imprimirCatalogo();
            System.out.println("Que nave escoges?");
            String naveCatalogo = recibeInputDelUsuario();
            if (verificarNaveCatalogo(naveCatalogo)) {
                nave = fabrica.getNave(naveCatalogo);
                bandera = false;
            } else{
                System.out.println("Escoge una opcion valida");
            }
        }
        return nave;
    }

    private static String asignarSistema(){
        boolean bandera = true;
        String respuesta = "";
        while (bandera){
            imprimirMenuSistema();
            respuesta = recibeInputDelUsuario();
            if (verificarOpcionSistema(respuesta)){
                bandera = false;
            } else{
                System.out.println("Escoge una opcion valida");
            }
        }
        return respuesta;
    }
    private static String asignarBlindaje(){
        boolean bandera = true;
        String respuesta = "";
        while (bandera){
            imprimirMenuBlindaje();
            respuesta = recibeInputDelUsuario();
            if (verificarOpcionBlindaje(respuesta)){
                bandera = false;
            } else{
                System.out.println("Escoge una opcion valida");
            }
        }
        return respuesta;
    }
    private static String asignarCabina(){
        boolean bandera = true;
        String respuesta = "";
        while (bandera){
            imprimirMenuCabina();
            respuesta = recibeInputDelUsuario();
            if (verificarOpcionCabina(respuesta)){
                bandera = false;
            } else{
                System.out.println("Escoge una opcion valida");
            }
        }
        return respuesta;
    }
    private static String asignarArmas(){
        boolean bandera = true;
        String respuesta = "";
        while (bandera){
            imprimirMenuArmas();
            respuesta = recibeInputDelUsuario();
            if (verificarOpcionArmas(respuesta)){
                bandera = false;
            } else{
                System.out.println("Escoge una opcion valida");
            }
        }
        return respuesta;
    }

    private static String recibeInputDelUsuario() {
        String respuesta = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            respuesta = in.readLine();
        } catch (IOException e) {
            System.err.println("Error al leer tu respuesta");
        }
        return respuesta;
    }

    private static void imprimirCatalogo(){
        System.out.println("\t\t--- Catalogo ---");
        System.out.println("\t-- Nave individual de combate --");
        Nave nave = fabrica.getNave("Nave individual de combate");
        System.out.println(nave.getDescripcion() + "\nPrecio: " + nave.getPrecio() + '\n');

        System.out.println("\t-- Nave militar de transporte --");
        nave = fabrica.getNave("Nave militar de transporte");
        System.out.println(nave.getDescripcion() + "\nPrecio: " + nave.getPrecio() + '\n');

        System.out.println("\t-- Base espacial de guerra --");
        nave = fabrica.getNave("Base espacial de guerra");
        System.out.println(nave.getDescripcion() + "\nPrecio: " + nave.getPrecio() + '\n');
    }

    private static void imprimirMenuSistema(){
        String s = "\t-- Sistema de propulsion --\n";
        s += "- Intercontinental: Para solo un paseo\tPrecio: 5000\n";
        s += "- Interplanetario: Para un buen fin de semana\tPrecio: 10000\n";
        s += "- Intergalactico: Algo inimaginable\tPrecio: 20000\n";
        System.out.println(s);
    }
    private static void imprimirMenuBlindaje(){
        String s = "\t-- Blindaje\n";
        s += "- Simple: Un par de placas\tPrecio: 5000\n";
        s += "- Reforzado: Mas que un par de placas\tPrecio: 10000\n";
        s += "- Fortaleza: Toda una fortaleza andante\tPrecio: 20000\n";
        System.out.println(s);
    }
    private static void imprimirMenuCabina(){
        String s = "\t-- Cabina\n";
        s += "- 1 piloto: Apenas cabe uno\tPrecio: 5000\n";
        s += "- Tripulacion pequena: Ideal para el squad de clones\tPrecio: 10000\n";
        s += "- Ejercito: Nadie queda fuera\tPrecio: 20000\n";
        System.out.println(s);
    }
    private static void imprimirMenuArmas(){
        String s = "\t-- Armas\n";
        s += "- Laser simple: Al gato le gustara\tPrecio: 5000\n";
        s += "- Misiles de plasma: Se dirige solo\tPrecio: 10000\n";
        s += "- Laser destructor de planetas: Esto no es un juguete\tPrecio: 20000\n";
        System.out.println(s);
    }

    private static boolean verificarOpcionSistema(String sistema){
        return sistema.equals("Intercontinental") || sistema.equals("Interplanetario") || sistema.equals("Intergalactico");
    }
    private static boolean verificarOpcionBlindaje(String blindaje){
        return blindaje.equals("Simple") || blindaje.equals("Reforzado") || blindaje.equals("Fortaleza");
    }
    private static boolean verificarOpcionCabina(String cabina){
        return cabina.equals("1 piloto") || cabina.equals("Tripulacion pequena") || cabina.equals("Ejercito");
    }
    private static boolean verificarOpcionArmas(String armas){
        return armas.equals("Laser simple") || armas.equals("Misiles de plasma") || armas.equals("Laser destructor de planetas");
    }
    private static boolean verificarNaveCatalogo(String n){
        return n.equals("Nave individual de combate") || n.equals("Nave militar de transporte") || n.equals("Base espacial de guerra");
    }
}
