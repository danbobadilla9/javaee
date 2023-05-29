/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao;

import Models.Dao.Interface.IEncargadoDAO;
import Models.Entity.Encargado;
import Models.Utilities.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public class EncargadoDAOImp implements IEncargadoDAO{
    
    private final DB CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public EncargadoDAOImp(){
        CON = DB.getInstance();
    }
    
    @Override
    public boolean insertObject(Encargado objeto) {
        resp = false;
        try{
            ps=CON.getConnection().prepareStatement("INSERT INTO encargado(nombre,clavetrabajador,telefono,rol,password) VALUES(?,?,?,?,?)");
            ps.setString(1, objeto.getNombre());
            ps.setString(2, objeto.getClaveTrabajador());
            ps.setString(3, objeto.getTelefono());
            ps.setString(4, objeto.getRol());
            ps.setBytes(5, objeto.getPassword());
            if(ps.executeUpdate() > 0){
                resp = true;
            }
            ps.close();
        }catch(SQLException e){
            System.out.println("Error al insertar Encargado "+e.getMessage());
        }finally{
            ps= null;
            CON.closeConnection();
        }
        
        
        return resp;
    }

    @Override
    public boolean updateObject(Encargado objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteObject(Encargado objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Encargado> listObjects(String objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Encargado getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
public Encargado getObject(String cadena) {
    Encargado encargado = null;
    try {
        ps = CON.getConnection().prepareStatement("SELECT * FROM encargado WHERE clavetrabajador = ?");
        ps.setString(1, cadena); // Asignar el valor de la cadena al parámetro de la consulta
        rs = ps.executeQuery();
        if (rs.next()) {
            // Leer el primer registro si existe
            encargado = new Encargado(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBytes(5), rs.getString(6));
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener Encargado: " + e.getMessage());
    }
    return encargado;
}

    
}
