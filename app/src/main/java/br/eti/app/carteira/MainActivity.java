package br.eti.app.carteira;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner tipoDespesa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tipo_despesa,
                android.R.layout.simple_spinner_item);
        tipoDespesa = (Spinner) findViewById(R.id.tipo_despesa);
        tipoDespesa.setAdapter(adapter);
    }
}
