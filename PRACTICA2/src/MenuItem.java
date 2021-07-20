

public class MenuItem {
    String id;
    String nombre;
    String descripcion;
    Integer precio;
    Boolean tieneQueso;
    Boolean esVegetariano;

    public MenuItem(String id, String nombre, String descripcion, Integer precio,
                    Boolean tieneQueso, Boolean esVegetariano){

        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tieneQueso = tieneQueso;
        this.esVegetariano = esVegetariano;

    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Boolean getTieneQueso() {
        return tieneQueso;
    }

    public Boolean getEsVegetariano() {
        return esVegetariano;
    }
}
