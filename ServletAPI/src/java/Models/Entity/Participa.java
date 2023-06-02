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
 * @author Dan Israel Bobadilla
 */
public class Participa implements Serializable {
    private long idParticipa;
    private int idAplicacion;
    private int idPrueba;
    private String nombreResponsablePrueba;
    private String correoResponsablePrueba;
    private String telefonoResponsablePrueba;
    private String nombreContactoTecnico;
    private String correoContactoTecnico;
    private String telefonoContactoTecnico;
    private String nombreContactoOperativo;
    private String correoContactoOperativo;
    private String telefonoContactoOperativo;
    private Timestamp fechaCertificacion;
    private Timestamp fechaFinEvaluacion;
    private Timestamp fechaFirmaSSSPIM;
    private Timestamp fechaFirmaGCCSSPIM;
    private Timestamp fechaEnvioInformeInstitucion;
    private Timestamp fechaImplementacionProduccion;
    private int detallesPruebaReporteRemedy;
    private String duracionEvaluacion;
    private String duracionRevisionSSSPIM;
    private String duracionRevisionGCCSSPIM;
    private String duracionTotalProcesoPrueba;
    private String duracionTotalProceso;
    private Timestamp fechaEntregaCedulaResultados;
    private String comentarios;

    public Participa() {
    }

    public Participa(long idParticipa, int idAplicacion, int idPrueba, String nombreResponsablePrueba, String correoResponsablePrueba, String telefonoResponsablePrueba, String nombreContactoTecnico, String correoContactoTecnico, String telefonoContactoTecnico, String nombreContactoOperativo, String correoContactoOperativo, String telefonoContactoOperativo, Timestamp fechaCertificacion, Timestamp fechaFinEvaluacion, Timestamp fechaFirmaSSSPIM, Timestamp fechaFirmaGCCSSPIM, Timestamp fechaEnvioInformeInstitucion, Timestamp fechaImplementacionProduccion, int detallesPruebaReporteRemedy, String duracionEvaluacion, String duracionRevisionSSSPIM, String duracionRevisionGCCSSPIM, String duracionTotalProcesoPrueba, String duracionTotalProceso, Timestamp fechaEntregaCedulaResultados, String comentarios) {
        this.idParticipa = idParticipa;
        this.idAplicacion = idAplicacion;
        this.idPrueba = idPrueba;
        this.nombreResponsablePrueba = nombreResponsablePrueba;
        this.correoResponsablePrueba = correoResponsablePrueba;
        this.telefonoResponsablePrueba = telefonoResponsablePrueba;
        this.nombreContactoTecnico = nombreContactoTecnico;
        this.correoContactoTecnico = correoContactoTecnico;
        this.telefonoContactoTecnico = telefonoContactoTecnico;
        this.nombreContactoOperativo = nombreContactoOperativo;
        this.correoContactoOperativo = correoContactoOperativo;
        this.telefonoContactoOperativo = telefonoContactoOperativo;
        this.fechaCertificacion = fechaCertificacion;
        this.fechaFinEvaluacion = fechaFinEvaluacion;
        this.fechaFirmaSSSPIM = fechaFirmaSSSPIM;
        this.fechaFirmaGCCSSPIM = fechaFirmaGCCSSPIM;
        this.fechaEnvioInformeInstitucion = fechaEnvioInformeInstitucion;
        this.fechaImplementacionProduccion = fechaImplementacionProduccion;
        this.detallesPruebaReporteRemedy = detallesPruebaReporteRemedy;
        this.duracionEvaluacion = duracionEvaluacion;
        this.duracionRevisionSSSPIM = duracionRevisionSSSPIM;
        this.duracionRevisionGCCSSPIM = duracionRevisionGCCSSPIM;
        this.duracionTotalProcesoPrueba = duracionTotalProcesoPrueba;
        this.duracionTotalProceso = duracionTotalProceso;
        this.fechaEntregaCedulaResultados = fechaEntregaCedulaResultados;
        this.comentarios = comentarios;
    }

