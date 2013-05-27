package com.darkgame.heroesdelacero.inventario;

import android.content.res.Resources;
import java.util.ArrayList;

/**
 * Created by Antonio on 24/05/13.
 */
public class Inventario {
    private static InventarioDeObjetos inventarioDeObjetos;
    private static ArrayList<HabilidadEspecial> coleccionDeHabilidadesEspeciales;
    private static ArrayList<Enemigo> coleccionDeEnemigos;

    public Inventario() {
        inventarioDeObjetos = null;
        coleccionDeHabilidadesEspeciales = null;
        coleccionDeEnemigos = null;
    }

    public void cargaInventario() {
        cargaInventarioDeObjetos();
        cargaColeccionDeHabilidadesEspeciales();
        cargaColeccionDeEnemigos();
    }

    private void cargaInventarioDeObjetos() {
        inventarioDeObjetos = new InventarioDeObjetos();
        inventarioDeObjetos.cargaInventarioDeObjetos();
    }

    private void cargaColeccionDeHabilidadesEspeciales() {
        ArrayList<HabilidadEspecial> habilidadEspecialArrayList = new ArrayList<HabilidadEspecial>();

        HabilidadEspecial habilidadEspecial;
        coleccionDeHabilidadesEspeciales = habilidadEspecialArrayList;
    }

    private void cargaColeccionDeEnemigos() {
        ArrayList<Enemigo> enemigoArrayList = new ArrayList<Enemigo>();

        Enemigo enemigo;
        coleccionDeEnemigos = enemigoArrayList;
    }
}
