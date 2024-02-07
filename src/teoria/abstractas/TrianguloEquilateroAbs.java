package teoria.abstractas;

public class TrianguloEquilateroAbs extends FiguraRegularAbs {
    public TrianguloEquilateroAbs(double longitudLado) {
        super(TipoFigura.TRIANGULO_EQUILATERO, longitudLado);
    }

    @Override
    public double calcularArea() {
        return Math.sqrt(3) / 4.0 * Math.pow(getLongitudLado(), 2);
    }
}
