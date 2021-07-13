import java.util.ArrayList;
import java.util.Hashtable;

public class MenuEspecial {

    Hashtable<Integer, MenuItem> elementosMenu;
    int posicionIterator = 0;
    int numElementos =  0;

    public MenuEspecial(){
        this.elementosMenu = new Hashtable<>();
        agregaElemento("1D","CangreBurguer","Hamburguesa especial directa de fondo de bikini",
                100, true, false);
        agregaElemento("2D","MagickBurguer","Hamburguesa mágica (guiño, guiño)",
                150, true, false);
        agregaElemento("3D","SuperHamburguesaVegana","Hamburguesa vegana extra grande sin gluten",
                500, false, true);

    }


    public void agregaElemento(String id, String nombre, String descripcion, Integer precio, Boolean tieneQueso,
                               Boolean esVegetariano){
        MenuItem elementoMenu = new MenuItem(id, nombre, descripcion, precio, tieneQueso, esVegetariano);
        elementosMenu.put(numElementos,elementoMenu);
        this.numElementos +=1;

    }

    public Iterator createIterator(){

        return new MenuEspecialIterator(elementosMenu);
    }



}

