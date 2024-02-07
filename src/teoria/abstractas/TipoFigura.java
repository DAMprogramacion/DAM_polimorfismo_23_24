package teoria.abstractas;

public enum TipoFigura {
    TRIANGULO_EQUILATERO(3), CUADRADO(4), PENTAGONO(5), HEXAGONO(6);
    private int numeroLados;

    TipoFigura(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

}
