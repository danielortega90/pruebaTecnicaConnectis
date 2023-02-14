package productos;

public abstract class Producto implements Comparable<Producto>{
    protected int precio;
    protected String nombre;
    public Producto(String nombre, int precio){
        this.precio = precio;
        this.nombre = nombre;
    }
    public int getPrecio(){
        return precio;
    }
    @Override
    public String toString(){
        return "Nombre: " + nombre + " "; // Asumo que todos los productos siempre se listan con el nombre primero.
    }
    public String getNombre(){
        return nombre;
    }
    @Override
    public int compareTo(Producto producto) {
        return producto.getPrecio()-this.getPrecio();
    }
}
