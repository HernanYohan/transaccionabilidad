/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import javax.ejb.Local;

/**
 *
 * @author Hernan
 */

    
@Local
public interface TransaccionLocal {
/**
 * Metodos  de transacciones
 */
    public void agregarRequired();
    /**
 * Metodos  de transacciones
 */

    public void agregar2Required();
    /**
 * Metodos  de transacciones
 */

    public void agregarRequiredNew();
/**
 * Metodos  de transacciones
 */
    public void agregar2RequiredNew();
/**
 * Metodos  de transacciones
 */
    public void agregar2Supports();
/**
 * Metodos  de transacciones
 */
    public void agregarSupports();
/**
 * Metodos  de transacciones
 */
    public void agregarMandatory();
/**
 * Metodos  de transacciones
 */
    public void agregar2Mandatory();
/**
 * Metodos  de transacciones
 */
    public void agregarNotSupported();
/**
 * Metodos  de transacciones
 */
    public void agregar2NotSupported();
/**
 * Metodos  de transacciones
 */
    public void agregarNever();
/**
 * Metodos  de transacciones
 */
    public void agregar2Never();

}
   
   

