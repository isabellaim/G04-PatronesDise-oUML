package espol.edu.ec.patronesdisenouml.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cliente {
        private List<ProductoConcreto> productos;

    public Cliente(List<ProductoConcreto> productos) {
        this.productos = productos;
    }

    public void mostrarProductosDisponibles() {
        List<ProductoConcreto> disponibles = productos.stream().filter(p -> !p.tieneFallas() && !p.enReparacion()).collect(Collectors.toList());
        IteradorProducto iterador = new IteradorConcreto(disponibles);
        while (iterador.tieneMas()) {
            ProductoConcreto producto = iterador.siguiente();
            System.out.println("Producto Disponible: " + producto.getNombre());
        }
    }

    public void mostrarProductosPorTienda(String tiendaId) {
        List<ProductoConcreto> enTienda = productos.stream().filter(p -> p.getTiendaId().equals(tiendaId)).collect(Collectors.toList());
        IteradorProducto iterador = new IteradorConcreto(enTienda);
        while (iterador.tieneMas()) {
            ProductoConcreto producto = iterador.siguiente();
            System.out.println("Producto en Tienda: " + producto.getNombre());
        }
    }

    public void mostrarProductosConFallas() {
        List<ProductoConcreto> conFallas = productos.stream().filter(ProductoConcreto::tieneFallas).collect(Collectors.toList());
        IteradorProducto iterador = new IteradorConcreto(conFallas);
        while (iterador.tieneMas()) {
            ProductoConcreto producto = iterador.siguiente();
            System.out.println("Producto con Fallas: " + producto.getNombre());
        }
    }

    public void mostrarProductosEnReparacion() {
        List<ProductoConcreto> enReparacion = productos.stream().filter(ProductoConcreto::enReparacion).collect(Collectors.toList());
        IteradorProducto iterador = new IteradorConcreto(enReparacion);
        while (iterador.tieneMas()) {
            ProductoConcreto producto = iterador.siguiente();
            System.out.println("Producto en Reparación: " + producto.getNombre());
        }
    }

    // Método main que actúa como punto de entrada.
    public static void main(String[] args) {
        List<ProductoConcreto> productos = new ArrayList<>();
        productos.add(new ProductoConcreto("1", "Laptop", "Tienda1", false, false));
        productos.add(new ProductoConcreto("2", "Impresora", "Tienda2", true, false));
        productos.add(new ProductoConcreto("3", "Televisión", "Tienda1", false, true));
        productos.add(new ProductoConcreto("4", "Celular", "Tienda3", false, false));

        Cliente cliente = new Cliente(productos);

        System.out.println("Productos Disponibles:");
        cliente.mostrarProductosDisponibles();

        System.out.println("\nProductos en Tienda1:");
        cliente.mostrarProductosPorTienda("Tienda1");

        System.out.println("\nProductos con Fallas:");
        cliente.mostrarProductosConFallas();

        System.out.println("\nProductos en Reparación:");
        cliente.mostrarProductosEnReparacion();
    }
}
