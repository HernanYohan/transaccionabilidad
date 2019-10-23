/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.interfaces.EquipoFacadeLocal;
import com.mycompany.entity.Equipo;
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
public class EquipoFacade extends AbstractFacade<Equipo> implements EquipoFacadeLocal {
    @PersistenceContext(unitName = "persistence")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EquipoFacade() {
        super(Equipo.class);
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarRequired(String nombre, int duracion){
        Equipo equipo = new Equipo(nombre, duracion);
        em.persist(equipo);
    }
    
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void agregarRequiredNew(String nombre, int duracion){
        Equipo equipo = new Equipo(nombre, duracion);
        em.persist(equipo);
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarFail(String nombre, int duracion){
        Equipo equipo = new Equipo(nombre, duracion);
        em.persist(equipo);
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void agregarFailNS(String nombre, int duracion){
        Equipo equipo = new Equipo(nombre, duracion);
        em.persist(equipo);
    }
}
