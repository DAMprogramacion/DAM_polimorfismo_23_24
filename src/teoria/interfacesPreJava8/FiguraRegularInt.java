package teoria.interfacesPreJava8;

public abstract class FiguraRegularInt implements Figura{
    //atributos
    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public abstract double calcularArea();

    @Override
    public String obtenerInformacion() {
        return null;
    }
}
