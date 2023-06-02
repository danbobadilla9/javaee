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
public class Registro implements Serializable{
    private long idInstitucion;
    private long idSistema;
    private String status;

    public Registro() {
    }

    public Registro(long idInstitucion, long idSistema, String status) {
        this.idInstitucion = idInstitucion;
        this.idSistema = idSistema;
        this.status = status;
    }

    public long getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(long idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public long getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(long idSistema) {
        this.idSistema = idSistema;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Registro{" + "idInstitucion=" + idInstitucion + ", idSistema=" + idSistema + ", status=" + status + '}';
    }
    
    
    
    
}
