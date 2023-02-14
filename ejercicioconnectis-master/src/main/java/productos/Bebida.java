package productos;

public class Bebida extends Producto{
    private double litros;
    public Bebida(String nombre, int precio, double litros){
        super(nombre,precio);
        this.litros = litros;
    }
    @Override
    public String toString(){
        return   super.toString() + "/// " +
                "Litros: " + litros + " /// " +
                "Precio: $" + precio;
    }

}
