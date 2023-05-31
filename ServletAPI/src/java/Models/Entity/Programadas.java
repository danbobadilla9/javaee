/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Entity;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Programadas implements Serializable{
    private long idFuncionalidad;
    private long ifFechas;
    private boolean ejecucionCalendarizada;

    public Programadas() {
    }

    public Programadas(long idFuncionalidad, long ifFechas, boolean ejecucionCalendarizada) {
        this.idFuncionalidad = idFuncionalidad;
        this.ifFechas = ifFechas;
        this.ejecucionCalendarizada = ejecucionCalendarizada;
    }

    public long getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(long idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }

    public long getIfFechas() {
        return ifFechas;
    }

    public void setIfFechas(long ifFechas) {
        this.ifFechas = ifFechas;
    }

    public boolean isEjecucionCalendarizada() {
        return ejecucionCalendarizada;
    }

    public void setEjecucionCalendarizada(boolean ejecucionCalendarizada) {
        this.ejecucionCalendarizada = ejecucionCalendarizada;
    }
    
    
}
