import productos.Alimento;
import productos.Bebida;
import productos.Producto;
import productos.Shampoo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Producto> productos = cargarProductos();
        imprimirProductos(productos);
        imprimirMasCaroYMasBarato(productos);
    }


    public static List<Producto> cargarProductos(){
        Producto cocazero = new Bebida("Coca-Cola Zero", 20, 1.5);
        Producto cocanormal = new Bebida("Coca-Cola", 18,  1.5);
        Producto shampooSedal = new Shampoo("Shampoo Sedal",19,500);
        Producto frutillas = new Alimento("Frutillas",64,"kilo");
        return Arrays.asList(cocazero,cocanormal,shampooSedal,frutillas);
    }
    public static void imprimirProductos(List<Producto> productos){
        productos.stream().forEach(
                p->System.out.println(p.toString())
        );
    }
    public static void imprimirMasCaroYMasBarato(List<Producto>productos){
        Collections.sort(productos);
        System.out.println("=============================\n" +
                "Producto más caro: " + productos.get(0).getNombre() + "\n" +
                "Producto más barato: " + productos.get(productos.size()-1).getNombre() +"\n"
        );
    }
}
