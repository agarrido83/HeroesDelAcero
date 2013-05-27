package com.darkgame.heroesdelacero.inventario;

import android.content.res.Resources;
import com.darkgame.heroesdelacero.Principal;
import com.darkgame.heroesdelacero.R;
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
        String nom;
        String des;
        String exp;
        ObjetoMagico objetoMagico;

        ArrayList<ObjetoMagico> objetoMagicoArrayList = new ArrayList<ObjetoMagico>();

        nom = Principal.res.getString(R.string.anillo_de_voldar_nom);
        des = Principal.res.getString(R.string.anillo_de_voldar_des);
        exp = Principal.res.getString(R.string.anillo_de_voldar_exp);
        objetoMagico = new ObjetoMagico(nom,des,exp);
        objetoMagicoArrayList.add(objetoMagico);

        nom = Principal.res.getString(R.string.guantes_de_poder_nom);
        des = Principal.res.getString(R.string.guantes_de_poder_des);
        exp = Principal.res.getString(R.string.guantes_de_poder_exp);
        objetoMagico = new ObjetoMagico(nom,des,exp);
        objetoMagicoArrayList.add(objetoMagico);

        nom = Principal.res.getString(R.string.collar_de_vida_nom);
        des = Principal.res.getString(R.string.collar_de_vida_des);
        exp = Principal.res.getString(R.string.collar_de_vida_exp);
        objetoMagico = new ObjetoMagico(nom,des,exp);
        objetoMagicoArrayList.add(objetoMagico);

        nom = Principal.res.getString(R.string.cinto_de_resistencia_nom);
        des = Principal.res.getString(R.string.cinto_de_resistencia_des);
        exp = Principal.res.getString(R.string.cinto_de_resistencia_exp);
        objetoMagico = new ObjetoMagico(nom,des,exp);
        objetoMagicoArrayList.add(objetoMagico);

        nom = Principal.res.getString(R.string.capa_magica_de_molfrach_nom);
        des = Principal.res.getString(R.string.capa_magica_de_molfrach_des);
        exp = Principal.res.getString(R.string.capa_magica_de_molfrach_exp);
        objetoMagico = new ObjetoMagico(nom,des,exp);
        objetoMagicoArrayList.add(objetoMagico);

        nom = Principal.res.getString(R.string.anillo_de_ronwen_nom);
        des = Principal.res.getString(R.string.anillo_de_ronwen_des);
        exp = Principal.res.getString(R.string.anillo_de_ronwen_exp);
        objetoMagico = new ObjetoMagico(nom,des,exp);
        objetoMagicoArrayList.add(objetoMagico);

        nom = Principal.res.getString(R.string.collar_de_vida_aumentada_nom);
        des = Principal.res.getString(R.string.collar_de_vida_aumentada_des);
        exp = Principal.res.getString(R.string.collar_de_vida_aumentada_exp);
        objetoMagico = new ObjetoMagico(nom,des,exp);
        objetoMagicoArrayList.add(objetoMagico);

        nom = Principal.res.getString(R.string.brazalete_mistico_duymor_nom);
        des = Principal.res.getString(R.string.brazalete_mistico_duymor_des);
        exp = Principal.res.getString(R.string.brazalete_mistico_duymor_exp);
        objetoMagico = new ObjetoMagico(nom,des,exp);
        objetoMagicoArrayList.add(objetoMagico);

        coleccionDeObjetosMagicos = objetoMagicoArrayList;
    }
}
