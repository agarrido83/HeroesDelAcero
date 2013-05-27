package com.darkgame.heroesdelacero.personaje.bolsa;

import com.darkgame.heroesdelacero.inventario.objeto.ObjetoAlmacenable;

/**
 * Created by Antonio on 26/05/13.
 */
public class BolsaNormal extends Bolsa {
    private final int MAX_BOLSA = 6;

    public BolsaNormal() {
        super();
        elementos = new ObjetoAlmacenable[MAX_BOLSA];
    }
}
