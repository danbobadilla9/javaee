/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.json.Json;
//import javax.json.JsonBuilderFactory;
//import javax.json.JsonObject;
//import javax.json.JsonObjectBuilder;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// *
// * @author user
// */
//@WebServlet("/holamundo")
//public class HolaMundo extends HttpServlet{
//    @Override
//    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
//        response.setContentType("application/json");
//        response.setCharacterEncoding("utf-8");
//        response.setStatus(200);
//        PrintWriter pw = response.getWriter();
//        Probador probador = new Probador();
//        probador.setId(10);
//        probador.setProbador("probando json");
//        probador.addProbador(new Probador2("Probador1"));
//        probador.addProbador(new Probador2("Probador2"));
//        JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
//        jsonObjectBuilder.add("id",probador.getId());
//        jsonObjectBuilder.add("probador",probador.getProbador());
//        JsonObject jsonObject = jsonObjectBuilder.build();
//        pw.print(jsonObject.toString());
//        pw.flush();
//    }
//}

import java.io.IOException;
import java.io.PrintWriter;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/holamundo")
public class HolaMundo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        response.setStatus(200);
        PrintWriter pw = response.getWriter();
        Probador probador = new Probador();
        probador.setId(10);
        probador.setProbador("probando json");
        probador.addProbador(new Probador2("Probador1"));
        probador.addProbador(new Probador2("Probador2"));

        JsonObject jsonObject = convertProbadorToJson(probador);
        pw.print(jsonObject.toString());
        pw.flush();
    }

    private JsonObject convertProbadorToJson(Probador probador) {
        JsonArrayBuilder probadoresArrayBuilder = Json.createArrayBuilder();
        for (Probador2 probador2 : probador.getProbadores()) {
            JsonObject probador2Json = Json.createObjectBuilder()
                    .add("saludo", probador2.getSaludo())
                    .build();
            probadoresArrayBuilder.add(probador2Json);
        }

        JsonObject probadorJson = Json.createObjectBuilder()
                .add("id", probador.getId())
                .add("probador", probador.getProbador())
                .add("probadores", probadoresArrayBuilder)
                .build();

        return probadorJson;
    }
}
