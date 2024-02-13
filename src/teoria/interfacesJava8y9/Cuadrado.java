package teoria.interfacesJava8y9;

public class Cuadrado extends FiguraRegular{

    public Cuadrado( double longitudLado) {
        super("Cuadrado", 4, longitudLado);
    }

    @Override
    public double calcularArea() {
        return longitudLado() * longitudLado();
    }
}
