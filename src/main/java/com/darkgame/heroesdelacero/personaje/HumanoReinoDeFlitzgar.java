package com.darkgame.heroesdelacero.personaje;

import com.darkgame.heroesdelacero.partida.Genero;
import com.darkgame.heroesdelacero.partida.Profesion;

/**
 * Created by Antonio on 22/05/13.
 */
public class HumanoReinoDeFlitzgar extends Humano {

    public HumanoReinoDeFlitzgar(String nom, Genero gen, Profesion prof) {
        super(nom,gen,prof);
        destreza = 1;
        switch(profesion){
            case HECHICERO:                     // magia
                magia = 1;
                break;
            case CAZADOR:                       // percepción
                percepcion = 1;
                break;
            case GUERRERO:                      // fuerza
                fuerza = 1;
                break;
            case LADRON:                        // destreza
                percepcion = 1;
                break;
            case JUGLAR:                        // destreza
                percepcion = 1;
                break;
            case MONJE_CABALLERO_DE_SAGRAST:    // magia
                magia = 1;
                break;
            case ALQUIMISTA:                    // magia
                magia = 1;
        }
    }
}
