/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author user
 */
@Path("/hello2")
public class HolaProbador {
//        @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getHelloPrueba() {
//        Object[] jsonArray = {
//                false,
//                new Object[]{"cwecpHEHq5ShI7dEo7lG", 590303896, 2016235166.6843984},
//                "mF34AkF3",
//                new Object(){
//                    public double mnwrhwaobn = 556787010.6619457;
//                    public String rmkbxwn = "Jz";
//                    public String gpwecylwz = "IGw";
//                }
//        };
//
//        return "Hola mundo";
//    }
        @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Ejemplo obtenerEjemplo() {
        // Crear un objeto que deseas enviar como respuesta en formato JSON
        Ejemplo ejemplo = new Ejemplo("Hola", "Mundo");

        // Retornar la respuesta con el objeto serializado como JSON y el código de estado 200 (OK)
        return ejemplo;
    }
//            @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getHelloPrueba() {
//
//
//        return "otra prueba";
//    }
}