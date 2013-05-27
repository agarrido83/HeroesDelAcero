package com.darkgame.heroesdelacero.inventario.objeto;

/**
 * Created by Antonio on 22/05/13.
 */
public class Equipo extends ObjetoAlmacenable {
    private String descripcionLarga;

    public Equipo(String nom, String desc, String descLarg) {
        super(nom,desc);
        descripcionLarga = descLarg;
    }
}
