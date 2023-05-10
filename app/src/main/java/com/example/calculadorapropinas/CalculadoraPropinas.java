package com.example.calculadorapropinas;

public class CalculadoraPropinas {
    private double montoCuenta;
    private double porcentajePropina;

    public void setMontoCuenta(double montoCuenta) {
        this.montoCuenta = montoCuenta;

    }
    public void setPorcentajePropina(double porcentajePropina) {
        this.porcentajePropina = porcentajePropina;
    }
    public double calcularTotalPagar() {
        double propina = montoCuenta * porcentajePropina / 100;
        return montoCuenta + propina;
    }
}
