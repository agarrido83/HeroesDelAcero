package com.darkgame.heroesdelacero.inventario;

import android.content.res.Resources;
import com.darkgame.heroesdelacero.inventario.objeto.*;
import java.util.ArrayList;

/**
 * Created by Antonio on 24/05/13.
 */
public class InventarioDeObjetos {
    private static ArrayList<Arma> coleccionDeArmas;
    private static InventarioDeArmaduras inventarioDeArmaduras;
    private static ArrayList<Equipo> coleccionDeEquipo;
    private static ArrayList<ObjetoMagico> coleccionDeObjetosMagicos;

    public InventarioDeObjetos() {
        coleccionDeArmas = null;
        inventarioDeArmaduras = null;
        coleccionDeEquipo = null;
        coleccionDeObjetosMagicos = null;
    }

    public void cargaInventarioDeObjetos() {
        cargaArmas();
        cargaArmaduras();
        cargaEquipo();
        cargaObjetosMagicos();
    }

    private void cargaArmas() {
        ArrayList<Arma> armaArrayList = new ArrayList<Arma>();

        Arma arma;
        coleccionDeArmas = armaArrayList;
    }

    private void cargaArmaduras() {
        inventarioDeArmaduras = new InventarioDeArmaduras();
        inventarioDeArmaduras.cargaArmaduras();
    }

    private void cargaEquipo() {
        ArrayList<Equipo> equipoArrayList = new ArrayList<Equipo>();

        Equipo equipo;
        coleccionDeEquipo = equipoArrayList;
    }

    private void cargaObjetosMagicos() {
        ArrayList<ObjetoMagico> objetoMagicoArrayList = new ArrayList<ObjetoMagico>();

        ObjetoMagico objetoMagico;
        coleccionDeObjetosMagicos = objetoMagicoArrayList;
    }
}
