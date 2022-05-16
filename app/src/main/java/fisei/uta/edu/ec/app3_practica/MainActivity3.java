package fisei.uta.edu.ec.app3_practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView resumen;
    private EditText n1;
    private EditText n2;
    private TextView notafinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        resumen = (TextView)findViewById(R.id.txt_Resumen);
        n1 = (EditText)findViewById(R.id.txt_notaP1);
        n2 = (EditText)findViewById(R.id.txt_notaP2);
        notafinal=(TextView)findViewById(R.id.txt_final);
        String nombre = getIntent().getStringExtra("nombre3");
        resumen.setText("Resumen "+nombre);

        String no2 = getIntent().getStringExtra("np1");
        n1.setText(no2);
        //comentai


    }

    public void Calcular(View view){
        String nota1 = n1.getText().toString();
        String nota2 = n2.getText().toString();
        int not1 = Integer.parseInt(nota1);
        int not2 = Integer.parseInt(nota2);
        int promed = (not1 + not2)/2;
        String res = String.valueOf(promed);
        notafinal.setText(res);
    }
}