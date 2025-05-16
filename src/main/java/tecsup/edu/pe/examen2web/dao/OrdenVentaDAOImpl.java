package tecsup.edu.pe.examen2web.dao;

import tecsup.edu.pe.examen2web.dao.OrdenVentaDAO;
import tecsup.edu.pe.examen2web.modelo.OrdenVenta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class OrdenVentaDAOImpl implements OrdenVentaDAO {

    private Map<String, OrdenVenta> baseDatos = new HashMap<>();

    public OrdenVentaDAOImpl() {
        // Inicialización de datos de ejemplo (opcional)
        // baseDatos.put("OV001", new OrdenVenta("OV001", new Date(), "Venta Regular", "Pendiente"));
        // baseDatos.put("OV002", new OrdenVenta("OV002", new Date(), "Venta Online", "Completada"));
    }

    @Override
    public List<OrdenVenta> listar() {
        return new ArrayList<>(baseDatos.values());
    }

    @Override
    public OrdenVenta buscarPorNroOrdenVta(String nroOrdenVta) {
        return baseDatos.get(nroOrdenVta);
    }

    @Override
    public void guardar(OrdenVenta ordenVenta) {
        baseDatos.put(ordenVenta.getNroOrdenVta(), ordenVenta);
    }

    @Override
    public void actualizar(OrdenVenta ordenVenta) {
        baseDatos.put(ordenVenta.getNroOrdenVta(), ordenVenta);
    }

    @Override
    public void eliminar(String nroOrdenVta) {
        baseDatos.remove(nroOrdenVta);
    }
}
