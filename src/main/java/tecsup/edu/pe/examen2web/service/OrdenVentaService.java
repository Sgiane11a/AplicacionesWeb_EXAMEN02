package tecsup.edu.pe.examen2web.service;

import tecsup.edu.pe.examen2web.modelo.OrdenVenta;
import java.util.List;

public interface OrdenVentaService {

    List<OrdenVenta> listar();
    OrdenVenta obtenerPorNroOrdenVta(String nroOrdenVta);
    void crear(OrdenVenta ordenVenta);
    void actualizar(OrdenVenta ordenVenta);
    void eliminar(String nroOrdenVta);
}