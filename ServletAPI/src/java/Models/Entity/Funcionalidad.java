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
public class Funcionalidad implements Serializable{
    private long idFuncionalidad;
    private long idTipoPrueba;
    private String nombreFuncionalidad;

    public Funcionalidad() {
    }

    public Funcionalidad(long idFuncionalidad, long idTipoPrueba, String nombreFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
        this.idTipoPrueba = idTipoPrueba;
        this.nombreFuncionalidad = nombreFuncionalidad;
    }

    public long getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(long idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }

    public long getIdTipoPrueba() {
        return idTipoPrueba;
    }

    public void setIdTipoPrueba(long idTipoPrueba) {
        this.idTipoPrueba = idTipoPrueba;
    }

    public String getNombreFuncionalidad() {
        return nombreFuncionalidad;
    }

    public void setNombreFuncionalidad(String nombreFuncionalidad) {
        this.nombreFuncionalidad = nombreFuncionalidad;
    }

    @Override
    public String toString() {
        return "Funcionalidad{" + "idFuncionalidad=" + idFuncionalidad + ", idTipoPrueba=" + idTipoPrueba + ", nombreFuncionalidad=" + nombreFuncionalidad + '}';
    }
 
    
    
}
