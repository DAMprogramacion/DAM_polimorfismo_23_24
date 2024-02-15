package ejercicios.ejercicio1;

public interface Estadistica {
    int obtenerNumeroValores(); //número de elementos de una colección
    double obtenerValorMinimo(); //valor mı́nimo de una colección
    double obtenerValorMaximo(); //valor máximo de una colección
    double calcularSuma(); //suma de los valores de una colección
    //double calcularValorMedio(); //valor medio de de una colección
    double calcularDesviacionTipica();
    default void mostrarDatos() {
        System.out.println("==========================================");
        System.out.printf("Nº datos: %d%n", obtenerNumeroValores());
        System.out.printf("Valor mínimo %.2f%n", obtenerValorMinimo());
        System.out.printf("Valor máximo %.2f%n", obtenerValorMaximo());
        System.out.printf("Suma de valores %.2f%n", calcularSuma());
        System.out.printf("Valor medio %.2f%n", calcularValorMedio());
        System.out.printf("Desviación típica %.2f%n", calcularDesviacionTipica());
        System.out.println("==========================================");
    }
    default double calcularValorMedio() {
        return calcularSuma() / obtenerNumeroValores();
    }
}
