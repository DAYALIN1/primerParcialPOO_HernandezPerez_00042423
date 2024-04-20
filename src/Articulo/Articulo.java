package Articulo;

import Precio.Precio;

public abstract class Articulo implements Precio {

    private String nombre;
    private String modelo;
    private String marca;Articulo
    protected float precio;

    public Articulo(){}

    public Articulo(String nombre, String modelo, String marca, float precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public abstract void Articulo(Articulo articulo);
    public void obtenerprecio(){}

    public Articulo(Articulo articulo)
    {
        nombre = articulo.nombre;
        modelo = articulo.modelo;
        marca = articulo.marca;
        precio = articulo.precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio(){
        return precio;
    }

    public void setPrecio(float precio)
    {
        this.precio = precio;
    }

}
