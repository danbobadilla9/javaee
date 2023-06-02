/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao;

import Models.Dao.Interface.CrudObjects;
import Models.Entity.Funcionalidad;
import Models.Entity.Proveedor;
import Models.Utilities.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dan Israel Bobadilla
 */
public class ProveedorDAOImp implements CrudObjects<Proveedor> {

    private final DB CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public ProveedorDAOImp() {
        CON = DB.getInstance();
    }

    @Override
    public boolean insertObject(Proveedor objeto) {
        boolean resp = false;
        try {
            ps = CON.getConnection().prepareStatement("INSERT INTO proveedor (proveedoraplicacion) VALUES(?)");
            ps.setString(1, objeto.getProveedorAplicacion());
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se creo el proveedor " + e.getMessage());
        } finally {
            ps = null;
            CON.closeConnection();
        }
        return resp;
    }

    @Override
    public boolean updateObject(Proveedor objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteObject(Proveedor objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Proveedor> listObjects(String objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Proveedor> listObjects() {
        List<Proveedor> proveedores = new ArrayList<>();
        try{
            ps = CON.getConnection().prepareStatement("SELECT*FROM funcionalidad");
            rs = ps.executeQuery();
            while(rs.next()){
                proveedores.add(new Proveedor(rs.getInt(1), rs.getString(2)));
            }
        }catch(SQLException e){
            System.out.println("Error en el listado de proveedores. "+e.getMessage());
        }finally{
            ps = null;
            CON.closeConnection();
        }
        return proveedores;
    }

    @Override
    public Proveedor getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Proveedor getObject(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
