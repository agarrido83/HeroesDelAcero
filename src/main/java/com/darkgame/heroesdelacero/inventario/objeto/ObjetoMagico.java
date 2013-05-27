package com.darkgame.heroesdelacero.inventario.objeto;

/**
 * Created by Antonio on 22/05/13.
 */
public class ObjetoMagico extends Objeto {
    private String descripcionLarga;

    public ObjetoMagico(String nom, String desc, String descLarg) {
        super(nom,desc);
        descripcionLarga = descLarg;
    }
}
