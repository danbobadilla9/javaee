/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao;

import Models.Dao.Interface.CrudObjects;
import Models.Entity.Prueba;
import Models.Utilities.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public class PruebaDAOImp implements CrudObjects<Prueba> {

    private final DB CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public PruebaDAOImp() {
        CON = DB.getInstance();
    }

    @Override
    public boolean insertObject(Prueba objeto) {
        boolean resp = false;
        try{
            ps = CON.getConnection().prepareStatement("INSERT INTO guion (nombreprueba,funcionalidadcertificada,duracionprueba,fechalimitecontarcertificacionsatisfactoria,idfuncionalidad,idfechas,idguion) VALUES(?,?, ?::INTERVAL,?,?,?,?)");
            ps.setString(1, objeto.getNombreprueba());
            ps.setString(2, objeto.getFuncionalidadCertificada());
            ps.setS
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
    public boolean updateObject(Prueba objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteObject(Prueba objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Prueba> listObjects(String objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Prueba> listObjects() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Prueba getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Prueba getObject(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
