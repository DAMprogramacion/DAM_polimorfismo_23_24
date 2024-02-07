package teoria.abstractas;




import java.util.ArrayList;
import java.util.List;

public class MainAbs {
    public static void main(String[] args) {
        List<FiguraRegularAbs> figurasAbs = new ArrayList( List.of(new CuadradoAbs(2.14), new CuadradoAbs(6.3),
                new TrianguloEquilateroAbs(1.1),
                new TrianguloEquilateroAbs(2.6)));

        FiguraRegularAbs figuraRegular = new FiguraRegularAbs(
                TipoFigura.HEXAGONO, 12.2) {
            @Override
            public double calcularArea() {
                return 3.0 * Math.sqrt(3) / 2.0 * Math.pow(getLongitudLado(), 2);
            }
        };
        FiguraRegularAbs cuadrado = new CuadradoAbs(3.3);
        figurasAbs.add(figuraRegular);
        figurasAbs.add(cuadrado);
        mostrarFiguras(figurasAbs);
    }

    private static void mostrarFiguras(List<FiguraRegularAbs> figurasAbs) {
        for (FiguraRegularAbs figuraRegularAbs : figurasAbs){
            System.out.printf("Tipo figura: %S%n", figuraRegularAbs.getTipoFigura());
            System.out.printf("Número lados: %d%n", figuraRegularAbs.getTipoFigura().getNumeroLados());
            System.out.printf("Longitud del lado %.2f%n", figuraRegularAbs.getLongitudLado());
            System.out.printf("Perímetro: %.2f%n", figuraRegularAbs.calcularPerimetro());
            System.out.printf("Superficie: %.2f%n", figuraRegularAbs.calcularArea());
            System.out.println("=======================================");
        }
    }
}
