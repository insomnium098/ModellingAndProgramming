public class Main {

    public static void main(String[] args) {

        MenuGeneral menu = new MenuGeneral();
        MenuDiario menuDiario = new MenuDiario();
        MenuEspecial menuEspecial = new MenuEspecial();

        Iterator menuGeneral = menu.createIterator();
        System.out.println("------------Menu general:");
        imprimeMenu(menuGeneral);

        Iterator menuDiarioit = menuDiario.createIterator();
        System.out.println("------------Menu Diario:");
        imprimeMenu(menuDiarioit);

        Iterator menuEspecialit = menuEspecial.createIterator();
        System.out.println("------------Menu Especial:");
        imprimeMenu(menuEspecialit);






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
