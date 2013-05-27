package com.darkgame.heroesdelacero;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.darkgame.heroesdelacero.partida.Genero;
import com.darkgame.heroesdelacero.partida.Raza;

/**
 * Created by Antonio on 25/05/13.
 */
public class CrearPerfil2 extends Activity {
    public static Activity perfil2;

    private String nombre;
    private Genero genero;
    private Raza raza;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_perfil_2);
        perfil2 = this;

        Intent i = this.getIntent();
        nombre = i.getStringExtra("nombre");
        genero = (Genero)i.getSerializableExtra("genero");

        Button btnElfo = (Button)findViewById(R.id.btnElfo);
        btnElfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                raza = Raza.ELFO;
                Intent i = new Intent(getApplicationContext(),CrearPerfil3.class);
                i.putExtra("nombre",nombre);
                i.putExtra("genero",genero);
                i.putExtra("raza",raza);
                startActivity(i);
            }
        });

        Button btnEnano = (Button)findViewById(R.id.btnEnano);
        btnEnano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                raza = Raza.ENANO;
                Intent i = new Intent(getApplicationContext(),CrearPerfil3.class);
                i.putExtra("nombre",nombre);
                i.putExtra("genero",genero);
                i.putExtra("raza",raza);
                startActivity(i);
            }
        });

        Button btnHumano = (Button)findViewById(R.id.btnHumano);
        btnHumano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                raza = Raza.HUMANO;
                Intent i = new Intent(getApplicationContext(),CrearPerfil3.class);
                i.putExtra("nombre",nombre);
                i.putExtra("genero",genero);
                i.putExtra("raza",raza);
                startActivity(i);
            }
        });
    }
}
