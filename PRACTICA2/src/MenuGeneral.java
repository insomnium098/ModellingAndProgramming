public class MenuGeneral{

    MenuItem[] elementosMenu;
    int posicionIterator = 0;
    static final int MAX_ELEMENTOS = 3;
    int numElementos =  0;

    public MenuGeneral(){
        this.elementosMenu = new MenuItem[3];
        agregaElemento("1G","HamburguesaQueso","Tradicional hamburguesa con queso",
                50, true, false);
        agregaElemento("2G","HamburguesaTocino","Hamburguesa con tocino",
                80, true, false);
        agregaElemento("3G","HamburguesaVegana","Hamburguesa vegana",
                200, false, true);

    }


    public void agregaElemento(String id, String nombre, String descripcion, Integer precio, Boolean tieneQueso,
                               Boolean esVegetariano){
        MenuItem elementoMenu = new MenuItem(id, nombre, descripcion, precio, tieneQueso, esVegetariano);
        if (numElementos >= MAX_ELEMENTOS){
            System.err.println("El menu esta lleno. Imposible agregar mas hamburgesas");
        } else {
            elementosMenu[numElementos] = elementoMenu;
            this.numElementos +=1;

        }

    }

    public Iterator createIterator(){
        return new MenuGeneralIterator(elementosMenu);
    }



}

