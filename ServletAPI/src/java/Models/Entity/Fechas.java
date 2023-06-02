/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author user
 */
public class Fechas implements Serializable{
    private long idFecha;
    private String nombreCalendarizacion;
    private Timestamp fechaInicioEjecucionCertificacion;
    private Timestamp fechaFinEjecucionCertificacion;
    private Timestamp fechaCertificacionUltimoDia;
    private Timestamp fechaEntradaVigorObligacion;

    public Fechas() {
    }

    public Fechas(long idFecha, String nombreCalendarizacion, Timestamp fechaInicioEjecucionCertificacion, Timestamp fechaFinEjecucionCertificacion, Timestamp fechaCertificacionUltimoDia, Timestamp fechaEntradaVigorObligacion) {
        this.idFecha = idFecha;
        this.nombreCalendarizacion = nombreCalendarizacion;
        this.fechaInicioEjecucionCertificacion = fechaInicioEjecucionCertificacion;
        this.fechaFinEjecucionCertificacion = fechaFinEjecucionCertificacion;
        this.fechaCertificacionUltimoDia = fechaCertificacionUltimoDia;
        this.fechaEntradaVigorObligacion = fechaEntradaVigorObligacion;
    }

    public long getIdFecha() {
        return idFecha;
    }

    public void setIdFecha(long idFecha) {
        this.idFecha = idFecha;
    }

    public String getNombreCalendarizacion() {
        return nombreCalendarizacion;
    }

    public void setNombreCalendarizacion(String nombreCalendarizacion) {
        this.nombreCalendarizacion = nombreCalendarizacion;
    }

    public Timestamp getFechaInicioEjecucionCertificacion() {
        return fechaInicioEjecucionCertificacion;
    }

    public void setFechaInicioEjecucionCertificacion(Timestamp fechaInicioEjecucionCertificacion) {
        this.fechaInicioEjecucionCertificacion = fechaInicioEjecucionCertificacion;
    }

    public Timestamp getFechaFinEjecucionCertificacion() {
        return fechaFinEjecucionCertificacion;
    }

    public void setFechaFinEjecucionCertificacion(Timestamp fechaFinEjecucionCertificacion) {
        this.fechaFinEjecucionCertificacion = fechaFinEjecucionCertificacion;
    }

    public Timestamp getFechaCertificacionUltimoDia() {
        return fechaCertificacionUltimoDia;
    }

    public void setFechaCertificacionUltimoDia(Timestamp fechaCertificacionUltimoDia) {
        this.fechaCertificacionUltimoDia = fechaCertificacionUltimoDia;
    }

    public Timestamp getFechaEntradaVigorObligacion() {
        return fechaEntradaVigorObligacion;
    }

    public void setFechaEntradaVigorObligacion(Timestamp fechaEntradaVigorObligacion) {
        this.fechaEntradaVigorObligacion = fechaEntradaVigorObligacion;
    }

    @Override
    public String toString() {
        return "Fechas{" + "idFecha=" + idFecha + ", nombreCalendarizacion=" + nombreCalendarizacion + ", fechaInicioEjecucionCertificacion=" + fechaInicioEjecucionCertificacion + ", fechaFinEjecucionCertificacion=" + fechaFinEjecucionCertificacion + ", fechaCertificacionUltimoDia=" + fechaCertificacionUltimoDia + ", fechaEntradaVigorObligacion=" + fechaEntradaVigorObligacion + '}';
    }
    
}
