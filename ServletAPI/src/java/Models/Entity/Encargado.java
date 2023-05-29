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
public class Encargado implements Serializable{
    
    private long idEncargado;
    private String nombre;
    private String claveTrabajador;
    private String telefono;
    private String rol;
    private byte[] password;
    
    public Encargado(){
        
    }

    public Encargado(long idEncargado, String nombre, String claveTrabajador, String telefono,byte[] password,String rol ) {
        this.idEncargado = idEncargado;
        this.nombre = nombre;
        this.claveTrabajador = claveTrabajador;
        this.telefono = telefono;
        this.rol = rol;
        this.password = password;
    }

    public long getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(long idEncargado) {
        this.idEncargado = idEncargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClaveTrabajador() {
        return claveTrabajador;
    }

    public void setClaveTrabajador(String claveTrabajador) {
        this.claveTrabajador = claveTrabajador;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }
    
        
}
