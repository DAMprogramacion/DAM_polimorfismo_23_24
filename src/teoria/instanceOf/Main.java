package teoria.instanceOf;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FiguraRegular> figuras = List.of(new Cuadrado(2.14), new Cuadrado(6.3),
                new TrianguloEquilatero(1.1), new TrianguloEquilatero(2.6));
        mostrarDatosFiguras(figuras);
    }

    private static void mostrarDatosFiguras(List<FiguraRegular> figuras) {
        //figuras.forEach(System.out::println);
        for (FiguraRegular figura : figuras) {
            System.out.printf("Tipo figura: %S%n", figura.getClass());
            System.out.printf("Número lados: %d%n", figura.getNumeroLados());
            System.out.printf("Longitud del lado %.2f%n", figura.getLongitudLado());
            System.out.printf("Perímetro: %.2f%n", figura.calcularPerimetro());
            if (figura instanceof Cuadrado) {
                Cuadrado cuadrado = (Cuadrado) figura;
                System.out.printf("Superficie: %.2f%n", cuadrado.calcularArea());
            }
            else if (figura instanceof TrianguloEquilatero) {
                TrianguloEquilatero trianguloEquilatero = (TrianguloEquilatero) figura;
                System.out.printf("Superficie: %.2f%n", trianguloEquilatero.calcularArea());
            }
            System.out.println("=======================================");
        }
    }
}
