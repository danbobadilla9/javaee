/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author user
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Leer los parametros del formulario 
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String usuarios[] = request.getParameterValues("usuarios");
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);
        System.out.println("usuarios = " + usuarios);
        PrintWriter out = response.getWriter();
        //No reconoce el salto de linea 
        out.print("<h1>Hola mundo </h1>");
//        //Leer parametros de un JSON metodo 1
//        StringBuilder jsonBody = new StringBuilder();
//        String line;
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()))) {
//            while ((line = reader.readLine()) != null) {
//                jsonBody.append(line);
//            }
//        }
//
//        String jsonString = jsonBody.toString();
//        System.out.println("jsonString = " + jsonString);
//        //Leer parametros de un JSON metodo 2
        StringBuilder jsonBody = new StringBuilder();
        String line;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()))) {
            while ((line = reader.readLine()) != null) {
                jsonBody.append(line);
            }
        }

        String jsonString = jsonBody.toString();
        // Crear un JsonReader desde la cadena JSON
        try (JsonReader jsonReader = Json.createReader(new StringReader(jsonString))) {
            // Obtener el JsonObject desde el JsonReader
            JsonObject jsonObject = jsonReader.readObject();

            // Obtener los parámetros del JsonObject
            String param1 = jsonObject.getString("usuario");
            String param2 = jsonObject.getString("password");
            JsonArray usuariosArray = jsonObject.getJsonArray("usuarios");
//            JsonObject usuariosObj = jsonObject.getJsonObject("usuarios");
            System.out.println("param1 = " + param1);
             
            
            System.out.println("param2 = " + param2);
            System.out.println("usuariosArray = " + usuariosArray);
            System.out.println("usuariosArray[0] objeto = " + usuariosArray.get(0).toString());
//            System.out.println("usuariosObj = " + usuariosObj);
                       
                       

        }
        out.close();
    }
}
