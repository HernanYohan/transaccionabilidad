/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.Futbolista;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hernan
 */
@Local
public interface FutbolistaFacadeLocal {

    void create(Futbolista futbolista);

    void edit(Futbolista futbolista);

    void remove(Futbolista futbolista);

    Futbolista find(Object id);

    List<Futbolista> findAll();

    List<Futbolista> findRange(int[] range);

    int count();
    
    public void agregarFutbolistaRequired(String nombre, String apellido, String correo);
    
    public void agregarFutbolistaRequiredNew(String nombre, String apellido, String correo);
    
    public void agregarFutbolistaSupports(String nombre, String apellido, String correo);
    
    public void agregarFutbolistaMandatory(String nombre, String apellido, String correo);
    
    public void agregarFutbolistanotSupported(String nombre, String apellido, String correo);
    
    public void agregarFutbolistaNever(String nombre, String apellido, String correo);
}
