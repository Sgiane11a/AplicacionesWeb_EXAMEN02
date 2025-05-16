package tecsup.edu.pe.examen2web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tecsup.edu.pe.examen2web.modelo.DetalleOrdenVta;
import tecsup.edu.pe.examen2web.service.DetalleOrdenVtaService;

import java.util.List;

@RestController
@RequestMapping("/ordenes-venta/{nroOrdenVta}/detalles")
public class DetalleOrdenVtaController {

    private final DetalleOrdenVtaService detalleOrdenVtaService;

    @Autowired
    public DetalleOrdenVtaController(DetalleOrdenVtaService detalleOrdenVtaService) {
        this.detalleOrdenVtaService = detalleOrdenVtaService;
    }

    @GetMapping
    public List<DetalleOrdenVta> listarDetalles(@PathVariable String nroOrdenVta) {
        return detalleOrdenVtaService.listarPorNroOrdenVta(nroOrdenVta);
    }

    @GetMapping("/{codMedicamento}")
    public DetalleOrdenVta obtenerDetalle(@PathVariable String nroOrdenVta, @PathVariable String codMedicamento) {
        return detalleOrdenVtaService.obtenerPorId(nroOrdenVta, codMedicamento);
    }

    @PostMapping
    public void crearDetalle(@PathVariable String nroOrdenVta, @RequestBody DetalleOrdenVta detalleOrdenVta) {
        detalleOrdenVta.setNroOrdenVta(nroOrdenVta);
        detalleOrdenVtaService.crear(detalleOrdenVta);
    }

    @PutMapping("/{codMedicamento}")
    public void actualizarDetalle(@PathVariable String nroOrdenVta, @PathVariable String codMedicamento, @RequestBody DetalleOrdenVta detalleOrdenVta) {
        detalleOrdenVta.setNroOrdenVta(nroOrdenVta);
        detalleOrdenVta.setCodMedicamento(codMedicamento);
        detalleOrdenVtaService.actualizar(detalleOrdenVta);
    }

    @DeleteMapping("/{codMedicamento}")
    public void eliminarDetalle(@PathVariable String nroOrdenVta, @PathVariable String codMedicamento) {
        detalleOrdenVtaService.eliminar(nroOrdenVta, codMedicamento);
    }
}