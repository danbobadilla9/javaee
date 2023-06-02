/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Utilities;

import Models.Entity.Funcionalidad;
import Models.Entity.Sistema;
import Models.Entity.TipoPrueba;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;


/**
 *
 * @author user
 */
public class JSON {

    public static String JsonFiltroArchivo(List<Sistema> sistemas, List<TipoPrueba> tipoPruebas, List<Funcionalidad> funcionalidads) {
        JsonArrayBuilder probadoresArrayBuilder = Json.createArrayBuilder();
        for (Sistema sistema : sistemas) {
            JsonObject jsonObject = Json.createObjectBuilder()
                    .add("idSistema", sistema.getIdSistema())
                    .add("nombreSistema", sistema.getNombreSistema())
                    .add("pruebas", jsonArrayFilter(tipoPruebas, funcionalidads, (int) sistema.getIdSistema()))
                    .build();
            probadoresArrayBuilder.add(jsonObject);
        }
        JsonObject probadorJson = Json.createObjectBuilder()
                .add("filtroArchivo", probadoresArrayBuilder).build();
        return probadorJson.toString();

    }

    public static JsonArrayBuilder jsonArrayFilter(List<TipoPrueba> tipoPruebas, List<Funcionalidad> funcionalidades, int idSistema) {
        JsonArrayBuilder probadoresArrayBuilder = Json.createArrayBuilder();
        for (TipoPrueba tipoPrueba : tipoPruebas) {
            if (idSistema == tipoPrueba.getIdSistema()) {
                JsonObject jsonObject = Json.createObjectBuilder()
                        .add("idPrueba", tipoPrueba.getIdTipoPrueba())
                        .add("nombrePrueba", tipoPrueba.getNombreCorto())
                        .add("funcionalidad", jsonArrayFilter(funcionalidades, (int) tipoPrueba.getIdTipoPrueba()))
                        .build();
                probadoresArrayBuilder.add(jsonObject);
            }

        }
        return probadoresArrayBuilder;
    }

    public static JsonArrayBuilder jsonArrayFilter(List<Funcionalidad> funcionalidades, int idTipoPrueba) {
        JsonArrayBuilder probadoresArrayBuilder = Json.createArrayBuilder();
        for (Funcionalidad funcionalidad : funcionalidades) {
            if (idTipoPrueba == funcionalidad.getIdTipoPrueba()) {
                JsonObject jsonObject = Json.createObjectBuilder()
                        .add("idFuncionalidad", funcionalidad.getIdFuncionalidad())
                        .add("nombreFuncionalidad", funcionalidad.getNombreFuncionalidad())
                        .build();
                probadoresArrayBuilder.add(jsonObject);
            }

        }
        return probadoresArrayBuilder;
    }


}
