package com.darkgame.heroesdelacero.inventario;

import android.content.res.Resources;
import com.darkgame.heroesdelacero.Principal;
import com.darkgame.heroesdelacero.R;
import com.darkgame.heroesdelacero.inventario.objeto.*;
import java.util.ArrayList;

/**
 * Created by Antonio on 24/05/13.
 */
public class InventarioDeArmaduras {
    private static ArrayList<Casco> coleccionDeCascos;
    private static ArrayList<Peto> coleccionDePetos;
    private static ArrayList<Brazales> coleccionDeBrazales;
    private static ArrayList<Grebas> coleccionDeGrebas;

    public InventarioDeArmaduras() {
        coleccionDeCascos = null;
        coleccionDePetos = null;
        coleccionDeBrazales = null;
        coleccionDeGrebas = null;
    }

    public void cargaArmaduras() {
        cargaCascos();
        cargaPetos();
        cargaBrazales();
        cargaGrebas();
    }

    private void cargaCascos() {
        Casco casco;
        String nom;
        String des;

        ArrayList<Casco> cascoArrayList = new ArrayList<Casco>();

        nom = Principal.res.getString(R.string.casco_de_metal_nom);
        des = Principal.res.getString(R.string.casco_de_metal_des);
        casco = new Casco(nom,des);
        cascoArrayList.add(casco);

        nom = Principal.res.getString(R.string.casco_de_metal_reforzado_nom);
        des = Principal.res.getString(R.string.casco_de_metal_reforzado_des);
        casco = new Casco(nom,des);
        cascoArrayList.add(casco);

        nom = Principal.res.getString(R.string.casco_elfico_de_krindaslon_nom);
        des = Principal.res.getString(R.string.casco_elfico_de_krindaslon_des);
        casco = new Casco(nom,des);
        cascoArrayList.add(casco);

        coleccionDeCascos = cascoArrayList;
    }

    private void cargaPetos() {
        String nom;
        String des;
        Peto peto;

        ArrayList<Peto> petoArrayList = new ArrayList<Peto>();

        nom = Principal.res.getString(R.string.peto_de_cuero_nom);
        des = Principal.res.getString(R.string.peto_de_cuero_des);
        peto = new Peto(nom,des);
        petoArrayList.add(peto);

        nom = Principal.res.getString(R.string.peto_de_cuero_elfico_nom);
        des = Principal.res.getString(R.string.peto_de_cuero_elfico_des);
        peto = new Peto(nom,des);
        petoArrayList.add(peto);

        nom = Principal.res.getString(R.string.peto_de_cuero_enano_nom);
        des = Principal.res.getString(R.string.peto_de_cuero_enano_des);
        peto = new Peto(nom,des);
        petoArrayList.add(peto);

        nom = Principal.res.getString(R.string.peto_de_cuero_endurecido_de_balkaar_nom);
        des = Principal.res.getString(R.string.peto_de_cuero_endurecido_de_balkaar_des);
        peto = new Peto(nom,des);
        petoArrayList.add(peto);

        nom = Principal.res.getString(R.string.cota_de_malla_elfica_nom);
        des = Principal.res.getString(R.string.cota_de_malla_elfica_des);
        peto = new Peto(nom,des);
        petoArrayList.add(peto);

        coleccionDePetos = petoArrayList;
    }

    private void cargaBrazales() {
        String nom;
        String des;
        Brazales brazales;

        ArrayList<Brazales> brazalesArrayList = new ArrayList<Brazales>();

        nom = Principal.res.getString(R.string.brazales_de_cuero_nom);
        des = Principal.res.getString(R.string.brazales_de_cuero_des);
        brazales = new Brazales(nom,des);
        brazalesArrayList.add(brazales);

        nom = Principal.res.getString(R.string.brazales_de_cuero_reforzado_nom);
        des = Principal.res.getString(R.string.brazales_de_cuero_reforzado_des);
        brazales = new Brazales(nom,des);
        brazalesArrayList.add(brazales);

        nom = Principal.res.getString(R.string.brazales_de_krindaslon_nom);
        des = Principal.res.getString(R.string.brazales_de_krindaslon_des);
        brazales = new Brazales(nom,des);
        brazalesArrayList.add(brazales);

        coleccionDeBrazales = brazalesArrayList;
    }

    private void cargaGrebas() {
        String nom;
        String des;
        Grebas grebas;

        ArrayList<Grebas> grebasArrayList = new ArrayList<Grebas>();

        nom = Principal.res.getString(R.string.grebas_de_cuero_nom);
        des = Principal.res.getString(R.string.grebas_de_cuero_des);
        grebas = new Grebas(nom,des);
        grebasArrayList.add(grebas);

        nom = Principal.res.getString(R.string.grebas_de_cuero_enano_nom);
        des = Principal.res.getString(R.string.grebas_de_cuero_enano_des);
        grebas = new Grebas(nom,des);
        grebasArrayList.add(grebas);

        nom = Principal.res.getString(R.string.grebas_de_cuero_endurecido_nom);
        des = Principal.res.getString(R.string.grebas_de_cuero_endurecido_des);
        grebas = new Grebas(nom,des);
        grebasArrayList.add(grebas);

        nom = Principal.res.getString(R.string.grebas_de_krindaslon_nom);
        des = Principal.res.getString(R.string.grebas_de_krindaslon_des);
        grebas = new Grebas(nom,des);
        grebasArrayList.add(grebas);

        nom = Principal.res.getString(R.string.grebas_metalicas_nom);
        des = Principal.res.getString(R.string.grebas_metalicas_des);
        grebas = new Grebas(nom,des);
        grebasArrayList.add(grebas);

        coleccionDeGrebas = grebasArrayList;
    }
}
