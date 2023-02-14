package productos;

public class Shampoo extends Producto {
    private int contenido;
    public Shampoo(String nombre, int precio, int contenido){
        super(nombre,precio);
        this.contenido = contenido;
    }
    @Override
    public String toString(){
        return  super.toString() + "/// " +
                "Contenido: " + contenido + "ml /// " +
                "Precio: $" + precio;
    }
}
