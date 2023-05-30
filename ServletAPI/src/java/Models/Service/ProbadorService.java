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
        
        //REGISTRANDO SISTEMAS
        ConsultaService consultaService = new ConsultaService();
//        consultaService.insertarSistema();

        //REGISTRANDO PRUEBAS
//        consultaService.insertarTipoPrueba();
        
        //LISTADO TODOS LOS SISTEMAS
        consultaService.getAllSistemas();

        //LISTANDO TODAS LAS PRUEBAS
        consultaService.getAllTipoPruebas();
    }
}
