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
public class Proveedor implements Serializable{
    private long idProveedor;
    private String proveedorAplicacion;

    public Proveedor() {
    }

    
    
    public Proveedor(long idProveedor, String proveedorAplicacion) {
        this.idProveedor = idProveedor;
        this.proveedorAplicacion = proveedorAplicacion;
    }

    public long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getProveedorAplicacion() {
        return proveedorAplicacion;
    }

    public void setProveedorAplicacion(String proveedorAplicacion) {
        this.proveedorAplicacion = proveedorAplicacion;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", proveedorAplicacion=" + proveedorAplicacion + '}';
    }
    
    
    
}