    public long getIdParticipa() {
        return idParticipa;
    }

    public void setIdParticipa(long idParticipa) {
        this.idParticipa = idParticipa;
    }

    public int getIdAplicacion() {
        return idAplicacion;
    }

    public void setIdAplicacion(int idAplicacion) {
        this.idAplicacion = idAplicacion;
    }

    public int getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(int idPrueba) {
        this.idPrueba = idPrueba;
    }

    public String getNombreResponsablePrueba() {
        return nombreResponsablePrueba;
    }

    public void setNombreResponsablePrueba(String nombreResponsablePrueba) {
        this.nombreResponsablePrueba = nombreResponsablePrueba;
    }

    public String getCorreoResponsablePrueba() {
        return correoResponsablePrueba;
    }

    public void setCorreoResponsablePrueba(String correoResponsablePrueba) {
        this.correoResponsablePrueba = correoResponsablePrueba;
    }

    public String getTelefonoResponsablePrueba() {
        return telefonoResponsablePrueba;
    }

    public void setTelefonoResponsablePrueba(String telefonoResponsablePrueba) {
        this.telefonoResponsablePrueba = telefonoResponsablePrueba;
    }

    public String getNombreContactoTecnico() {
        return nombreContactoTecnico;
    }

    public void setNombreContactoTecnico(String nombreContactoTecnico) {
        this.nombreContactoTecnico = nombreContactoTecnico;
    }

    public String getCorreoContactoTecnico() {
        return correoContactoTecnico;
    }

    public void setCorreoContactoTecnico(String correoContactoTecnico) {
        this.correoContactoTecnico = correoContactoTecnico;
    }

    public String getTelefonoContactoTecnico() {
        return telefonoContactoTecnico;
    }

    public void setTelefonoContactoTecnico(String telefonoContactoTecnico) {
        this.telefonoContactoTecnico = telefonoContactoTecnico;
    }

    public String getNombreContactoOperativo() {
        return nombreContactoOperativo;
    }

    public void setNombreContactoOperativo(String nombreContactoOperativo) {
        this.nombreContactoOperativo = nombreContactoOperativo;
    }

    public String getCorreoContactoOperativo() {
        return correoContactoOperativo;
    }

    public void setCorreoContactoOperativo(String correoContactoOperativo) {
        this.correoContactoOperativo = correoContactoOperativo;
    }

    public String getTelefonoContactoOperativo() {
        return telefonoContactoOperativo;
    }

    public void setTelefonoContactoOperativo(String telefonoContactoOperativo) {
        this.telefonoContactoOperativo = telefonoContactoOperativo;
    }

    public Timestamp getFechaCertificacion() {
        return fechaCertificacion;
    }

    public void setFechaCertificacion(Timestamp fechaCertificacion) {
        this.fechaCertificacion = fechaCertificacion;
    }

    public Timestamp getFechaFinEvaluacion() {
        return fechaFinEvaluacion;
    }

    public void setFechaFinEvaluacion(Timestamp fechaFinEvaluacion) {
        this.fechaFinEvaluacion = fechaFinEvaluacion;
    }

    public Timestamp getFechaFirmaSSSPIM() {
        return fechaFirmaSSSPIM;
    }

    public void setFechaFirmaSSSPIM(Timestamp fechaFirmaSSSPIM) {
        this.fechaFirmaSSSPIM = fechaFirmaSSSPIM;
    }

    public Timestamp getFechaFirmaGCCSSPIM() {
        return fechaFirmaGCCSSPIM;
    }

    public void setFechaFirmaGCCSSPIM(Timestamp fechaFirmaGCCSSPIM) {
        this.fechaFirmaGCCSSPIM = fechaFirmaGCCSSPIM;
    }

    public Timestamp getFechaEnvioInformeInstitucion() {
        return fechaEnvioInformeInstitucion;
    }

    public void setFechaEnvioInformeInstitucion(Timestamp fechaEnvioInformeInstitucion) {
        this.fechaEnvioInformeInstitucion = fechaEnvioInformeInstitucion;
    }

