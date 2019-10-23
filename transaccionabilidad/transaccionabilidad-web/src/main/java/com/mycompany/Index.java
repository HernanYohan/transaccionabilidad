/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.mycompany.interfaces.EquipoFacadeLocal;
import com.mycompany.interfaces.FutbolistaFacadeLocal;
import com.mycompany.interfaces.TransaccionLocal;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Hernan
 */
@Named(value = "index")
@RequestScoped
public class Index {
    
    @EJB
    TransaccionLocal transaccionlocal;

    @EJB
    EquipoFacadeLocal equipolocal;

    @EJB
    FutbolistaFacadeLocal futbolistalocal;

    /**
     * Creates a new instance of Index
     */
    public Index() {
    }
    /**
     * Accion reaizada al darle clic al boton 
     */
    public void boton11() {
        equipolocal.agregarRequired("Azul", 1);
    }
    /**
     * Accion reaizada al darle clic al boton 
     */
    public void boton12() {
        transaccionlocal.agregar2Required();
    }
    /**
     * Accion reaizada al darle clic al boton 
     */
    public void boton21() {
        transaccionlocal.agregarRequiredNew();
    }
    /**
     * Accion reaizada al darle clic al boton 
     */
    public void boton22() {
        transaccionlocal.agregar2RequiredNew();
    }
    /**
     * Accion reaizada al darle clic al boton 
     */
    public void boton31() {
        futbolistalocal.agregarFutbolistaSupports("Hernan", "Hernandez", "Hernandez@mail.com");
        equipolocal.agregarFail(null, 2);
    }
    /**
     * Accion reaizada al darle clic al boton 
     */
    public void boton32() {
        transaccionlocal.agregar2Supports();
    }
    /**
     * Accion reaizada al darle clic al boton 
     */
    public void boton41() {
        futbolistalocal.agregarFutbolistaMandatory("Hernan", "Hernandez", "Hernandez@mail.com");
    }
    /**
     * Accion reaizada al darle clic al boton 
     */
    public void boton42() {
        transaccionlocal.agregar2Mandatory();
    }
    /**
     * Accion reaizada al darle clic al boton 
     */
    public void boton51() {
        equipolocal.agregarFailNS(null, 2);
    }
    /**
     * Accion reaizada al darle clic al boton 
     */
    public void boton52() {
        transaccionlocal.agregar2NotSupported();
    }
    /**
     * Accion reaizada al darle clic al boton 
     */
    public void boton61() {
        futbolistalocal.agregarFutbolistaNever("Hernan", "Hernandez", "Hernandez@mail.com");
    }
    /**
     * Accion reaizada al darle clic al boton 
     */
    public void boton62() {
        transaccionlocal.agregar2Never();
    }

}
    

