package com.darkgame.heroesdelacero.personaje;

import com.darkgame.heroesdelacero.partida.*;
import com.darkgame.heroesdelacero.inventario.*;
import com.darkgame.heroesdelacero.inventario.objeto.*;
import com.darkgame.heroesdelacero.personaje.armadurapersonaje.*;
import com.darkgame.heroesdelacero.personaje.bolsa.*;

/**
 * Created by Antonio on 22/05/13.
 */
public abstract class Personaje {

    protected String nombre;
    protected Genero genero;
    protected Profesion profesion;
    protected int puntosDeVida;
    protected int puntosDePoder;
    protected int puntosDeExperiencia;
    protected int contadorPXVida;
    protected int contadorPXPoder;
    protected int fuerza;
    protected int destreza;
    protected int magia;
    protected int percepcion;
    protected HabilidadEspecial[] habilidades;
    protected ArmaduraPersonaje armadura;
    protected Arma arma;
    protected Bolsa bolsa;
    protected int zaifas;
    protected ObjetoMagico[] objetosMagicos;
    protected int campamentoBase;

    public Personaje(String nom, Genero gen, Profesion prof) {
        nombre = nom;
        genero = gen;
        profesion = prof;
        puntosDeVida = 20;

        switch (profesion) {
            case HECHICERO:
                puntosDePoder = 3;
                break;
            case MONJE_CABALLERO_DE_SAGRAST:
                puntosDePoder = 1;
                break;
            case ALQUIMISTA:
                puntosDePoder = 2;
                break;
            default:
                puntosDePoder = 0;
        }

        puntosDeExperiencia = 0;
        contadorPXVida = 0;
        contadorPXPoder = 0;
        habilidades = null;
        armadura = new ArmaduraPersonaje();
        arma = null;

        if (profesion == Profesion.LADRON) {
            bolsa = new BolsaExtendida();
        } else {
            bolsa = new BolsaNormal();
        }

        zaifas = 15;
        objetosMagicos = null;
        campamentoBase = 0;
    }
}
