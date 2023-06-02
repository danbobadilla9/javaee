/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao;

import Models.Dao.Interface.CrudObjects;
import Models.Entity.Aplicacion;
import Models.Entity.Funcionalidad;
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
public class AplicacionDAOImp implements CrudObjects<Aplicacion> {

    private final DB CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public AplicacionDAOImp() {
        CON = DB.getInstance();
    }

    @Override
    public boolean insertObject(Aplicacion objeto) {
        boolean resp = false;
        try {
            ps = CON.getConnection().prepareStatement("INSERT INTO aplicacion (nombreaplicacioncertificada,versionaplicacioncertificada,idproveedor,idinstitucion) VALUES(?,?,?,?)");
            ps.setString(1, objeto.getNombreAplicacionCertificada());
            ps.setFloat(2, objeto.getVersionAplicacionCertificada());
            ps.setInt(3, (int)objeto.getIdProveedor());
            ps.setInt(4, (int)objeto.getIdInstitucion());
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se registro la aplicacion " + e.getMessage());
        } finally {
            ps = null;
            CON.closeConnection();
        }
        return resp;
    }

    @Override
    public boolean updateObject(Aplicacion objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteObject(Aplicacion objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aplicacion> listObjects(String objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aplicacion> listObjects() {
                List<Aplicacion> aplicaciones = new ArrayList<>();
        try {
            ps = CON.getConnection().prepareStatement("SELECT*FROM funcionalidad");
            rs = ps.executeQuery();
            while (rs.next()) {
                aplicaciones.add(new Aplicacion(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getInt(4),rs.getInt(5)));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en el listado de aplicaciones. " + e.getMessage());
        } finally {
            ps = null;
            rs = null;

            CON.closeConnection();
        }
        return aplicaciones;
    }

    @Override
    public Aplicacion getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aplicacion getObject(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
