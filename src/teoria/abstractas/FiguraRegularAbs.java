package teoria.abstractas;

public abstract class FiguraRegularAbs {
    private TipoFigura tipoFigura;
    private double longitudLado;

    public FiguraRegularAbs(TipoFigura tipoFigura, double longitudLado) {
        this.tipoFigura = tipoFigura;
        this.longitudLado = longitudLado;
    }

    public double getLongitudLado() {
        return longitudLado;
    }

    public TipoFigura getTipoFigura() {
        return tipoFigura;
    }

    public double calcularPerimetro() {
        return longitudLado * tipoFigura.getNumeroLados();
    }
    public abstract double calcularArea();
}















