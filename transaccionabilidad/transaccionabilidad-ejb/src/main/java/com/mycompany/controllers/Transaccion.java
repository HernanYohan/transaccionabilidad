/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllers;

import com.mycompany.interfaces.EquipoFacadeLocal;
import com.mycompany.interfaces.FutbolistaFacadeLocal;
import com.mycompany.interfaces.TransaccionLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 *
 * @author Hernan
 */
@Stateless
public class Transaccion implements TransaccionLocal {
    
        @EJB
        EquipoFacadeLocal equipolocal;
        
        @EJB
        FutbolistaFacadeLocal futbolistalocal;
    
        /**
         * Transaccion Required con cliente no transaccional
         * R - Agregar Tarea normal -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.NEVER)
        public void agregarRequired(){
            equipolocal.agregarRequired("Azul", 1);
        }
        
        /**
         * Transaccion Required con cliente transaccional
         * R - No agrega Usuario  F- tarea  -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.REQUIRED)
        public void agregar2Required(){
            futbolistalocal.agregarFutbolistaRequired("Hernan", "Hernandez", "Hernandez@mail.com");
            equipolocal.agregarFail(null, 2);
        }
        
        /**
         * Transaccion RequiredNew con cliente no transaccional
         * R - Agregar Tarea normal -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.NEVER)
        public void agregarRequiredNew(){
            equipolocal.agregarRequired("Negro", 2);
        }
        
        /**
         * Transaccion RequiredNew con cliente transaccional
         * R - Agregar Usuario normal  F- agregar tarea  -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.REQUIRED)
        public void agregar2RequiredNew(){
            futbolistalocal.agregarFutbolistaRequiredNew("Hernan", "Hernandez", "Hernandez@mail.com");
            equipolocal.agregarFail(null, 2);
        }
        
        /**
         * Transaccion Supports con cliente transaccional
         * R - no agregar usuario F- agegar tarea -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.REQUIRED)
        public void agregar2Supports(){
            futbolistalocal.agregarFutbolistaSupports("Hernan", "Hernandez", "Hernandez@mail.com");
            equipolocal.agregarFail(null, 2);
        }
        
        /**
         * Transaccion Supports con cliente no transaccional
         * R - Agregar Usuario normal F- tarea   -f no agrego ninguno   
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.NEVER)
        public void agregarSupports(){
            futbolistalocal.agregarFutbolistaSupports("Hernan", "Hernandez", "Hernandez@mail.com");
            equipolocal.agregarFail(null, 2);
        }
        
        
        
        /**
         * Transaccion Mandatory con cliente no transaccional
         * R - excepcion  -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.NEVER)
        public void agregarMandatory(){
            futbolistalocal.agregarFutbolistaMandatory("Hernan", "Hernandez", "Hernandez@mail.com");
        }
        
        /**
         * Transaccion Mandatory con cliente transaccional
         * R - No Agregar Usuario normal F- tarea -r
         * 
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.REQUIRED)
        public void agregar2Mandatory(){
            futbolistalocal.agregarFutbolistaMandatory("Hernan", "Hernandez", "Hernandez@mail.com");
            equipolocal.agregarFail(null, 2);
        }
        
        
        /**
         * Transaccion notSupported con cliente no transaccional
         * F- tarea -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.NEVER)
        public void agregarNotSupported(){
            equipolocal.agregarFailNS(null, 2);
        }
        
        /**
         * Transaccion notSupported con cliente transaccional
         * R - Agregar Usuario normal F- tarea -f no agrego usuario
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.REQUIRED)
        public void agregar2NotSupported(){
            futbolistalocal.agregarFutbolistaRequired("Hernan", "Hernandez", "Hernandez@mail.com");
            equipolocal.agregarFailNS(null, 2);
        }
        
        /**
         * Transaccion never con cliente no transaccional
         * R - Agregar Usuario normal -f no agrego usuario -f
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
        public void agregarNever(){
            futbolistalocal.agregarFutbolistaNever("Hernan", "Hernandez", "Hernandez@mail.com");
        }
        
        /**
         * Transaccion never con cliente transaccional
         * R - excepcion -r
         */
        @Override
        @TransactionAttribute(TransactionAttributeType.REQUIRED)
        public void agregar2Never(){
            futbolistalocal.agregarFutbolistaNever("Hernan", "Hernandez", "Hernandez@mail.com");
        }
    
}
