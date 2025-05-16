package tecsup.edu.pe.examen2web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tecsup.edu.pe.examen2web.dao.DetalleOrdenVtaDAO;
import tecsup.edu.pe.examen2web.modelo.DetalleOrdenVta;
import tecsup.edu.pe.examen2web.service.DetalleOrdenVtaService;

import java.util.List;

@Service
public class DetalleOrdenVtaServiceImpl implements DetalleOrdenVtaService {

    private final DetalleOrdenVtaDAO detalleOrdenVtaDAO;

    @Autowired
    public DetalleOrdenVtaServiceImpl(DetalleOrdenVtaDAO detalleOrdenVtaDAO) {
        this.detalleOrdenVtaDAO = detalleOrdenVtaDAO;
    }

    @Override
    public List<DetalleOrdenVta> listarPorNroOrdenVta(String nroOrdenVta) {
        return detalleOrdenVtaDAO.listarPorNroOrdenVta(nroOrdenVta);
    }

    @Override
    public DetalleOrdenVta obtenerPorId(String nroOrdenVta, String codMedicamento) {
        return detalleOrdenVtaDAO.buscarPorId(nroOrdenVta, codMedicamento);
    }

    @Override
    public void crear(DetalleOrdenVta detalleOrdenVta) {
        detalleOrdenVtaDAO.guardar(detalleOrdenVta);
    }

    @Override
    public void actualizar(DetalleOrdenVta detalleOrdenVta) {
        detalleOrdenVtaDAO.actualizar(detalleOrdenVta);
    }

    @Override
    public void eliminar(String nroOrdenVta, String codMedicamento) {
        detalleOrdenVtaDAO.eliminar(nroOrdenVta, codMedicamento);
    }
}