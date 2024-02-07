package teoria.abstractas;

public class CuadradoAbs extends FiguraRegularAbs{
    public CuadradoAbs(double longitudLado) {
        super(TipoFigura.CUADRADO, longitudLado);
    }

    @Override
    public double calcularArea() {
        return getLongitudLado() * getLongitudLado();
    }
}
