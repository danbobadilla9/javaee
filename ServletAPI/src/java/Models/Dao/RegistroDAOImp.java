/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao;

import Models.Dao.Interface.CrudObjects;
import Models.Entity.Funcionalidad;
import Models.Entity.Registro;
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
public class RegistroDAOImp implements CrudObjects<Registro> {

    private final DB CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public RegistroDAOImp() {
        CON = DB.getInstance();
    }

    @Override
    public boolean insertObject(Registro objeto) {
        boolean resp = false;
        try {
            ps = CON.getConnection().prepareStatement("INSERT INTO registro (idinstitucion,idsistema,estatus) VALUES(?,?,?)");
            ps.setInt(1, (int)objeto.getIdInstitucion());
            ps.setInt(2, (int) objeto.getIdSistema());
            ps.setString(3, objeto.getStatus());
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se creo el registro de institucion " + e.getMessage());
        } finally {
            ps = null;
            CON.closeConnection();
        }
        return resp;
    }

    @Override
    public boolean updateObject(Registro objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteObject(Registro objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Registro> listObjects(String objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Registro> listObjects() {
        List<Registro> registros = new ArrayList<>();
        try {
            ps = CON.getConnection().prepareStatement("SELECT*FROM funcionalidad");
            rs = ps.executeQuery();
            while (rs.next()) {
                registros.add(new Registro(rs.getInt(1), rs.getInt(2), rs.getString(3)));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en el listado de registros. " + e.getMessage());
        } finally {
            ps = null;
            rs = null;

            CON.closeConnection();
        }
        return registros;
    }

    @Override
    public Registro getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Registro getObject(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
