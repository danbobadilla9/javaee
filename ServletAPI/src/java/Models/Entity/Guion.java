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
public class Guion implements Serializable{
    private long idGuion;
    private String verionGuion;
    private String nombreGuion;

    public Guion() {
    }

    public Guion(long idGuion, String verionGuion, String nombreGuion) {
        this.idGuion = idGuion;
        this.verionGuion = verionGuion;
        this.nombreGuion = nombreGuion;
    }

    public long getIdGuion() {
        return idGuion;
    }

    public void setIdGuion(long idGuion) {
        this.idGuion = idGuion;
    }

    public String getVerionGuion() {
        return verionGuion;
    }

    public void setVerionGuion(String verionGuion) {
        this.verionGuion = verionGuion;
    }

    public String getNombreGuion() {
        return nombreGuion;
    }

    public void setNombreGuion(String nombreGuion) {
        this.nombreGuion = nombreGuion;
    }

    @Override
    public String toString() {
        return "Guion{" + "idGuion=" + idGuion + ", verionGuion=" + verionGuion + ", nombreGuion=" + nombreGuion + '}';
    }
    
    
}
