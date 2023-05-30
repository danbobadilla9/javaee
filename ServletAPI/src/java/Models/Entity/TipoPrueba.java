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
public class TipoPrueba implements Serializable{
    private long idTipoPrueba;
    private long idSistema;
    private String nombreCorto;
    private Timestamp fechaCertificacion;

    public TipoPrueba() {
    }

    public TipoPrueba(long idTipoPrueba, long idSistema, String nombreCorto, Timestamp fechaCertificacion) {
        this.idTipoPrueba = idTipoPrueba;
        this.idSistema = idSistema;
        this.nombreCorto = nombreCorto;
        this.fechaCertificacion = fechaCertificacion;
    }

    public long getIdTipoPrueba() {
        return idTipoPrueba;
    }

    public void setIdTipoPrueba(long idTipoPrueba) {
        this.idTipoPrueba = idTipoPrueba;
    }

    public long getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(long idSistema) {
        this.idSistema = idSistema;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public Timestamp getFechaCertificacion() {
        return fechaCertificacion;
    }

    public void setFechaCertificacion(Timestamp fechaCertificacion) {
        this.fechaCertificacion = fechaCertificacion;
    }

    @Override
    public String toString() {
        return "TipoPrueba{" + "idTipoPrueba=" + idTipoPrueba + ", idSistema=" + idSistema + ", nombreCorto=" + nombreCorto + ", fechaCertificacion=" + fechaCertificacion + '}';
    }
    
    
    
}
