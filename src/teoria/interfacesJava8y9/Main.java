package teoria.interfacesJava8y9;



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FiguraRegular> figuras = new ArrayList<>();
        figuras.add(Figura.getFiguraRegular(2.1, "Cuadrado").get());
        figuras.add(Figura.getFiguraRegular(3.2, "Cuadrado").get());
        figuras.add(Figura.getFiguraRegular(2.1, "TrianguloEquilatero").get());
        figuras.add(Figura.getFiguraRegular(2.2, "TrianguloEquilatero").get());
        List<FiguraRegular> triangulos = Figura.getFigurasPorTipo(figuras, "Triángulo Equilatero");
        triangulos.stream()
                .forEach(System.out::println);

    }
}
