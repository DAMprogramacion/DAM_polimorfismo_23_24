package teoria.interfacesPreJava8.figurasCirculares;

import teoria.interfacesPreJava8.TipoFigura;

public class Circulo extends FiguraCircular{
    public Circulo(double radio) {
        super(TipoFigura.CIRCULO, radio, radio);
    }

    @Override
    public double calcularPerimetro() { //No nos gusta como lo hace el padre
        return 2.0 * PI * getSemieje1() ; //esta tiene menos coste computacional
    }
}
