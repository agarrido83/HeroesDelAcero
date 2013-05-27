package com.darkgame.heroesdelacero;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.darkgame.heroesdelacero.partida.Genero;

/**
 * Created by Antonio on 24/05/13.
 */
public class CrearPerfil1 extends Activity {
    public static Activity perfil1;

    private EditText txtNombre;
    private RadioGroup rgbtnGenero;
    private Button btnAceptar;

    private String nombre;
    private Genero genero;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_perfil_1);
        perfil1 = this;

        txtNombre = (EditText)findViewById(R.id.txtNombre);
        rgbtnGenero = (RadioGroup)findViewById(R.id.rgbtnGenero);
        btnAceptar = (Button)findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre = txtNombre.getText().toString();
                if (nombre.isEmpty()) {
                    Toast toast = Toast.makeText(getApplicationContext(),"No has escrito un nombre.",Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    switch(rgbtnGenero.getCheckedRadioButtonId()) {
                        case R.id.rbtnHombre:
                            genero = Genero.HOMBRE;
                            break;
                        case R.id.rbtnMujer:
                            genero = Genero.MUJER;
                            break;
                    }
                    Intent i = new Intent(getApplicationContext(),CrearPerfil2.class);
                    i.putExtra("nombre",nombre);
                    i.putExtra("genero",genero);
                    startActivity(i);
                }
            }
        });
    }
}
