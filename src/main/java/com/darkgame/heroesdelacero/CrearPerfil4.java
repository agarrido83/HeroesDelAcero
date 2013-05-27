package com.darkgame.heroesdelacero;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import com.darkgame.heroesdelacero.partida.*;

/**
 * Created by Antonio on 26/05/13.
 */
public class CrearPerfil4 extends Activity {

    private Spinner spProfesion;
    private ArrayAdapter adapter;
    private Button btnAceptar;

    private String nombre;
    private Genero genero;
    private Raza raza;
    private Reino reino;
    private Profesion profesion;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_perfil_4);

        Intent i = this.getIntent();
        nombre = i.getStringExtra("nombre");
        genero = (Genero) i.getSerializableExtra("genero");
        raza = (Raza) i.getSerializableExtra("raza");
        reino = (Reino) i.getSerializableExtra("reino");

        spProfesion = (Spinner) findViewById(R.id.spProfesion);
        adapter = ArrayAdapter.createFromResource(this,R.array.profesiones,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spProfesion.setAdapter(adapter);

        spProfesion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        profesion = Profesion.HECHICERO;
                        break;
                    case 1:
                        profesion = Profesion.CAZADOR;
                        break;
                    case 2:
                        profesion = Profesion.GUERRERO;
                        break;
                    case 3:
                        profesion = Profesion.LADRON;
                        break;
                    case 4:
                        profesion = Profesion.JUGLAR;
                        break;
                    case 5:
                        profesion = Profesion.MONJE_CABALLERO_DE_SAGRAST;
                        break;
                    case 6:
                        profesion = Profesion.ALQUIMISTA;
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnAceptar = (Button) findViewById(R.id.btnAceptar);
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Principal.partida.creaPersonaje(nombre,genero,raza,reino,profesion);
                CrearPerfil3.perfil3.finish();
                CrearPerfil2.perfil2.finish();
                CrearPerfil1.perfil1.finish();
                finish();
            }
        });
    }
}