    public Timestamp getFechaImplementacionProduccion() {
        return fechaImplementacionProduccion;
    }

    public void setFechaImplementacionProduccion(Timestamp fechaImplementacionProduccion) {
        this.fechaImplementacionProduccion = fechaImplementacionProduccion;
    }

    public int getDetallesPruebaReporteRemedy() {
        return detallesPruebaReporteRemedy;
    }

    public void setDetallesPruebaReporteRemedy(int detallesPruebaReporteRemedy) {
        this.detallesPruebaReporteRemedy = detallesPruebaReporteRemedy;
    }

    public String getDuracionEvaluacion() {
        return duracionEvaluacion;
    }

    public void setDuracionEvaluacion(String duracionEvaluacion) {
        this.duracionEvaluacion = duracionEvaluacion;
    }

    public String getDuracionRevisionSSSPIM() {
        return duracionRevisionSSSPIM;
    }

    public void setDuracionRevisionSSSPIM(String duracionRevisionSSSPIM) {
        this.duracionRevisionSSSPIM = duracionRevisionSSSPIM;
    }

    public String getDuracionRevisionGCCSSPIM() {
        return duracionRevisionGCCSSPIM;
    }

    public void setDuracionRevisionGCCSSPIM(String duracionRevisionGCCSSPIM) {
        this.duracionRevisionGCCSSPIM = duracionRevisionGCCSSPIM;
    }

    public String getDuracionTotalProcesoPrueba() {
        return duracionTotalProcesoPrueba;
    }

    public void setDuracionTotalProcesoPrueba(String duracionTotalProcesoPrueba) {
        this.duracionTotalProcesoPrueba = duracionTotalProcesoPrueba;
    }

    public String getDuracionTotalProceso() {
        return duracionTotalProceso;
    }

    public void setDuracionTotalProceso(String duracionTotalProceso) {
        this.duracionTotalProceso = duracionTotalProceso;
    }

    public Timestamp getFechaEntregaCedulaResultados() {
        return fechaEntregaCedulaResultados;
    }

    public void setFechaEntregaCedulaResultados(Timestamp fechaEntregaCedulaResultados) {
        this.fechaEntregaCedulaResultados = fechaEntregaCedulaResultados;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Participa{" + "idParticipa=" + idParticipa + ", idAplicacion=" + idAplicacion + ", idPrueba=" + idPrueba + ", nombreResponsablePrueba=" + nombreResponsablePrueba + ", correoResponsablePrueba=" + correoResponsablePrueba + ", telefonoResponsablePrueba=" + telefonoResponsablePrueba + ", nombreContactoTecnico=" + nombreContactoTecnico + ", correoContactoTecnico=" + correoContactoTecnico + ", telefonoContactoTecnico=" + telefonoContactoTecnico + ", nombreContactoOperativo=" + nombreContactoOperativo + ", correoContactoOperativo=" + correoContactoOperativo + ", telefonoContactoOperativo=" + telefonoContactoOperativo + ", fechaCertificacion=" + fechaCertificacion + ", fechaFinEvaluacion=" + fechaFinEvaluacion + ", fechaFirmaSSSPIM=" + fechaFirmaSSSPIM + ", fechaFirmaGCCSSPIM=" + fechaFirmaGCCSSPIM + ", fechaEnvioInformeInstitucion=" + fechaEnvioInformeInstitucion + ", fechaImplementacionProduccion=" + fechaImplementacionProduccion + ", detallesPruebaReporteRemedy=" + detallesPruebaReporteRemedy + ", duracionEvaluacion=" + duracionEvaluacion + ", duracionRevisionSSSPIM=" + duracionRevisionSSSPIM + ", duracionRevisionGCCSSPIM=" + duracionRevisionGCCSSPIM + ", duracionTotalProcesoPrueba=" + duracionTotalProcesoPrueba + ", duracionTotalProceso=" + duracionTotalProceso + ", fechaEntregaCedulaResultados=" + fechaEntregaCedulaResultados + ", comentarios=" + comentarios + '}';
    }
    
    

}
