/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao;

import Models.Dao.Interface.CrudObjects;
import Models.Entity.Sistema;
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
public class SistemaDAOImp implements CrudObjects<Sistema> {

    private final DB CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public SistemaDAOImp() {
        CON = DB.getInstance();
    }

    @Override
    public boolean insertObject(Sistema objeto) {
        boolean resp = false;
        try {
            ps = CON.getConnection().prepareStatement("INSERT INTO sistema(nombresistema) VALUES (?)");
            ps.setString(1, objeto.getNombreSistema());
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(SistemaDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ps = null;
            CON.closeConnection();
        }

        return resp;
    }

    @Override
    public boolean updateObject(Sistema objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteObject(Sistema objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sistema> listObjects(String objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sistema getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sistema getObject(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sistema> listObjects() {
        List<Sistema> sistemas = new ArrayList<>();
        try {
            ps = CON.getConnection().prepareStatement("SELECT*FROM sistema");
            rs = ps.executeQuery();
            while (rs.next()) {
                sistemas.add(new Sistema(rs.getLong(1), rs.getString(2)));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TipoPruebaDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ps = null;
            rs = null;
            CON.closeConnection();
        }
        return sistemas;
    }

}
