/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Probador implements Serializable{
    private String probador;
    private int id;
    private List<Probador2> probadores;
    public Probador(){
                this.probadores = new ArrayList<>();
    }
    //https://repo1.maven.org/maven2/org/glassfish/javax.json/1.1.4/
    public Probador(String probador, int id) {
        this.probador = probador;
        this.id = id;
        this.probadores = new ArrayList<>();
    }

    public String getProbador() {
        return probador;
    }

    public void setProbador(String probador) {
        this.probador = probador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Probador2> getProbadores() {
        return probadores;
    }

    public void setProbadores(List<Probador2> probadores) {
        this.probadores = probadores;
    }
    
    public void addProbador(Probador2 probador){
        this.probadores.add(probador);
    }
    
}
