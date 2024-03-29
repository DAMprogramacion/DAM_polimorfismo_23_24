package teoria.interfacesPreJava8.figurasRegulares;

import teoria.interfacesPreJava8.TipoFigura;

public class Pentagono extends FiguraRegular{
    public Pentagono(double longitudLado) {
        super(TipoFigura.PENTAGONO, longitudLado);
    }

    @Override
    public double calcularArea() {
        return 1.72 * Math.pow(getLongitudLado(), 2);
    }

}
