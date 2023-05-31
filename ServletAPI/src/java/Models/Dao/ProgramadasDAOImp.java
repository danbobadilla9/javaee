/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao;

import Models.Dao.Interface.CrudObjects;
import Models.Entity.Programadas;
import Models.Utilities.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public class ProgramadasDAOImp implements CrudObjects<Programadas>{
    
     private final DB CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public ProgramadasDAOImp(){
        CON = DB.getInstance();
    }
    
    @Override
    public boolean insertObject(Programadas objeto) {
       boolean resp = false;
        try{
            ps = CON.getConnection().prepareStatement("INSERT INTO programadas (idfuncionalidad,idfechas,ejecucioncalendarizada) VALUES(?,?,?)");
            ps.setInt(1, (int)objeto.getIdFuncionalidad());
            ps.setInt(2, (int)objeto.getIfFechas());
            ps.setBoolean(3, objeto.isEjecucionCalendarizada());
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
    public boolean updateObject(Programadas objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteObject(Programadas objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Programadas> listObjects(String objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Programadas> listObjects() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Programadas getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Programadas getObject(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
