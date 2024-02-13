package teoria.interfacesJava8y9;

public class TrianguloEquilatero extends FiguraRegular{
    public TrianguloEquilatero(double longitudLado) {
        super("Triángulo Equilatero", 3, longitudLado);
    }

    @Override
    public double calcularArea() {
        return Math.sqrt(3.0) / 4.0 * longitudLado() * longitudLado();
    }
}
