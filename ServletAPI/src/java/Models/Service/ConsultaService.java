/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Service;

import Models.Dao.FechasDAOImp;
import Models.Dao.FuncionalidadDAOImp;
import Models.Dao.GuionDAOImp;
import Models.Dao.ProgramadasDAOImp;
import Models.Dao.SistemaDAOImp;
import Models.Dao.TipoPruebaDAOImp;
import Models.Entity.Fechas;
import Models.Entity.Funcionalidad;
import Models.Entity.Guion;
import Models.Entity.Programadas;
import Models.Entity.Sistema;
import Models.Entity.TipoPrueba;
import Models.Utilities.ConvertDates;
import Models.Utilities.JSON;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ConsultaService {
    private SistemaDAOImp sistemaDAOImp;
    private TipoPruebaDAOImp tipoPruebaDAOImp;
    private FuncionalidadDAOImp funcionalidadDAOImp;
    private FechasDAOImp fechasDAOImp;
    private ProgramadasDAOImp programadasDAOImp;
    private GuionDAOImp guionDAOImp;
    
    public ConsultaService(){
        sistemaDAOImp = new SistemaDAOImp();
        tipoPruebaDAOImp = new TipoPruebaDAOImp();
        funcionalidadDAOImp = new FuncionalidadDAOImp();
        fechasDAOImp = new FechasDAOImp();
        programadasDAOImp = new ProgramadasDAOImp();
        guionDAOImp = new GuionDAOImp();
        
        
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
    
    public void insertarFuncionalidad(){
        Funcionalidad funcionalidad = new Funcionalidad();
        funcionalidad.setNombreFuncionalidad("SPID-B2");
        funcionalidad.setIdTipoPrueba(6);
        if(funcionalidadDAOImp.insertObject(funcionalidad)){
            System.out.println("Funcionalidad registrada");
        }else{
            System.out.println("Funcionalidad no registrada");
        }
    }
    
    public void insertarFecha(){
        Fechas fechas = new Fechas();
        fechas.setNombreCalendarizacion("Prueba Marzo");
        fechas.setFechaInicioEjecucionCertificacion(ConvertDates.fechaToTimestamp("10/03/2022"));
        fechas.setFechaFinEjecucionCertificacion(ConvertDates.fechaToTimestamp("25/03/2022"));
        fechas.setFechaCertificacionUltimoDia(ConvertDates.fechaToTimestamp("24/03/2022"));
        fechas.setFechaEntradaVigorObligacion(ConvertDates.fechaToTimestamp("30/03/2022"));
        if(fechasDAOImp.insertObject(fechas)){
            System.out.println("Fecha registrada");
        }else{
            System.out.println("Fecha no registrada");
        }
        
    }
    
    public void insertarProgramadas(){
        Programadas programadas = new Programadas();
        programadas.setIdFuncionalidad(6);
        programadas.setIfFechas(1);
        programadas.setEjecucionCalendarizada(false);
        if(programadasDAOImp.insertObject(programadas)){
            System.out.println("Fecha Programada ");
        }else{
            System.out.println("Fecha No Programada");
        }
    }
    
    public void insertarGuion(){
        Guion guion = new Guion();
        guion.setNombreGuion("Guion C-1");
        guion.setVerionGuion("1.2.1");
        if(guionDAOImp.insertObject(guion)){
            System.out.println("Guion registrado");
        }else{
            System.out.println("Guion no registrado");
        }
    }
    

    
    public List<Sistema> getAllSistemas(){
        List<Sistema> sistemas = new ArrayList<>();
        sistemas = sistemaDAOImp.listObjects();
        sistemas.forEach(System.out::println);
        return sistemas;
    }
    
    public List<TipoPrueba> getAllTipoPruebas(){
        List<TipoPrueba> tipoPruebas = new ArrayList<>();
        tipoPruebas = tipoPruebaDAOImp.listObjects();
        for(TipoPrueba tipoPrueba: tipoPruebas){
            System.out.println(tipoPrueba);
        }
        return tipoPruebas;
    }
    
    public List<Funcionalidad> getAllFuncionalidades(){
        List<Funcionalidad> funcionalidades = new ArrayList<>();
        funcionalidades = funcionalidadDAOImp.listObjects();
        for(Funcionalidad funcionalidad: funcionalidades){
            System.out.println(funcionalidad);
        }
        return funcionalidades;
    }
    
    public void getAllFechas(){
        List<Fechas> fechases = new ArrayList<>();
        fechases = fechasDAOImp.listObjects();
        fechases.forEach(System.out::println);
    }
    
    public List<Guion> getAllGuiones(){
        List<Guion> guiones = new ArrayList<>();
        guiones = guionDAOImp.listObjects();
        guiones.forEach(System.out::println);
        return guiones;
    }
    
    public void filtroCargaArchivos(){
        String json = JSON.JsonFiltroArchivo(getAllSistemas(), getAllTipoPruebas(), getAllFuncionalidades());
        System.out.println("JSON FILTRO");
        System.out.println(json);
    }
    
    
}
