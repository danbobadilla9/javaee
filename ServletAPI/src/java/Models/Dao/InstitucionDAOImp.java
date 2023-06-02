/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao;

import Models.Dao.Interface.CrudObjects;
import Models.Entity.Funcionalidad;
import Models.Entity.Institucion;
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
public class InstitucionDAOImp implements CrudObjects<Institucion> {

    private final DB CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public InstitucionDAOImp() {
        CON = DB.getInstance();
    }

    @Override
    public boolean insertObject(Institucion objeto) {
        boolean resp = false;
        try {
            ps = CON.getConnection().prepareStatement("INSERT INTO funcionalidad (clavecasfim,nombrecortoinstitucion,equivalencia,nombreinstitucion) VALUES(?,?,?,?)");
            ps.setInt(1, (int) objeto.getIdInstitucion());
            ps.setString(2, objeto.getNombreCortoInstitucion());
            ps.setInt(3, objeto.getEquivalencia());
            ps.setString(4, objeto.getNombreInstitucion());

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se creo la Funcionalidad " + e.getMessage());
        } finally {
            ps = null;
            CON.closeConnection();
        }
        return resp;
    }

    @Override
    public boolean updateObject(Institucion objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteObject(Institucion objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Institucion> listObjects(String objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Institucion> listObjects() {
        List<Institucion> instituciones = new ArrayList<>();
        try {
            ps = CON.getConnection().prepareStatement("SELECT*FROM funcionalidad");
            rs = ps.executeQuery();
            while (rs.next()) {
                instituciones.add(new Institucion(rs.getInt(1), rs.getInt(2), rs.getString(3),rs.getInt(4),rs.getString(5)));
            }
        } catch (SQLException e) {
            System.out.println("Error en el listado de instituciones. " + e.getMessage());
        } finally {
            ps = null;
            CON.closeConnection();
        }
        return instituciones;
    }

    @Override
    public Institucion getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Institucion getObject(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
