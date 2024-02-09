package teoria.interfacesPreJava8.figurasCirculares;

import teoria.interfacesPreJava8.TipoFigura;

public class Elipse extends FiguraCircular{
    public Elipse(double semieje1, double semieje2) {
        super(TipoFigura.ELIPSE, semieje1, semieje2);
    }
    public double getSemiejeMayor () {
        return Math.max(getSemieje1(), getSemieje2());
    }
    public double getSemiejeMenor () {
        return Math.min(getSemieje1(), getSemieje2());
    }
}
