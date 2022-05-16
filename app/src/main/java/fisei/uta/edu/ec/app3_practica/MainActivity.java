package fisei.uta.edu.ec.app3_practica;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private EditText password;
    private TextView hist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (EditText)findViewById(R.id.txt_nombre);
        password = (EditText)findViewById(R.id.txt_password);
        hist = (TextView)findViewById(R.id.txt_Historial);
        String nota = getIntent().getStringExtra("nota");
        hist.setText(nota);
    }
    public void Ingresar(View view){
        Intent siguiente = new Intent(this, MainActivity2.class );
        String nom = nombre.getText().toString();
        String pass = password.getText().toString();
        siguiente.putExtra("nombre", nom);
        if (nom.length()==0){
            Toast.makeText(this,"Ingresar un nombre",Toast.LENGTH_LONG).show();
        }
        if (pass.length()==0){
            Toast.makeText(this,"Ingresar una contraseña",Toast.LENGTH_LONG).show();
        }
        if(nom.length()!= 0 && pass.length()!=0){
            Toast.makeText(this,"Ingresando",Toast.LENGTH_LONG).show();
            startActivity(siguiente);
        }



    }
}