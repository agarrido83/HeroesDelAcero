package com.darkgame.heroesdelacero.partida;

import com.darkgame.heroesdelacero.personaje.*;

/**
 * Created by Antonio on 24/05/13.
 */
public class Partida {
    private Personaje personaje;
    private int seccionActual;
    private int[] campamentosBase;

    public Partida() {
        personaje = null;
        seccionActual = 0;
        campamentosBase = null;
    }

    public void cargaPartida() {
        // Si hay partida a medio...
        // la cargo
    }

    public void creaPersonaje(String nombre, Genero genero, Raza raza, Reino reino, Profesion profesion) {
        switch(raza) {
            case ELFO:
                switch (reino) {
                    case SILVANOS:
                        personaje = new ElfoSilvano(nombre,genero,profesion);
                        break;
                    case DE_LA_NIEVE:
                        personaje = new ElfoDeLaNieve(nombre,genero,profesion);
                        break;
                    default:
                        break;
                }
                break;
            case ENANO:
                switch (reino) {
                    case GYRCAUKAS:
                        personaje = new EnanoGyrcaukas(nombre,genero,profesion);
                        break;
                    case TERNOSTAN:
                        personaje = new EnanoTernostan(nombre,genero,profesion);
                        break;
                    default:
                        break;
                }
                break;
            case HUMANO:
                switch (reino) {
                    case FLITZGAR:
                        personaje = new HumanoReinoDeFlitzgar(nombre,genero,profesion);
                        break;
                    case VERINFES:
                        personaje = new HumanoReinoDeVerinfes(nombre,genero,profesion);
                        break;
                    case BERWALD:
                        personaje = new HumanoBerwald(nombre,genero,profesion);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }

    public Personaje getPersonaje() {
        return personaje;
    }
}
