package teoria.interfacesPreJava8.figurasCirculares;

import teoria.interfacesPreJava8.Figura;
import teoria.interfacesPreJava8.TipoFigura;

public class FiguraCircular implements Figura {
    private final TipoFigura tipoFigura;
    private double semieje1;
    private double semieje2;

    public FiguraCircular(TipoFigura tipoFigura, double semieje1, double semieje2) {
        this.tipoFigura = tipoFigura;
        this.semieje1 = semieje1;
        this.semieje2 = semieje2;
    }

    public TipoFigura getTipoFigura() {
        return tipoFigura;
    }

    public final double getSemieje1() {
        return semieje1;
    }

    public final double getSemieje2() {
        return semieje2;
    }

    public final void setSemieje1(double semieje1) {
        this.semieje1 = semieje1;
    }

    public final void setSemieje2(double semieje2) {
        this.semieje2 = semieje2;
    }

    @Override
    public double calcularPerimetro() {
        return PI * Math.sqrt((Math.pow(semieje1, 2) + Math.pow(semieje2, 2)) / 2.0);
    }

    @Override
    public double calcularArea() {
        return PI * semieje1 * semieje2;
    }

    @Override
    public String obtenerInformacion() {
        StringBuilder builder =
                new StringBuilder("Tipo figura: ").append(tipoFigura.toString()).append('\n');
        if (semieje1 == semieje2)
            builder.append("radio: ").append(semieje1).append('\n');
        else {
            double semiejeMayor = Math.max(semieje1, semieje2);
            double semiejeMenor = Math.min(semieje1, semieje2);
            builder.append("semieje menor: ").append(semiejeMenor).append('\n');
            builder.append("semieje mayor: ").append(semiejeMayor).append('\n');
        }
        builder.append("Perímetro: ").append(String.format("%.2f",calcularPerimetro())).append('\n');
        builder.append("Área: ").append(String.format("%.2f",calcularArea())).append('\n');
        return builder.toString();
    }
}
