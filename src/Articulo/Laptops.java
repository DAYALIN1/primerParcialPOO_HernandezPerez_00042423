package Articulo;

public class Laptops extends Articulo implements Precio{

    private String dimensiones;
    private char accesorios;

    public Laptops(String dimensiones, char accesorios) {
        this.dimensiones = dimensiones;
        this.accesorios = accesorios;
    }

    public Laptops(String nombre, String modelo, String marca, String dimensiones, char accesorios, float precio) {
        super(nombre, modelo, marca, precio);
        this.dimensiones = dimensiones;
        this.accesorios = accesorios;
    }

    public Laptops(Articulo articulo, String dimensiones, char accesorios) {
        super(articulo);
        this.dimensiones = dimensiones;
        this.accesorios = accesorios;
    }

    public void Articulo(Articulo articulo) {

    }
}
