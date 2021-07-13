public class MenuGeneralIterator implements Iterator {
    MenuItem[] elementosMenu;
    int posicionIterator = 0;

    public MenuGeneralIterator(MenuItem[] elementosMenu) {
        this.elementosMenu = elementosMenu;
    }

    @Override
    public boolean hasNext() {
        if (this.posicionIterator >= elementosMenu.length || elementosMenu[posicionIterator] == null) {
            return false;
        } else {
            return true;
        }
    }


    @Override
    public Object next() {

        MenuItem elemento = elementosMenu[posicionIterator];
        this.posicionIterator += 1;
        return elemento;
    }


}
