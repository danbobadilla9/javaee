/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Entity;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Sistema implements Serializable{
    private long idSistema;
    private String nombreSistema;

    public Sistema() {
    }

    public Sistema(long idSistema, String nombreSistema) {
        this.idSistema = idSistema;
        this.nombreSistema = nombreSistema;
    }

    public long getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(long idSistema) {
        this.idSistema = idSistema;
    }

    public String getNombreSistema() {
        return nombreSistema;
    }

    public void setNombreSistema(String nombreSistema) {
        this.nombreSistema = nombreSistema;
    }

    @Override
    public String toString() {
        return "Sistema{" + "idSistema=" + idSistema + ", nombreSistema=" + nombreSistema + '}';
    }
    
}
