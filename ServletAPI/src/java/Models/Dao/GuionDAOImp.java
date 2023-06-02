/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao;

import Models.Dao.Interface.CrudObjects;
import Models.Entity.Guion;
import Models.Utilities.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class GuionDAOImp implements CrudObjects<Guion>{

    private final DB CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public GuionDAOImp(){
        CON = DB.getInstance();
    }
    
    @Override
    public boolean insertObject(Guion objeto) {
        boolean resp = false;
        try{
            ps = CON.getConnection().prepareStatement("INSERT INTO guion (nombreguion,versionguion) VALUES(?,?)");
            ps.setString(1, objeto.getNombreGuion());
            ps.setString(2, objeto.getVerionGuion());
            if(ps.executeUpdate() > 0){
                resp = true;
            }
            ps.close();
        }catch(SQLException e){
            System.out.println("No se creo la Funcionalidad "+e.getMessage());
        }finally{
            ps = null;
            CON.closeConnection();
        }
        return resp;
    }

    @Override
    public boolean updateObject(Guion objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteObject(Guion objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Guion> listObjects(String objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Guion> listObjects() {
        List<Guion> guiones = new ArrayList<>();
        try{
            ps = CON.getConnection().prepareStatement("SELECT*FROM guion");
            rs = ps.executeQuery();
            while(rs.next()){
                guiones.add(new Guion(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            ps.close();
            rs.close();
        }catch(SQLException e){
            System.out.println("Error el generar el listado de guiones "+e.getMessage());
        }finally{
            ps = null;
            rs = null;
            CON.closeConnection();
        }
        return guiones;
    }

    @Override
    public Guion getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Guion getObject(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
