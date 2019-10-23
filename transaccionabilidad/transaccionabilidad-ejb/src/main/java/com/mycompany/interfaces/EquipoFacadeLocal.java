/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.Equipo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hernan
 */
@Local
public interface EquipoFacadeLocal {

    void create(Equipo equipo);

    void edit(Equipo equipo);

    void remove(Equipo equipo);

    Equipo find(Object id);

    List<Equipo> findAll();

    List<Equipo> findRange(int[] range);

    int count();
    
    public void agregarRequired(String nombre, int duracion);
     
    public void agregarRequiredNew(String nombre, int duracion);
    
    public void agregarFail(String nombre, int duracion);
    
    public void agregarFailNS(String nombre, int duracion);
    
    
}
