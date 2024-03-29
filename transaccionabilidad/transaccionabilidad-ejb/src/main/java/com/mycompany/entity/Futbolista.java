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
@Table(name = "futbolista")
public class Futbolista implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * se guarda el id de la tabla
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     * se guarda el nombre del futbolista
     */
    @Column(name = "nombre")
    private String nombre;
    /**
     * se guarda el apellido del futbolista
     */
    
    @Column(name = "apellido")
    private String apellido;
    /**
     * se guarda el correo del futbolista
     */
    @Column(name = "correo")
    private String correo;
    /**
     * constructor
     * @param id
     * @param nombre
     * @param apellido
     * @param correo 
     */
    public Futbolista(int id, String nombre, String apellido, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
    /**
     * constructor
     */
    public Futbolista() {
    }
    /**
     * constructor
     * @param nombre
     * @param apellido
     * @param correo 
     */
    public Futbolista(String nombre, String apellido, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
