package ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Banco banco = Banco.crearCuentaCorriente(100);
        banco.ejecutarTransaccion(TipoTransaccion.INGRESO, 200);
        banco.ejecutarTransaccion(TipoTransaccion.RETIRADA, 500);
        banco.ejecutarTransaccion(TipoTransaccion.RETIRADA, 150);
    }
}
