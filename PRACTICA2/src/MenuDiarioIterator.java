import java.util.ArrayList;

public class MenuDiarioIterator implements Iterator {
    ArrayList<MenuItem> elementosMenu;
    int posicionIterator = 0;

    public MenuDiarioIterator(ArrayList<MenuItem>elementosMenu) {
        this.elementosMenu = elementosMenu;
    }

    @Override
    public boolean hasNext() {
        if (this.posicionIterator >= elementosMenu.size() || elementosMenu.get(posicionIterator) == null) {
            return false;
        } else {
            return true;
        }
    }


    @Override
    public Object next() {

        MenuItem elemento = elementosMenu.get(posicionIterator);
        this.posicionIterator += 1;
        return elemento;
    }


}
