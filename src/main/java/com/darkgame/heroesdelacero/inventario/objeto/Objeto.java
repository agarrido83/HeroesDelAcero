package com.darkgame.heroesdelacero.inventario.objeto;

/**
 * Created by Antonio on 22/05/13.
 */
public abstract class Objeto {
    protected String nombre;
    protected String descripcion;

    public Objeto(String nom, String desc) {
        nombre = nom;
        descripcion = desc;
    }
}
