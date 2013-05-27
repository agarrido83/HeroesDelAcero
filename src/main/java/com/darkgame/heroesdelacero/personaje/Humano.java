package com.darkgame.heroesdelacero.personaje;

import com.darkgame.heroesdelacero.partida.Genero;
import com.darkgame.heroesdelacero.partida.Profesion;

/**
 * Created by Antonio on 22/05/13.
 */
public abstract class Humano extends Personaje{

    public Humano(String nom, Genero gen, Profesion prof) {
        super(nom,gen,prof);
    }
}
