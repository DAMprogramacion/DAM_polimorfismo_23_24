package teoria.interfacesPreJava8.figurasRegulares;

import teoria.interfacesPreJava8.TipoFigura;

public class TrianguloEquilatero extends FiguraRegular{
    public TrianguloEquilatero( double longitudLado) {
        super(TipoFigura.TRIANGULO, longitudLado);
    }

    @Override
    public double calcularArea() {
        return Math.sqrt(3.0) / 4.0 * getLongitudLado() * getLongitudLado();
    }

    @Override
    public String obtenerInformacion() {
        StringBuilder builder =
                new StringBuilder("Nombre de la figura: TRIÁNGULO EQUILATERO").append('\n');
        builder.append("Nº de lados: 3").append('\n');
        builder.append("Perímetro: ").append(String.format("%.2f",calcularPerimetro())).append('\n');
        builder.append("Superficie: ").append(String.format("%.2f",calcularArea())).append('\n');
        return builder.toString();
    }
}
