
import Articulo.Articulo;
import Articulo.*;
public interface Precio extends Articulo{

    public default float precioArticulo(int cantidad)
    {
        return cantidad*precio;
    }

}
