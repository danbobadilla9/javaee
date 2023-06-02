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
public class Institucion implements Serializable{
    private long idInstitucion;
    private int claveCASFIM;
    private String nombreCortoInstitucion;
    private int equivalencia;
    private String nombreInstitucion;

    public Institucion() {
    }
    

    public Institucion(long idInstitucion, int claveCASFIM, String nombreCortoInstitucion, int equivalencia, String nombreInstitucion) {
        this.idInstitucion = idInstitucion;
        this.claveCASFIM = claveCASFIM;
        this.nombreCortoInstitucion = nombreCortoInstitucion;
        this.equivalencia = equivalencia;
        this.nombreInstitucion = nombreInstitucion;
    }

    public long getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(long idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public int getClaveCASFIM() {
        return claveCASFIM;
    }

    public void setClaveCASFIM(int claveCASFIM) {
        this.claveCASFIM = claveCASFIM;
    }

    public String getNombreCortoInstitucion() {
        return nombreCortoInstitucion;
    }

    public void setNombreCortoInstitucion(String nombreCortoInstitucion) {
        this.nombreCortoInstitucion = nombreCortoInstitucion;
    }

    public int getEquivalencia() {
        return equivalencia;
    }

    public void setEquivalencia(int equivalencia) {
        this.equivalencia = equivalencia;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }
    
    
    
    
    
}
