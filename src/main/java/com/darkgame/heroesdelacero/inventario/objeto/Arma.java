package com.darkgame.heroesdelacero.inventario.objeto;

/**
 * Created by Antonio on 22/05/13.
 */
public class Arma extends ObjetoAlmacenable {
    private String descripcionLarga;

    public Arma(String nom, String desc, String descLarg) {
        super(nom,desc);
        descripcionLarga = descLarg;
    }
}
