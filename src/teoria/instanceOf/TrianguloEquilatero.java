package teoria.instanceOf;

public class TrianguloEquilatero extends FiguraRegular {
    public TrianguloEquilatero(double longitudLado) {
        super(3, longitudLado);
    }
    public double calcularArea(){
        return Math.sqrt(3) / 4.0 * Math.pow(getLongitudLado(), 2);
    }
}
