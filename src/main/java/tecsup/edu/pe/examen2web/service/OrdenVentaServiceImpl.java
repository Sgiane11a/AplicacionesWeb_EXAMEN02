package tecsup.edu.pe.examen2web.service;

import tecsup.edu.pe.examen2web.dao.OrdenVentaDAO;
import tecsup.edu.pe.examen2web.modelo.OrdenVenta;
import tecsup.edu.pe.examen2web.service.OrdenVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenVentaServiceImpl implements OrdenVentaService {

    private final OrdenVentaDAO ordenVentaDAO;

    @Autowired
    public OrdenVentaServiceImpl(OrdenVentaDAO ordenVentaDAO) {
        this.ordenVentaDAO = ordenVentaDAO;
    }

    @Override
    public List<OrdenVenta> listar() {
        return ordenVentaDAO.listar();
    }

    @Override
    public OrdenVenta obtenerPorNroOrdenVta(String nroOrdenVta) {
        return ordenVentaDAO.buscarPorNroOrdenVta(nroOrdenVta);
    }

    @Override
    public void crear(OrdenVenta ordenVenta) {
        ordenVentaDAO.guardar(ordenVenta);
    }

    @Override
    public void actualizar(OrdenVenta ordenVenta) {
        ordenVentaDAO.actualizar(ordenVenta);
    }

    @Override
    public void eliminar(String nroOrdenVta) {
        ordenVentaDAO.eliminar(nroOrdenVta);
    }
}