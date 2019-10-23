/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.interfaces.FutbolistaFacadeLocal;
import com.mycompany.entity.Futbolista;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Hernan
 */
@Stateless
public class FutbolistaFacade extends AbstractFacade<Futbolista> implements FutbolistaFacadeLocal {
    @PersistenceContext(unitName = "persistence")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FutbolistaFacade() {
        super(Futbolista.class);
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarFutbolistaRequired(String nombre, String apellido, String correo) {
        Futbolista fut = new Futbolista(nombre, apellido, correo);
        em.persist(fut);
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void agregarFutbolistaRequiredNew(String nombre, String apellido, String correo) {
        Futbolista fut = new Futbolista(nombre, apellido, correo);
        em.persist(fut);
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public void agregarFutbolistaSupports(String nombre, String apellido, String correo) {
        Futbolista fut = new Futbolista(nombre, apellido, correo);
        create(fut);
    }
    
    
    @Override
    @TransactionAttribute(TransactionAttributeType.MANDATORY)
    public void agregarFutbolistaMandatory(String nombre, String apellido, String correo) {
        Futbolista fut = new Futbolista(nombre, apellido, correo);
        em.persist(fut);
    }
    
    
    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void agregarFutbolistanotSupported(String nombre, String apellido, String correo) {
        Futbolista fut = new Futbolista(nombre, apellido, correo);
        create(fut);
    }
    
    /**
     * solo define el estado de transacción requerido que debe existir
     * cuando se invoca el método anotado (en este caso, una transacción
     * no debe existir).
     * @param nombre
     * @param apellido
     * @param correo 
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.NEVER)
    
    public void agregarFutbolistaNever(String nombre, String apellido, String correo) {
        Futbolista fut = new Futbolista(nombre, apellido, correo);
        create(fut);
    }
    
}
