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

@Path("/hello")
public class HelloResource {

//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String sayHello() {
//        return "Hello, World!";
//    }
        @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getHelloPrueba() {
        Object[] jsonArray = {
                false,
                new Object[]{"cwecpHEHq5ShI7dEo7lG", 590303896, 2016235166.6843984},
                "mF34AkF3",
                new Object(){
                    public double mnwrhwaobn = 556787010.6619457;
                    public String rmkbxwn = "Jz";
                    public String gpwecylwz = "IGw";
                }
        };

//////        return Response.ok(jsonArray).build();
return "hola";
    }
}
