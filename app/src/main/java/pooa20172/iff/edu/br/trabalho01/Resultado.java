package pooa20172.iff.edu.br.trabalho01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    String nome;
    Float salarioHora, bruto;
    int horasMes;
    private TextView saida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent intent = getIntent();
        Bundle entradaDados = intent.getExtras();
        saida = (TextView) findViewById(R.id.saida);

        nome = entradaDados.getString("nome");
        salarioHora = entradaDados.getFloat("salarioHora");
        horasMes = entradaDados.getInt("horasMes");

        bruto = salarioHora*horasMes;
        saida.setText("+Salario Bruto: R$ "+bruto+"\n-IR(11%): R$ "+bruto*0.11+"\n-INSS(8%): R$ "+bruto*0.08+"\n-Sindicato(5%): R$ "+bruto*0.05+"\n=Salario Liquido: R$ "+(bruto -bruto*0.11 - bruto*0.08 - bruto*0.05)+"\n");
    }
}
