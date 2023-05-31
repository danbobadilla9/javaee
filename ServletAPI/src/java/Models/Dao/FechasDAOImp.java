/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao;

import Models.Dao.Interface.CrudObjects;
import Models.Entity.Fechas;
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
public class FechasDAOImp implements CrudObjects<Fechas> {

    private final DB CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public FechasDAOImp() {
        CON = DB.getInstance();
    }

    @Override
    public boolean insertObject(Fechas objeto) {
        resp = false;
        try {
            ps = CON.getConnection().prepareStatement("INSERT INTO fechas(nombrecalendarizacion,fechainicioejecucioncertificacion,fechafinejecucioncertificacion,fechacertificacionultimodia,fechaentradavigorobligacion) VALUES(?,?,?,?,?)");
            ps.setString(1, objeto.getNombreCalendarizacion());
            ps.setTimestamp(2, objeto.getFechaInicioEjecucionCertificacion());
            ps.setTimestamp(3, objeto.getFechaFinEjecucionCertificacion());
            ps.setTimestamp(4, objeto.getFechaCertificacionUltimoDia());
            ps.setTimestamp(5, objeto.getFechaEntradaVigorObligacion());
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar Encargado " + e.getMessage());
        } finally {
            ps = null;
            CON.closeConnection();
        }

        return resp;
    }

    @Override
    public boolean updateObject(Fechas objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteObject(Fechas objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fechas> listObjects(String objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fechas> listObjects() {
        List<Fechas> fechases = new ArrayList<>();
        try {
            ps = CON.getConnection().prepareStatement("SELECT*FROM fechas");
            rs = ps.executeQuery();
            while (rs.next()) {
                fechases.add(new Fechas(rs.getInt(1), rs.getString(2), rs.getTimestamp(3), rs.getTimestamp(4), rs.getTimestamp(5), rs.getTimestamp(6)));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error al listar fechas " + e.getMessage());
        }finally{
            ps = null;
            rs = null;
            CON.closeConnection();
        }
        return fechases;
    }

    @Override
    public Fechas getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Fechas getObject(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
