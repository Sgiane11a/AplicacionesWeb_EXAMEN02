package tecsup.edu.pe.examen2web.modelo;

import java.util.Date;

public class OrdenVenta {

    private String nroOrdenVta; // Clave Primaria
    private Date fechaEmision;
    private String motivo;
    private String situacion;

    public OrdenVenta() {
    }

    public OrdenVenta(String nroOrdenVta, Date fechaEmision, String motivo, String situacion) {
        this.nroOrdenVta = nroOrdenVta;
        this.fechaEmision = fechaEmision;
        this.motivo = motivo;
        this.situacion = situacion;
    }

    // Getters y setters

    public String getNroOrdenVta() {
        return nroOrdenVta;
    }

    public void setNroOrdenVta(String nroOrdenVta) {
        this.nroOrdenVta = nroOrdenVta;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }
}
