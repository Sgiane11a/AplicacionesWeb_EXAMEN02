package tecsup.edu.pe.examen2web.dao;

import tecsup.edu.pe.examen2web.modelo.OrdenVenta;
import java.util.List;

public interface OrdenVentaDAO {

    List<OrdenVenta> listar();
    OrdenVenta buscarPorNroOrdenVta(String nroOrdenVta);
    void guardar(OrdenVenta ordenVenta);
    void actualizar(OrdenVenta ordenVenta);
    void eliminar(String nroOrdenVta);
}