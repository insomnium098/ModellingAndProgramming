import java.awt.*;
import java.util.ArrayList;

public class MenuDiario {

    ArrayList<MenuItem> elementosMenu;
    int posicionIterator = 0;
    int numElementos =  0;

    public MenuDiario(){
        this.elementosMenu = new ArrayList<>();
        agregaElemento("1D","HamburguesaCampesina","Hamburguesa con tocino, queso oaxaca y salchicha",
                100, true, false);
        agregaElemento("2D","HamburguesaCubana","Hamburguesa con todos los ingredientes imaginables",
                150, true, false);
        agregaElemento("3D","HamburguesaVeganaJumbo","Hamburguesa vegana extra grande",
                400, false, true);

    }


    public void agregaElemento(String id, String nombre, String descripcion, Integer precio, Boolean tieneQueso,
                               Boolean esVegetariano){
        MenuItem elementoMenu = new MenuItem(id, nombre, descripcion, precio, tieneQueso, esVegetariano);
        elementosMenu.add(elementoMenu);
        this.numElementos +=1;

    }

    public Iterator createIterator(){

        return new MenuDiarioIterator(elementosMenu);
    }



}

