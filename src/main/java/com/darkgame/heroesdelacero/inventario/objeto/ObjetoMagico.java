package com.darkgame.heroesdelacero.inventario.objeto;

/**
 * Created by Antonio on 22/05/13.
 */
public class ObjetoMagico extends Objeto {
    private String explicacion;

    public ObjetoMagico(String nom, String des, String exp) {
        super(nom,des);
        explicacion = exp;
    }
}
