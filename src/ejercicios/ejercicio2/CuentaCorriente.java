package ejercicios.ejercicio2;

public class CuentaCorriente implements Banco{
    private double saldo;

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double obtenerSaldo() {
        return saldo;
    }

    @Override
    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    @Override
    public void retirarDinero(double cantidad) {
        saldo -= cantidad;
    }
}










