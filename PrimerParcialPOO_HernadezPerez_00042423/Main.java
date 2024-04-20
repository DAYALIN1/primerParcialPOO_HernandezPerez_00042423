import Articulo.Articulo;
import Articulo.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner sn = new Scanner(System.in);
        int opcion;
try {

    imprimirmenu();
    opcion = sn.nextInt();

    if(opcion == 0)
    {
        System.out.println("gracias por su visita");
        break;
    }


} catch (Exception e) {
    throw new RuntimeException(e);
}


        switch (opcion)
{
    case 1:
        agregar();
        break;
    case 2:
        modificar();
        break;
    case 3:
        mostrar();
        break;
    default:
        System.out.println("ingrerse una opcion valida");
        break;
}
        
}

    private static void mostrar() {
    }

    private static void modificar() {
    }

    private static void agregar() {
        {
            Object articulo = new Object();
            Scanner sn = new Scanner(Articulo articulo);
            System.out.println("nombre"+articulo.nombre);
        }

    }
    private static void imprimirmenu(menuprincipal) {
    }

    public void menuprincipal(Articulo articulo){
        System.out.println("por favor seleccione una opcio:" +
                "\t1.agregar articulo\n"+
                "\t2.modificar aarticulo\n"+
                "\t3.mostrar listado\n"+
                "\t0.salir ");
    }
}