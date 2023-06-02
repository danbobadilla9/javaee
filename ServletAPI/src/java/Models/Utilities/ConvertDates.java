/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Utilities;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class ConvertDates {

    private final static String FORMAT = "dd/MM/yyyy";

    public static Timestamp fechaToTimestamp(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat(FORMAT);
        Timestamp fechaGenerada = null;
        try {
            Date fechaDate = formato.parse(fecha);
            fechaGenerada = new Timestamp(fechaDate.getTime());
        } catch (ParseException e) {
            System.out.println("No se pudo convertir a timestmap" + e.getMessage());
        }
        return fechaGenerada;
    }

    private static String intervalToString(String convert) throws ParseException {
        // Convierte el INTERVAL a un tipo de dato en Java
        // En este ejemplo, suponemos que el INTERVAL se representa en el formato 'HH:MI:SS'
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        java.util.Date parsedDate = sdf.parse(convert);
        Time interval = new Time(parsedDate.getTime());

        System.out.println("Intervalo: " + interval);
        return interval.toString();
        
    }

}
