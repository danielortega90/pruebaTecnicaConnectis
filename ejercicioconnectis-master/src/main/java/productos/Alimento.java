package productos;

public class Alimento extends Producto {
    private String unidadDeVenta;
    public Alimento(String nombre, int precio, String unidadDeVenta){
        super(nombre,precio);
        this.unidadDeVenta = unidadDeVenta;
    }
    @Override
    public String toString(){
        return super.toString() + "/// " +
                "Precio: $" + precio + " /// " +
                "Unidad de venta: " + unidadDeVenta;
    }
}
