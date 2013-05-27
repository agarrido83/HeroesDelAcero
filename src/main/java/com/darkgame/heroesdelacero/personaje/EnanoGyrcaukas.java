package com.darkgame.heroesdelacero.personaje;

import com.darkgame.heroesdelacero.partida.Genero;
import com.darkgame.heroesdelacero.partida.Profesion;

/**
 * Created by Antonio on 22/05/13.
 */
public class EnanoGyrcaukas extends Enano {

    public EnanoGyrcaukas(String nom, Genero gen, Profesion prof) {
        super(nom,gen,prof);

        switch(profesion){
            case HECHICERO:                     // magia
                magia = 1;
                break;
            case CAZADOR:                       // percepción
                percepcion = 1;
                break;
            case GUERRERO:                      // fuerza
                percepcion = 1;
                break;
            case LADRON:                        // destreza
                destreza = 1;
                break;
            case JUGLAR:                        // destreza
                destreza = 1;
                break;
            case MONJE_CABALLERO_DE_SAGRAST:    // magia
                magia = 1;
                break;
            case ALQUIMISTA:                    // magia
                magia = 1;
                break;
            default:
                break;
        }
    }
}
