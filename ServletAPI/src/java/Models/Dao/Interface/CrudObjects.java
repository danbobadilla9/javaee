/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao.Interface;

import java.util.List;

/**
 *
 * @author user
 */
public interface CrudObjects<T extends Object> {
    boolean insertObject(T objeto);
    boolean updateObject(T objeto);
    boolean deleteObject(T objeto);
    List<T> listObjects(String objeto);
    List<T> listObjects();
    T getObject(int id);
    T getObject(String cadena);
    
}
