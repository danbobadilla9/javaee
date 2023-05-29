/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Service;

import Models.Dao.EncargadoDAOImp;
import Models.Entity.Encargado;
import Models.Utilities.ArchivoEnv;
import Models.Utilities.DB;
import Models.Utilities.Encriptacion;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;

/**
 *
 * @author user
 */
public class EncargadoService {

    private EncargadoDAOImp encargadoDAOImp;
    private final String PATH  = "C:\\Users\\user\\Documents\\NetBeansProjects\\ServletAPI\\web\\Resources\\salt.txt";

    public EncargadoService() {
        encargadoDAOImp = new EncargadoDAOImp();
    }

    public void insertarEncargado() {
        Encargado encargado = new Encargado();
        encargado.setNombre("dan israel");
        encargado.setClaveTrabajador("D19100");
        encargado.setTelefono("55154878");
        encargado.setRol("Administrador");
        byte[] salt = Encriptacion.generateSalt();
        ArchivoEnv.agregarBytesAlArchivo(1, salt, PATH);
        encargado.setPassword(Encriptacion.generateHashedPassword("Dard1", salt));
        encargadoDAOImp.insertObject(encargado);
    }
    
    public void obtenerEncargado(String claveTrabajador){
        Encargado encargado = encargadoDAOImp.getObject(claveTrabajador);
        System.out.println(encargado.getIdEncargado());
        System.out.println(encargado.getNombre());
        System.out.println(encargado.getClaveTrabajador());
    }

    

}
