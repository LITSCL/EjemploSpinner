package cl.inacap.ejemplospinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner selectorSpn;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectorSpn = (Spinner)findViewById(R.id.selectorSpn);
        ArrayList<String> listaDias = new ArrayList<>();
        listaDias.add("Lunes");
        listaDias.add("Martes");
        listaDias.add("Miercoles");
        listaDias.add("Jueves");
        listaDias.add("Viernes");
        listaDias.add("Sábado");
        listaDias.add("Domingo");

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, listaDias); //Creación del adaptador (Es similar a un modelo en Swing).
        selectorSpn.setAdapter(adapter); //Al Spinner se le añade el adaptador (Modelo).

        selectorSpn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "Seleccionado: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}