package Articulo;
import Articulo.Articulo;
import Precio.Precio;

public class Telefono extends Articulo implements Precio {

    private String numero;


    public Telefono(String nombre, String modelo, String marca, String numero, float precio) {
        super(nombre, modelo, marca, precio);
        this.numero = numero;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void Articulo(Articulo articulo) {

    }
}
