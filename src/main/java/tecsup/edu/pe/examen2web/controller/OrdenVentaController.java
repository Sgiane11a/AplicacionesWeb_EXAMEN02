package tecsup.edu.pe.examen2web.controller;

import tecsup.edu.pe.examen2web.modelo.OrdenVenta;
import tecsup.edu.pe.examen2web.service.OrdenVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordenes-venta")
public class OrdenVentaController {

    private final OrdenVentaService ordenVentaService;

    @Autowired
    public OrdenVentaController(OrdenVentaService ordenVentaService) {
        this.ordenVentaService = ordenVentaService;
    }

    @GetMapping
    public List<OrdenVenta> listarOrdenesVenta() {
        return ordenVentaService.listar();
    }

    @GetMapping("/{nroOrdenVta}")
    public OrdenVenta obtenerOrdenVenta(@PathVariable String nroOrdenVta) {
        return ordenVentaService.obtenerPorNroOrdenVta(nroOrdenVta);
    }

    @PostMapping
    public void crearOrdenVenta(@RequestBody OrdenVenta ordenVenta) {
        ordenVentaService.crear(ordenVenta);
    }

    @PutMapping("/{nroOrdenVta}")
    public void actualizarOrdenVenta(@PathVariable String nroOrdenVta, @RequestBody OrdenVenta ordenVenta) {
        ordenVenta.setNroOrdenVta(nroOrdenVta);
        ordenVentaService.actualizar(ordenVenta);
    }

    @DeleteMapping("/{nroOrdenVta}")
    public void eliminarOrdenVenta(@PathVariable String nroOrdenVta) {
        ordenVentaService.eliminar(nroOrdenVta);
    }
}