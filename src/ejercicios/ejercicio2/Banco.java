package ejercicios.ejercicio2;

public interface Banco {
    double DESCUBIERTO = -100;
    double obtenerSaldo();
    void ingresarDinero(double cantidad);
    void retirarDinero(double cantidad);
    private boolean esFactibleRetirada(double cantidad) {
        return obtenerSaldo() - cantidad >= DESCUBIERTO;
    }
    private void mostrarTransaccion(TipoTransaccion tipoTransaccion, double cantidad) {
        StringBuilder builder = new StringBuilder();
        builder.append("Transación: ").append(tipoTransaccion).append('\n');
        builder.append("Cantidad: ").append(cantidad).append("€\n");
        builder.append("Saldo: ").append(obtenerSaldo()).append('\n');
        System.out.println(builder);
    }
    default void ejecutarTransaccion (TipoTransaccion tipoTransaccion, double cantidad) {
        switch (tipoTransaccion) {
            case INGRESO -> {
                ingresarDinero(cantidad);
                mostrarTransaccion(tipoTransaccion, cantidad);
            }
            case RETIRADA -> {
                if (esFactibleRetirada(cantidad)) {
                    retirarDinero(cantidad);
                    mostrarTransaccion(tipoTransaccion, cantidad);
                } else {
                    System.out.println("Saldo insuficiente\n");
                }
            }
            default -> System.out.println("Transacción no permitida");
        }
    }
    static Banco crearCuentaCorriente (double saldoInicial) {
        return new CuentaCorriente(saldoInicial);
    }

}
