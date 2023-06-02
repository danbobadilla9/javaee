/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Entity;

import java.io.Serializable;

/**
 *
 * @author Dan Israel Bobadilla
 */
public class Aplicacion implements Serializable{
    private long idAplicacion;
    private String nombreAplicacionCertificada;
    private float versionAplicacionCertificada;
    private long idProveedor;
    private long idInstitucion;

    public Aplicacion() {
    }

    public Aplicacion(long idAplicacion, String nombreAplicacionCertificada, float versionAplicacionCertificada, long idProveedor, long idInstitucion) {
        this.idAplicacion = idAplicacion;
        this.nombreAplicacionCertificada = nombreAplicacionCertificada;
        this.versionAplicacionCertificada = versionAplicacionCertificada;
        this.idProveedor = idProveedor;
        this.idInstitucion = idInstitucion;
    }

    public long getIdAplicacion() {
        return idAplicacion;
    }

    public void setIdAplicacion(long idAplicacion) {
        this.idAplicacion = idAplicacion;
    }

    public String getNombreAplicacionCertificada() {
        return nombreAplicacionCertificada;
    }

    public void setNombreAplicacionCertificada(String nombreAplicacionCertificada) {
        this.nombreAplicacionCertificada = nombreAplicacionCertificada;
    }

    public float getVersionAplicacionCertificada() {
        return versionAplicacionCertificada;
    }

    public void setVersionAplicacionCertificada(float versionAplicacionCertificada) {
        this.versionAplicacionCertificada = versionAplicacionCertificada;
    }

    public long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public long getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(long idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    @Override
    public String toString() {
        return "Aplicacion{" + "idAplicacion=" + idAplicacion + ", nombreAplicacionCertificada=" + nombreAplicacionCertificada + ", versionAplicacionCertificada=" + versionAplicacionCertificada + ", idProveedor=" + idProveedor + ", idInstitucion=" + idInstitucion + '}';
    }
    
}
