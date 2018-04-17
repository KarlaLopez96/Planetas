package com.karla00058615.labo5;

/**
 * Created by UCA on 16/04/2018.
 */

public class Planetas {

    public String nombre, descripcion;
    public int id;

    public Planetas(int id, String descripcion,String nombre){
        nombre = nombre;
        descripcion = descripcion;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public int getId(){
        return id;
    }

    public void setNombre(String nombre){
        nombre = nombre;
    }

    public void setDescripcion(String descripcion){
        descripcion = descripcion;
    }

    public void setId(String id){
        id = id;
    }

}
