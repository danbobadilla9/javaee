/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Utilities;

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
    public static Timestamp fechaToTimestamp(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat(FORMAT);
        Timestamp fechaGenerada = null;
        try{
            Date fechaDate = formato.parse(fecha);
            fechaGenerada = new Timestamp(fechaDate.getTime());
        }catch(ParseException e){
            System.out.println("No se pudo convertir a timestmap"+e.getMessage());
        }
        return fechaGenerada;
    }
}
