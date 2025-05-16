package tecsup.edu.pe.examen2web.dao;

import tecsup.edu.pe.examen2web.modelo.DetalleOrdenVta;
import java.util.List;

public interface DetalleOrdenVtaDAO {

    List<DetalleOrdenVta> listarPorNroOrdenVta(String nroOrdenVta);
    DetalleOrdenVta buscarPorId(String nroOrdenVta, String codMedicamento);
    void guardar(DetalleOrdenVta detalleOrdenVta);
    void actualizar(DetalleOrdenVta detalleOrdenVta);
    void eliminar(String nroOrdenVta, String codMedicamento);
}