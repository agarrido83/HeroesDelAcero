package com.darkgame.heroesdelacero.personaje.bolsa;

import com.darkgame.heroesdelacero.inventario.objeto.*;

/**
 * Created by Antonio on 22/05/13.
 */
public class BolsaExtendida extends Bolsa {
    private final int MAX_BOLSA = 7;

    public BolsaExtendida() {
        super();
        elementos = new ObjetoAlmacenable[MAX_BOLSA];
    }

}
