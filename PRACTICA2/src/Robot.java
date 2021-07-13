import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;

public class Robot {

    EstadoRobot atendiendo;
    EstadoRobot cocinando;
    EstadoRobot caminando;
    EstadoRobot suspendido;
    EstadoRobot estadoActual;

    MenuGeneral menuGeneral;
    MenuDiario menuDiario;
    MenuEspecial menuEspecial;

    Hashtable<String, MenuItem> listaMenus;

    MenuItem hamburguesaItem;


    public Robot(MenuGeneral menuGeneral, MenuDiario menuDiario, MenuEspecial menuEspecial){
        atendiendo = new Atendiendo(this);
        cocinando = new Cocinando(this);
        caminando = new Caminando(this);
        suspendido = new Suspendido(this);
        estadoActual = suspendido;
        this.hamburguesaItem = null;

        this.menuGeneral = menuGeneral;
        this.menuDiario = menuDiario;
        this.menuEspecial = menuEspecial;

        this.listaMenus = new Hashtable<>();

        this.guardaMenus();
        this.menuRobotPrincipal();

    }

    public void cocinarHamburguesa(){
        estadoActual.cocinar();
    }
    public void atenderCliente(){
        estadoActual.atender();
    }
    public void caminarToCliente(){
        estadoActual.caminar();
    }
    public void activarRobot(){
        estadoActual.activar();
    }
    public void suspenderRobot(){
        estadoActual.suspender();
    }


    public void setEstadoActual(EstadoRobot estado){
        this.estadoActual = estado;
    }

    public void setHamburguesaItem(MenuItem hamburguesaItem) {
        this.hamburguesaItem = hamburguesaItem;
    }

    public EstadoRobot getAtendiendo() {
        return atendiendo;
    }

    public EstadoRobot getCaminando() {
        return caminando;
    }

    public EstadoRobot getCocinando() {
        return cocinando;
    }

    public EstadoRobot getEstadoActual() {
        return estadoActual;
    }

    public EstadoRobot getSuspendido() {
        return suspendido;
    }


    ///Metodo para guardar los menus de forma interna

    private void guardaMenus(){
        Iterator menuGeneralit = menuGeneral.createIterator();
        Iterator menuDiarioit = menuDiario.createIterator();
        Iterator menuEspecialit = menuEspecial.createIterator();

        guardaIterator(menuGeneralit);
        guardaIterator(menuDiarioit);
        guardaIterator(menuEspecialit);


    }

    //Metodo auxiliar para guardar los elementos del iterator en la lista interna

    private void guardaIterator(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            listaMenus.put(item.id, item);
        }

    }

    public void leeMenu(){
        Iterator menuGeneralit = menuGeneral.createIterator();
        Iterator menuDiarioit = menuDiario.createIterator();
        Iterator menuEspecialit = menuEspecial.createIterator();

        System.out.println("------------Menu general:");
        imprimeMenuAux(menuGeneralit);
        System.out.println("------------Menu diario:");
        imprimeMenuAux(menuDiarioit);
        System.out.println("------------Menu especial:");
        imprimeMenuAux(menuEspecialit);

    }


    ///Metodo auxiliar para leer los menus

    public  void imprimeMenuAux(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.print("Id: "+ item.getId() + "-- ");
            System.out.print(item.getNombre() + ": ");
            System.out.print(item.getPrecio() + "$,-- ");
            System.out.println(item.getDescripcion() + " ");
        }
    }


    ///Metodo para que el cliente elija in menu. Se imprime el menu y se le pregunta al cliente su seleccion

    public MenuItem clienteEligeMenu(){
        MenuItem item = null;
        leeMenu();
        System.out.println("Regresar al menu principal : 666");
        String respuesta = recibeInputDelUsuario();

        if (respuesta == null || respuesta.equals("666")){
            //System.out.println("Suspendemos el robot");
            //setEstadoActual(this.getSuspendido());
            //this.suspenderRobot();
            this.menuRobotPrincipal();
        }

        if(validaIdMenu(respuesta)){
            item = listaMenus.get(respuesta);

            //cocinaHamburgesa(item);

        } else {
            System.out.println("Hamburguesa no valida");
            clienteEligeMenu();
        }

        return item;



    }

    ///Metodo auxiliar para recibir la respuesta del cliente

    private String recibeInputDelUsuario(){
        String respuesta = null;
        System.out.print("Escribe el Id de la hamburguesa que quieres:");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            respuesta = in.readLine();
        } catch (IOException e) {
            System.err.println("Error al leer tu respuesta hdtpm");
        }

        return respuesta;


    }

    ///Metodo auxiliar para revisar si la respuesta del usuario corresponde a una key valida del hashmap
    private boolean validaIdMenu(String respuesta){
        return listaMenus.containsKey(respuesta);

    }


    //Metodo para cocinar la hamburguesa

    public void cocinaHamburgesa(){
        Hamburguesa hamburguesa = null;
        System.out.println("Preparando Hamburguesa: " + this.hamburguesaItem.getNombre());

            if (this.hamburguesaItem.esVegetariano){
                //System.out.println("La ham es vegetariana");
                hamburguesa = new HamburguesaVegetariana(this.hamburguesaItem.tieneQueso);
            } else {
                //System.out.println("La ham no es vegetariana");
                hamburguesa = new HamburguesaCarnivora(this.hamburguesaItem.tieneQueso);
            }

            hamburguesa.cocinar();

            this.setEstadoActual(this.getCocinando());






    }

    public void cocinaPrro(){
        cocinarHamburguesa();
    }

    public void menuRobotPrincipal(){
        System.out.println("Bienvenido al robot de las hamburguesas, Selecciona una opcion");
        System.out.println("Selecciona una opcion");
        System.out.println("1 : Activar Robot");
        System.out.println("2 : Suspender Robot");
        System.out.println("3 : Atender");
        System.out.println("4 : Cocinar");
        System.out.println("5 : Caminar al cliente");
        System.out.println("6 : Salir del programa");

        String respuesta = recibeInputDelUsuario();

        switch (respuesta){
            case "1":
                activarRobot();
                break;
            case "2":
                suspenderRobot();
                break;
            case "3":
                atenderCliente();
                break;
            case "4":
                cocinarHamburguesa();
                break;
            case "5":
                caminarToCliente();
                break;
            case "6":
                System.exit(1);
                break;
            default:
                System.out.println("Selecciona una opcion valida");
                menuRobotPrincipal();
                break;


        }








    }




}