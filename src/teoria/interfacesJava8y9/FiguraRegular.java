package teoria.interfacesJava8y9;

public abstract class FiguraRegular implements Figura {
    private final String nombreFigura;
    private int numeroLados;
    private double longitudLado;

    public FiguraRegular(String nombreFigura, int numeroLados, double longitudLado) {
        this.nombreFigura = nombreFigura;
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }

    public final String nombreFigura() {
        return nombreFigura;
    }

    public final int numeroLados() {
        return numeroLados;
    }

    public final double longitudLado() {
        return longitudLado;
    }

    public final void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public final void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("FIGURA: ").append(nombreFigura()).append('\n');
        builder.append("Nº LADOS: ").append(numeroLados).append(", ").append(longitudLado).append("cm").append('\n');
        builder.append(mostrarPerimetroYArea()).append('\n');
        return builder.toString();
    }

    @Override
    public double calcularPerimetro() {
        return numeroLados * longitudLado;
    }




}
