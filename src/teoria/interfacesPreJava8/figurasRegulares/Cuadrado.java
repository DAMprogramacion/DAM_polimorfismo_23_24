package teoria.interfacesPreJava8.figurasRegulares;

import teoria.interfacesPreJava8.TipoFigura;

public class Cuadrado extends FiguraRegular{
    public Cuadrado(double longitudLado) {
        super(TipoFigura.CUADRADO, longitudLado);
    }

    @Override
    public double calcularArea() {
        return getLongitudLado() * getLongitudLado();
    }
}
