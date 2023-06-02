/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao;

import Models.Dao.Interface.CrudObjects;
import Models.Entity.Funcionalidad;
import Models.Entity.Prueba;
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
            ps.setString(3,objeto.getDuracionprueba());
            ps.setTimestamp(4, objeto.getFechalimitecontarcertificacionsatisfactoria());
            ps.setInt(5, (int)objeto.getIdfuncionalidad());
            ps.setInt(6, (int)objeto.getIdfechas());
            ps.setInt(7, (int)objeto.getIdguion());
            
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
        List<Prueba> pruebas = new ArrayList<>();
        try{
            ps = CON.getConnection().prepareStatement("SELECT*FROM funcionalidad");
            rs = ps.executeQuery();
            while(rs.next()){
                pruebas.add(new Prueba(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getTimestamp(4),rs.getInt(5),rs.getInt(6),rs.getInt(7)));
            }
            ps.close();
            rs.close();
        }catch(SQLException e){
            System.out.println("Error en el listado de funcionalidades. "+e.getMessage());
        }finally{
            ps = null;
            rs = null;
            CON.closeConnection();
        }
        return pruebas;
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
