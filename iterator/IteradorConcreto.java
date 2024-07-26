package espol.edu.ec.patronesdisenouml.iterator;

import java.util.List;

class IteradorConcreto implements IteradorProducto {
    private List<ProductoConcreto> productos;
    private int posicion;

    public IteradorConcreto(List<ProductoConcreto> productos) {
        this.productos = productos;
        this.posicion = 0;
    }

    @Override
    public boolean tieneMas() {
        return posicion < productos.size();
    }

    @Override
    public ProductoConcreto siguiente() {
        return productos.get(posicion++);
    }
}
