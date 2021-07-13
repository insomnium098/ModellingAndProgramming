public class Main {

    public static void main(String[] args) {



        MenuGeneral menuGeneral = new MenuGeneral();
        MenuDiario menuDiario = new MenuDiario();
        MenuEspecial menuEspecial = new MenuEspecial();

        /*

        Iterator menuGeneralit = menuGeneral.createIterator();
        System.out.println("------------Menu general:");
        imprimeMenu(menuGeneralit);

        Iterator menuDiarioit = menuDiario.createIterator();
        System.out.println("------------Menu Diario:");
        imprimeMenu(menuDiarioit);

        Iterator menuEspecialit = menuEspecial.createIterator();
        System.out.println("------------Menu Especial:");
        imprimeMenu(menuEspecialit);

         */


        ///Comenzando Robot

        Robot robot = new Robot(menuGeneral, menuDiario, menuEspecial);

        //System.out.println("Imprimiendo desde el robot");
        //robot.activarRobot();


        //robot.clienteEligeMenu();

        ///robot.suspenderRobot();





    }

    public static void imprimeMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.print(item.getNombre() + ": ");
            System.out.print(item.getPrecio() + "$,-- ");
            System.out.println(item.getDescripcion() + " ");
        }
    }
}
