package teoria.interfacesPreJava8;

public enum TipoFigura {
    TRIANGULO(3), CUADRADO(4), PENTAGONO(5), CIRCULO(0), ELIPSE(0);

    private int numeroLados;

    TipoFigura(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }
}
