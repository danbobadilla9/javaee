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
public class Prueba implements Serializable{
    private long id;
    private String nombreprueba;
    private String funcionalidadCertificada;
    private String duracionprueba;
    private Timestamp fechalimitecontarcertificacionsatisfactoria;
    private long idfuncionalidad;
    private long idfechas;
    private long idguion;

    public Prueba() {
    }

    public Prueba(long id, String nombreprueba, String funcionalidadCertificada, String duracionprueba, Timestamp fechalimitecontarcertificacionsatisfactoria, long idfuncionalidad, long idfechas, long idguion) {
        this.id = id;
        this.nombreprueba = nombreprueba;
        this.funcionalidadCertificada = funcionalidadCertificada;
        this.duracionprueba = duracionprueba;
        this.fechalimitecontarcertificacionsatisfactoria = fechalimitecontarcertificacionsatisfactoria;
        this.idfuncionalidad = idfuncionalidad;
        this.idfechas = idfechas;
        this.idguion = idguion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreprueba() {
        return nombreprueba;
    }

    public void setNombreprueba(String nombreprueba) {
        this.nombreprueba = nombreprueba;
    }

    public String getFuncionalidadCertificada() {
        return funcionalidadCertificada;
    }

    public void setFuncionalidadCertificada(String funcionalidadCertificada) {
        this.funcionalidadCertificada = funcionalidadCertificada;
    }

    public String getDuracionprueba() {
        return duracionprueba;
    }

    public void setDuracionprueba(String duracionprueba) {
        this.duracionprueba = duracionprueba;
    }

    public Timestamp getFechalimitecontarcertificacionsatisfactoria() {
        return fechalimitecontarcertificacionsatisfactoria;
    }

    public void setFechalimitecontarcertificacionsatisfactoria(Timestamp fechalimitecontarcertificacionsatisfactoria) {
        this.fechalimitecontarcertificacionsatisfactoria = fechalimitecontarcertificacionsatisfactoria;
    }

    public long getIdfuncionalidad() {
        return idfuncionalidad;
    }

    public void setIdfuncionalidad(long idfuncionalidad) {
        this.idfuncionalidad = idfuncionalidad;
    }

    public long getIdfechas() {
        return idfechas;
    }

    public void setIdfechas(long idfechas) {
        this.idfechas = idfechas;
    }

    public long getIdguion() {
        return idguion;
    }

    public void setIdguion(long idguion) {
        this.idguion = idguion;
    }
    
}
