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
//        encargadoService.insertarEncargado();
        encargadoService.obtenerEncargado("D19100");
    }
}
