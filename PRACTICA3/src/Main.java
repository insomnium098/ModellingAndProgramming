import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String panes = "-1- Pan normal -> 3\n-2- Pan con ajonjoli -> 4";
    static String ingredientes = "-1- Pollo -> 1\n-2- Pepperoni -> 2\n-3- Lechuga -> 4\n-4- Jitomate -> 1\n-5- Cebolla -> 1\n-6- Mostaza -> 2\n-7- Catsup -> 1\n-8- Mayonesa -> 1\n-9- Terminar";

    public static void main(String[] args) {
        // bandera para

        boolean bandera = true;
        boolean ticket = false;
        Producto producto = null;

        while (bandera) {
            System.out.println("Bienvenido, que quieres comprar?\n-1- Baguette\n-2- Pizza\n-3- Salir");
            String respuesta = recibeInputDelUsuario();
            switch (respuesta){
                case "1":
                    producto = nuevoSanwichh();
                    bandera = false;
                    ticket = true;
                    break;
                case "2":
                    producto = nuevoPizza();
                    bandera = false;
                    ticket = true;
                    break;
                case "3":
                    bandera = false;
                    ticket = false;
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
                    break;
            }
        }
        if (ticket) {
            System.out.println("----- Ticket ------");
            System.out.println("Ingredientes");
            System.out.println(producto.getIngredientes());
            System.out.println("Costo");
            System.out.println(producto.getCosto());
        }
        System.out.println("Adios");
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

    private static Producto nuevoPizza(){
        Pizza producto = null;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Bienvenido, escoge tu pizza");
            System.out.println("-1- Pizza basica (queso manchego, jamon, masa delgada)");
            System.out.println("-2- Pizza basica pollo (queso manchego, pollo, masa delgada");
            System.out.println("-3- Pizza normal (queso chedar, jamon, masa gruesa");
            System.out.println("-4- Pizza pollo (queso manchego, pollo, masa gruesa");
            System.out.println("-5- Pizza ultra (queso chedar, salchicha, masa gruesa");

            String respuesta = recibeInputDelUsuario();

            switch (respuesta) {
                case "1":
                    producto = new PizzaBasica();
                    bandera = false;
                    break;
                case "2":
                    producto = new PizzaBasicaPollo();
                    bandera = false;
                    break;
                case "3":
                    producto = new PizzaNormal();
                    bandera = false;
                    break;
                case "4":
                    producto = new PizzaPollo();
                    bandera = false;
                    break;
                case "5":
                    producto = new PizzaUltra();
                    bandera = false;
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
                    break;
            }
        }
        return new AdapterPizza(producto);

    }

    private static Producto nuevoSanwichh() {
        Producto producto = null;
        System.out.println("Bienvenido, escoge los ingredientes de su sandwichh");
        producto = escogerPan(producto);
        producto = escogerIngredientes(producto);
        return producto;
    }

    private static int cantidadIngrediente(){
        boolean bandera = true;
        int id = -1;
        while (bandera) {
            System.out.println("-1- Lo quieres normal\n-2- Doble\n-3- Triple");
            try {
                id = Integer.parseInt(recibeInputDelUsuario());
                if ((id <= 3) & (id > 0)){
                    bandera = false;
                }
            } finally {
                System.out.println("Ingresa una opcion valida");
            }
        }
        return id;
    }

    private static Producto escogerIngredientes(Producto producto){
        boolean bandera = true;
        int cantidad;
        while (bandera){
            System.out.println("Escoge algun ingrediente");
            System.out.println(ingredientes);
            String idIngrediente = recibeInputDelUsuario();

            switch (idIngrediente) {
                case "1":
                    cantidad = cantidadIngrediente();
                    producto = new ConPollo(producto, cantidad);
                    break;
                case "2":
                    cantidad = cantidadIngrediente();
                    producto = new ConPepperoni(producto, cantidad);
                    break;
                case "3":
                    cantidad = cantidadIngrediente();
                    producto = new ConLechuga(producto, cantidad);
                    break;
                case "4":
                    cantidad = cantidadIngrediente();
                    producto = new ConJitomate(producto, cantidad);
                    break;
                case "5":
                    cantidad = cantidadIngrediente();
                    producto = new ConCebolla(producto, cantidad);
                    break;
                case "6":
                    cantidad = cantidadIngrediente();
                    producto = new ConMostaza(producto, cantidad);
                    break;
                case "7":
                    cantidad = cantidadIngrediente();
                    producto = new ConCatsup(producto, cantidad);
                    break;
                case "8":
                    cantidad = cantidadIngrediente();
                    producto = new ConMayonesa(producto, cantidad);
                    break;
                case "9":
                    bandera = false;
                    break;
                default:
                    System.out.println("Escoge una opcion valida (1, ..., 9)");
                    break;

            }
        }
        return producto;
    }

    private static Producto escogerPan(Producto producto){
        boolean bandera = true;
        System.out.println("Que tipo de pan quieres");
        System.out.println(panes);
        while (bandera) {
            String idPan = recibeInputDelUsuario();

            switch (idPan) {
                case "1":
                    producto = new PanNormal();
                    bandera = false;
                    break;
                case "2":
                    producto = new PanAjonjoli();
                    bandera = false;
                    break;
                default:
                    System.out.println("Escoge una opcion valida (1, 2)");
                    break;
            }
        }
        System.out.println("Resumen");
        System.out.println(producto.getIngredientes());
        System.out.println("Costo: " + producto.getCosto());
        return producto;
    }

}
