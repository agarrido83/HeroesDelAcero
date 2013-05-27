package com.darkgame.heroesdelacero.inventario;

import android.content.res.Resources;
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
        //cargaPetos();
        //cargaBrazales();
        //cargaGrebas();
    }

    private void cargaCascos() {
        ArrayList<Casco> cascoArrayList = new ArrayList<Casco>();

        Casco casco;
        String desc = Inventario.res.getString(R.string.casco_de_metal);
        /*casco = new Casco("Casco de metal",res.getString(R.string.casco_de_metal));
        cascoArrayList.add(casco);
        casco = new Casco("Casco de metal reforzado",res.getString(R.string.casco_de_metal_reforzado));
        cascoArrayList.add(casco);
        casco = new Casco("Casco élfico de Krindaslon",res.getString(R.string.casco_elfico_de_krindaslon));
        cascoArrayList.add(casco);*/

        coleccionDeCascos = cascoArrayList;
    }

    private void cargaPetos() {
        ArrayList<Peto> petoArrayList = new ArrayList<Peto>();

        Peto peto;
        peto = new Peto("Peto de cuero",Inventario.res.getString(R.string.peto_de_cuero));
        petoArrayList.add(peto);
        peto = new Peto("Peto de cuero élfico",Inventario.res.getString(R.string.peto_de_cuero_elfico));
        petoArrayList.add(peto);
        peto = new Peto("Peto de cuero enano",Inventario.res.getString(R.string.peto_de_cuero_enano));
        petoArrayList.add(peto);
        peto = new Peto("Peto de cuero endurecido",Inventario.res.getString(R.string.peto_de_cuero_endurecido_de_balkaar));
        petoArrayList.add(peto);
        peto = new Peto("Cota de malla éfica",Inventario.res.getString(R.string.cota_de_malla_elfica));
        petoArrayList.add(peto);

        coleccionDePetos = petoArrayList;
    }

    private void cargaBrazales() {
        ArrayList<Brazales> brazalesArrayList = new ArrayList<Brazales>();

        Brazales brazales;
        brazales = new Brazales("Brazales de cuero",Inventario.res.getString(R.string.brazales_de_cuero));
        brazalesArrayList.add(brazales);
        brazales = new Brazales("Brazales de cuero reforzado",Inventario.res.getString(R.string.brazales_de_cuero_reforzado));
        brazalesArrayList.add(brazales);
        brazales = new Brazales("Brazales de Krindaslon",Inventario.res.getString(R.string.brazales_de_krindaslon));
        brazalesArrayList.add(brazales);

        coleccionDeBrazales = brazalesArrayList;
    }

    private void cargaGrebas() {
        ArrayList<Grebas> grebasArrayList = new ArrayList<Grebas>();

        Grebas grebas;
        grebas = new Grebas("Grebas de cuero",Inventario.res.getString(R.string.grebas_de_cuero));
        grebasArrayList.add(grebas);
        grebas = new Grebas("Grebas de cuero enano",Inventario.res.getString(R.string.grebas_de_cuero_enano));
        grebasArrayList.add(grebas);
        grebas = new Grebas("Grebas de cuero endurecido",Inventario.res.getString(R.string.grebas_de_cuero_endurecido));
        grebasArrayList.add(grebas);
        grebas = new Grebas("Grebas de Krindaslon",Inventario.res.getString(R.string.grebas_de_krindaslon));
        grebasArrayList.add(grebas);
        grebas = new Grebas("Grebas_metalicas",Inventario.res.getString(R.string.grebas_metalicas));
        grebasArrayList.add(grebas);

        coleccionDeGrebas = grebasArrayList;
    }
}
