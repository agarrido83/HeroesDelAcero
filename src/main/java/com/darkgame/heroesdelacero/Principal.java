package com.darkgame.heroesdelacero;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.darkgame.heroesdelacero.inventario.Inventario;
import com.darkgame.heroesdelacero.partida.Partida;

/**
 * Created by Antonio on 24/05/13.
 */
public class Principal extends Activity {
    private boolean primeraVez;
    public static Inventario inventario;
    public static Partida partida;

    public Principal() {
        super();
        primeraVez = true;
        inventario = new Inventario(getApplicationContext());
        inventario.cargaInventario();
        partida = new Partida();
        partida.cargaPartida();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
    }

    @Override
    public void onResume() {
        super.onResume();
        if (partida.getPersonaje() == null ) {
            if (primeraVez) {
                primeraVez = false;
                Intent intent = new Intent(getApplicationContext(), CrearPerfil1.class);
                startActivity(intent);
            } else {
                finish();
            }
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),partida.getPersonaje().toString(),Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
