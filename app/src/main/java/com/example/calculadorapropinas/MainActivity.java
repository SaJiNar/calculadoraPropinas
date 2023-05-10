package com.example.calculadorapropinas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private EditText etMontoCuenta;
    private Spinner spPorcentajePropina;
    private TextView tvTotalPagar;
    private CalculadoraPropinas calculadoraPropinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMontoCuenta = findViewById(R.id.et_monto_cuenta);
        spPorcentajePropina = findViewById(R.id.sp_porcentaje_propina);
        tvTotalPagar = findViewById(R.id.tv_total_pagar);
        Button btnCalcularPropina = findViewById(R.id.btn_calcular_propina);

        calculadoraPropinas = new CalculadoraPropinas();

        btnCalcularPropina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double montoCuenta = Double.parseDouble(etMontoCuenta.getText().toString());
                double porcentajePropina = Double.parseDouble(spPorcentajePropina.getSelectedItem().toString());

                calculadoraPropinas.setMontoCuenta(montoCuenta);
                calculadoraPropinas.setPorcentajePropina(porcentajePropina);

                double totalPagar = calculadoraPropinas.calcularTotalPagar();
                tvTotalPagar.setText(String.format(Locale.getDefault(),"Total a pagar: %.2f", totalPagar));
            }
        });
    }
}
