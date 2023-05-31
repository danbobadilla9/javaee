/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Service;

/**
 *
 * @author user
 */
public class ProbadorService {

    public static void main(String[] args) {
        
        EncargadoService encargadoService = new EncargadoService();
        //REGISTRANDO ENCARGADOS
//        encargadoService.insertarEncargado();
//        encargadoService.autenticarEncargado("D19100","Dard1");
//        encargadoService.autenticarEncargado("D19100","Dan");
        
        ConsultaService consultaService = new ConsultaService();
        //REGISTRANDO SISTEMAS
//        consultaService.insertarSistema();

        //REGISTRANDO PRUEBAS
//        consultaService.insertarTipoPrueba();

        //REGISTRANDO FUNCIONALIDAD
//        consultaService.insertarFuncionalidad();

        //REGISTRANDO FECHA
//        consultaService.insertarFecha();

        //REGISTRANDO PROGRAMDAS
//        consultaService.insertarProgramadas();

        // REGISTRANDO GUIONES 
//        consultaService.insertarGuion();

        //LISTADO TODOS LOS SISTEMAS
//        consultaService.getAllSistemas();

        //LISTANDO TODAS LAS PRUEBAS
//        consultaService.getAllTipoPruebas();
        
        //LISTANDO TODAS LAS FUNCIONALIDADES
//        consultaService.getAllFuncionalidades();

        //LISTANDO TODAS LAS FECHAS
//        consultaService.getAllFechas();

        //LISTANDO TODOS LOS GUIONES
        consultaService.getAllGuiones();
        


        //OBTENER EL FILTRO
//        consultaService.filtroCargaArchivos();
    }
}
