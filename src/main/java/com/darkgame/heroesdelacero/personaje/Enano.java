package com.darkgame.heroesdelacero.personaje;

import com.darkgame.heroesdelacero.partida.Genero;
import com.darkgame.heroesdelacero.partida.Profesion;

/**
 * Created by Antonio on 22/05/13.
 */
public abstract class Enano extends Personaje {

    public Enano(String nom, Genero gen, Profesion prof) {
        super(nom,gen,prof);
        fuerza = 1;
    }
}
