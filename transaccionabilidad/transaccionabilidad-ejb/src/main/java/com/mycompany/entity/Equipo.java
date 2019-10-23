/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hernan
 */

@Entity
@Table(name = "equipo")
public class Equipo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "tipo")
    private int tipo;

    public Equipo(int id, String nombre, int tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Equipo() {
    }

    public Equipo(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the duracion
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the duracion to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
