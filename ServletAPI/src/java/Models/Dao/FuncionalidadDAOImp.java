/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao;

import Models.Dao.Interface.CrudObjects;
import Models.Entity.Funcionalidad;
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
public class FuncionalidadDAOImp implements CrudObjects<Funcionalidad>{

    private final DB CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public FuncionalidadDAOImp(){
        CON = DB.getInstance();
    }
    
    @Override
    public boolean insertObject(Funcionalidad objeto) {
        boolean resp = false;
        try{
            ps = CON.getConnection().prepareStatement("INSERT INTO funcionalidad (nombrefuncionalidad,idtipoprueba) VALUES(?,?)");
            ps.setString(1, objeto.getNombreFuncionalidad());
            ps.setInt(2, (int)objeto.getIdTipoPrueba());
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
    public boolean updateObject(Funcionalidad objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteObject(Funcionalidad objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Funcionalidad> listObjects(String objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Funcionalidad> listObjects() {
        List<Funcionalidad> funcionalidades = new ArrayList<>();
        try{
            ps = CON.getConnection().prepareStatement("SELECT*FROM funcionalidad");
            rs = ps.executeQuery();
            while(rs.next()){
                funcionalidades.add(new Funcionalidad(rs.getInt(1), rs.getInt(3), rs.getString(2)));
            }
        }catch(SQLException e){
            System.out.println("Error en el listado de funcionalidades. "+e.getMessage());
        }finally{
            ps = null;
            CON.closeConnection();
        }
        return funcionalidades;
    }

    @Override
    public Funcionalidad getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionalidad getObject(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
