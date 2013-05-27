package com.darkgame.heroesdelacero.personaje;

import com.darkgame.heroesdelacero.partida.Genero;
import com.darkgame.heroesdelacero.partida.Profesion;

/**
 * Created by Antonio on 22/05/13.
 */
public class ElfoSilvano extends Elfo {

    public ElfoSilvano(String nom, Genero gen, Profesion prof) {
        super(nom,gen,prof);
        magia = 1;

        switch(profesion){
            case HECHICERO:                     // magia
                percepcion = 1;
                break;
            case CAZADOR:                       // percepción
                percepcion = 1;
                break;
            case GUERRERO:                      // fuerza
                fuerza = 1;
                break;
            case LADRON:                        // destreza
                destreza = 1;
                break;
            case JUGLAR:                        // destreza
                destreza = 1;
                break;
            case MONJE_CABALLERO_DE_SAGRAST:    // magia
                percepcion = 1;
                break;
            case ALQUIMISTA:                    // magia
                percepcion = 1;
        }
    }
}
