package teoria.interfacesPreJava8.figurasRegulares;


import teoria.interfacesPreJava8.Figura;
import teoria.interfacesPreJava8.TipoFigura;

public abstract class FiguraRegular implements Figura {
    private final TipoFigura tipoFiguraPoligonal;
    private double longitudLado;

    public FiguraRegular(TipoFigura tipoFiguraPoligonal, double longitudLado) {
        this.tipoFiguraPoligonal = tipoFiguraPoligonal;
        this.longitudLado = longitudLado;
    }

    public final TipoFigura getTipoFiguraPoligonal() {
        return tipoFiguraPoligonal;
    }

    public final double getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }

    @Override
    public double calcularPerimetro() {
        return tipoFiguraPoligonal.getNumeroLados() * longitudLado;
    }

    @Override
    public abstract double calcularArea();

    @Override
    public String obtenerInformacion() {
        StringBuilder builder =
                new StringBuilder("Nombre de la figura: ").append(tipoFiguraPoligonal).append('\n');
        builder.append("Nº de lados: ").append(tipoFiguraPoligonal.getNumeroLados()).append('\n');
        builder.append("Perímetro: ").append(String.format("%.2f",calcularPerimetro())).append('\n');
        builder.append("Superficie: ").append(String.format("%.2f",calcularArea())).append('\n');
        return builder.toString();
    }
}
