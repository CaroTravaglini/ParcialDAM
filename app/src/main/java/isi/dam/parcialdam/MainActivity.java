package isi.dam.parcialdam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button botonGuardar, botonMostrar;
    RadioButton aprobado;
    RadioButton desaprobado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonGuardar = findViewById(R.id.btnGuardar);
        botonMostrar = findViewById(R.id.btnMostrar);
        aprobado = findViewById(R.id.aprobado);
        desaprobado = findViewById(R.id.desaprobado);

        guardar (idempleado, nombre, aprobado.isChecked(), desaprobado.isChecked());

        botonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        botonMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
    public void guardar(String IdPorfesor, EditText nombre) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
                "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String string_name = nombre.getText().toString();
        ContentValues registro = new ContentValues();
        Profesor profesor = new Profesor();
        profesor.put("idprofesor", IdPorfesor);
        profesor.put("nombre", string_name);
        bd.insert("profesor", null, profesor);
        bd.close();
        Toast.makeText(this, "Datos del profesor cargados", Toast.LENGTH_SHORT).show();
    }

}