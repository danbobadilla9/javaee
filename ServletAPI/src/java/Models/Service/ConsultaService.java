/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Service;

import Models.Dao.SistemaDAOImp;
import Models.Dao.TipoPruebaDAOImp;
import Models.Entity.Sistema;
import Models.Entity.TipoPrueba;
import Models.Utilities.ConvertDates;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ConsultaService {
    private SistemaDAOImp sistemaDAOImp;
    private TipoPruebaDAOImp tipoPruebaDAOImp;
    public ConsultaService(){
        sistemaDAOImp = new SistemaDAOImp();
        tipoPruebaDAOImp = new TipoPruebaDAOImp();
    }
    
    public void insertarSistema(){
        Sistema sistema = new Sistema();
        sistema.setNombreSistema("SPID");
        if(sistemaDAOImp.insertObject(sistema)){
            System.out.println("Sistema registrado");
        }else{
            System.out.println("Sistema no registrado");
        }
    }
    
    public void insertarTipoPrueba(){
        TipoPrueba tipoPrueba = new TipoPrueba();
        tipoPrueba.setNombreCorto("SPID-B");
        tipoPrueba.setFechaCertificacion(ConvertDates.fechaToTimestamp("27/07/2022"));
        tipoPrueba.setIdSistema(3);
        if(tipoPruebaDAOImp.insertObject(tipoPrueba)){
            System.out.println("Tipo de prueba registrado");
        }else{
            System.out.println("Tipo de prueba no registrado");
        }
    }
    
    public void getAllSistemas(){
        List<Sistema> sistemas = new ArrayList<>();
        sistemas = sistemaDAOImp.listObjects();
        sistemas.forEach(System.out::println);
    }
    
    public void getAllTipoPruebas(){
        List<TipoPrueba> tipoPruebas = new ArrayList<>();
        tipoPruebas = tipoPruebaDAOImp.listObjects();
        for(TipoPrueba tipoPrueba: tipoPruebas){
            System.out.println(tipoPrueba);
        }
    
    }
    
}
