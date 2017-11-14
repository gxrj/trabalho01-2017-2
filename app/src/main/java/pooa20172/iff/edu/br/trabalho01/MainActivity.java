package pooa20172.iff.edu.br.trabalho01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnCalcular, btnLimpar;
    private EditText nome, salarioHora, horasMes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnLimpar = (Button) findViewById(R.id.btnLimpar);
        nome = (EditText) findViewById(R.id.nome);
        salarioHora = (EditText) findViewById(R.id.salarioHora);
        horasMes = (EditText) findViewById(R.id.horasMes );

        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent segundaTela = new Intent(MainActivity.this, Resultado.class);
                Bundle dadosEntrada = new Bundle();
                dadosEntrada.putString("nome", nome.getText().toString());
                dadosEntrada.putFloat("salarioHora", Float.parseFloat(String.valueOf(salarioHora.getText())));
                dadosEntrada.putInt("horasMes", Integer.parseInt(String.valueOf(horasMes.getText())));


                segundaTela.putExtras(dadosEntrada);
                startActivity(segundaTela);
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                nome.setText("");
                salarioHora.setText("");
                horasMes.setText("");
            }
        });
    }
}
