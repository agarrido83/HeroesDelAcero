package com.darkgame.heroesdelacero;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.darkgame.heroesdelacero.partida.Genero;
import com.darkgame.heroesdelacero.partida.Raza;
import com.darkgame.heroesdelacero.partida.Reino;

/**
 * Created by Antonio on 25/05/13.
 */
public class CrearPerfil3 extends Activity {
    public static Activity perfil3;

    private Button btnSilvanos;
    private Button btnDeLaNieve;
    private Button btnGyrcaukas;
    private Button btnTernostan;
    private Button btnFlitzgar;
    private Button btnVerinfes;
    private Button btnBerwald;

    private String nombre;
    private Genero genero;
    private Raza raza;
    private Reino reino;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        perfil3 = this;

        Intent i = this.getIntent();
        nombre = i.getStringExtra("nombre");
        genero = (Genero) i.getSerializableExtra("genero");
        raza = (Raza) i.getSerializableExtra("raza");

        switch(raza) {
            case ELFO:
                setContentView(R.layout.crear_perfil_3a);
                btnSilvanos = (Button) findViewById(R.id.btnSilvanos);
                btnSilvanos.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        reino = Reino.SILVANOS;
                        Intent i = new Intent(getApplicationContext(),CrearPerfil4.class);
                        i.putExtra("nombre",nombre);
                        i.putExtra("genero",genero);
                        i.putExtra("raza",raza);
                        i.putExtra("reino",reino);
                        startActivity(i);
                    }
                });
                btnDeLaNieve = (Button) findViewById(R.id.btnDeLaNieve);
                btnDeLaNieve.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        reino = Reino.DE_LA_NIEVE;
                        Intent i = new Intent(getApplicationContext(),CrearPerfil4.class);
                        i.putExtra("nombre",nombre);
                        i.putExtra("genero",genero);
                        i.putExtra("raza",raza);
                        i.putExtra("reino",reino);
                        startActivity(i);
                    }
                });
                break;
            case ENANO:
                setContentView(R.layout.crear_perfil_3b);
                btnGyrcaukas = (Button) findViewById(R.id.btnGyrcaukas);
                btnGyrcaukas.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        reino = Reino.GYRCAUKAS;
                        Intent i = new Intent(getApplicationContext(),CrearPerfil4.class);
                        i.putExtra("nombre",nombre);
                        i.putExtra("genero",genero);
                        i.putExtra("raza",raza);
                        i.putExtra("reino",reino);
                        startActivity(i);
                    }
                });
                btnTernostan = (Button) findViewById(R.id.btnTernostan);
                btnTernostan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        reino = Reino.TERNOSTAN;
                        Intent i = new Intent(getApplicationContext(),CrearPerfil4.class);
                        i.putExtra("nombre",nombre);
                        i.putExtra("genero",genero);
                        i.putExtra("raza",raza);
                        i.putExtra("reino",reino);
                        startActivity(i);
                    }
                });
                break;
            case HUMANO:
                setContentView(R.layout.crear_perfil_3c);
                btnFlitzgar = (Button) findViewById(R.id.btnFlitzgar);
                btnFlitzgar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        reino = Reino.FLITZGAR;
                        Intent i = new Intent(getApplicationContext(),CrearPerfil4.class);
                        i.putExtra("nombre",nombre);
                        i.putExtra("genero",genero);
                        i.putExtra("raza",raza);
                        i.putExtra("reino",reino);
                        startActivity(i);
                    }
                });
                btnVerinfes = (Button) findViewById(R.id.btnVerinfes);
                btnVerinfes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        reino = Reino.VERINFES;
                        Intent i = new Intent(getApplicationContext(),CrearPerfil4.class);
                        i.putExtra("nombre",nombre);
                        i.putExtra("genero",genero);
                        i.putExtra("raza",raza);
                        i.putExtra("reino",reino);
                        startActivity(i);
                    }
                });
                btnBerwald = (Button) findViewById(R.id.btnBerwald);
                btnBerwald.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        reino = Reino.BERWALD;
                        Intent i = new Intent(getApplicationContext(),CrearPerfil4.class);
                        i.putExtra("nombre",nombre);
                        i.putExtra("genero",genero);
                        i.putExtra("raza",raza);
                        i.putExtra("reino",reino);
                        startActivity(i);
                    }
                });
                break;
        }
    }
}
