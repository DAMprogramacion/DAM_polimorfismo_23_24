package teoria.interfacesJava8y9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface Figura {
    double calcularPerimetro();
    double calcularArea();
    default String mostrarPerimetroYArea() {
        return String.format(
                "ÁREA: %.2f%nPERÍMETRO: %.2f", calcularArea(), calcularPerimetro());
    }
    default void mostrarEnConsolaAreaYPerimetro() {
        System.out.println(mostrarPerimetroYArea());
    }
    static Optional<FiguraRegular> getFiguraRegular(double longitudLado, String tipoFigura) {
        switch (tipoFigura) {
            case "Cuadrado" ->  Optional.of(new Cuadrado(longitudLado));
            case "TrianguloEquilatero" -> Optional.of(new TrianguloEquilatero(longitudLado));
        }
        return Optional.empty();
    }
    static List<FiguraRegular> getFigurasPorTipo(List<FiguraRegular> figuras, String tipoFigura) {
        /*List<Figura> figurasSegunTipo = new ArrayList<>();
        for (FiguraRegular figura : figuras)
            if (figura.nombreFigura().equals(tipoFigura))
                figurasSegunTipo.add(figura);
        return figurasSegunTipo;*/
        return  figuras.stream()
                .filter(figuraRegular -> figuraRegular.nombreFigura().equals(tipoFigura))
                .collect(Collectors.toList());
    }












}
