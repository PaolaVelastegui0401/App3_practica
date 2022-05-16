package fisei.uta.edu.ec.app3_practica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView bienv;
    private EditText nota1;
    private EditText nota2;
    private TextView promedio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bienv = (TextView)findViewById(R.id.txt_bienv);
        nota1 = (EditText)findViewById(R.id.txt_nota1);
        nota2 = (EditText)findViewById(R.id.txt_nota2);
        promedio = (TextView)findViewById(R.id.txt_total);

        String nombre = getIntent().getStringExtra("nombre");
        bienv.setText("Hola "+nombre);

    }
    public void Calcular(View view){
        String n1 = nota1.getText().toString();
        String n2 = nota2.getText().toString();
        int not1 = Integer.parseInt(n1);
        int not2 = Integer.parseInt(n2);
        int promed = (not1 + not2)/2;
        String res = String.valueOf(promed);
        promedio.setText(res);
    }

    public void Salir(View view){
        Intent salir = new Intent(this, MainActivity.class );
        String promR = promedio.getText().toString();
        salir.putExtra("nota", promR);
        startActivity(salir);
    }

    public void Siguiente(View view){
        Intent siguiente = new Intent(this, MainActivity3.class );
        String nom = bienv.getText().toString();
        String prom = promedio.getText().toString();

        siguiente.putExtra("nombre3", nom);
        siguiente.putExtra("np1",prom);
        startActivity(siguiente);
    }

}