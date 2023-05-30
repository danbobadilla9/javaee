/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao;

import Models.Dao.Interface.CrudObjects;
import Models.Entity.TipoPrueba;
import Models.Utilities.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class TipoPruebaDAOImp implements CrudObjects<TipoPrueba>{
    
    private final DB CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public TipoPruebaDAOImp(){
        CON = DB.getInstance();
    }
    
    
    @Override
    public boolean insertObject(TipoPrueba objeto) {
        boolean resp = false;
        try{
            ps = CON.getConnection().prepareStatement("INSERT INTO tipoprueba(nombrecorto,fechacertificacion,idsistema) VALUES(?,?,?)");
            ps.setString(1, objeto.getNombreCorto());
            ps.setTimestamp(2, objeto.getFechaCertificacion());
            ps.setLong(3, objeto.getIdSistema());
            System.out.println(objeto.getIdSistema());
            if(ps.executeUpdate() > 0){
                resp = true;
            }
            ps.close();
        }catch(SQLException e){
            System.out.println("Tipo Prueba no creado "+e.getMessage());
        }finally{
            ps = null;
            CON.closeConnection();
        }
        return resp;
    }

    @Override
    public boolean updateObject(TipoPrueba objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteObject(TipoPrueba objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoPrueba> listObjects(String objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoPrueba getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoPrueba getObject(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoPrueba> listObjects() {
        List<TipoPrueba> tipoPruebas = new ArrayList<>();
        try {
            ps = CON.getConnection().prepareStatement("SELECT*FROM tipoprueba");
            rs = ps.executeQuery();
            while(rs.next()){
                tipoPruebas.add(new TipoPrueba(rs.getLong(1), rs.getLong(4), rs.getString(2), rs.getTimestamp(3)));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TipoPruebaDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ps = null;
            rs = null;
            CON.closeConnection();
        }
        return tipoPruebas;
    }
    
}
