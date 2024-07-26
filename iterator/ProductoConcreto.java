package espol.edu.ec.patronesdisenouml.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Clase ProductoConcreto
class ProductoConcreto {
    private String id;
    private String nombre;
    private String tiendaId;
    private boolean tieneFallas;
    private boolean enReparacion;

    public ProductoConcreto(String id, String nombre, String tiendaId, boolean tieneFallas, boolean enReparacion) {
        this.id = id;
        this.nombre = nombre;
        this.tiendaId = tiendaId;
        this.tieneFallas = tieneFallas;
        this.enReparacion = enReparacion;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTiendaId() {
        return tiendaId;
    }

    public boolean tieneFallas() {
        return tieneFallas;
    }

    public boolean enReparacion() {
        return enReparacion;
    }
}
