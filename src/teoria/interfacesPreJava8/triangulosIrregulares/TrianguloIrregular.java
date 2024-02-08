package teoria.interfacesPreJava8.triangulosIrregulares;

import teoria.interfacesPreJava8.Figura;
import teoria.interfacesPreJava8.TipoFigura;

public class TrianguloIrregular implements Figura {
    private final TipoFigura  TIPO_FIGURA = TipoFigura.TRIANGULO;
    private TipoTrianguloIrregular tipoTrianguloIrregular;
    private double lado1; //menor lado o cateto1, lado igual en isosceles
    private double lado2; //lado intermedio o cateto2, lado igual en isosceles
    private double lado3; //mayor lado o hipotenusa

    public TrianguloIrregular(TipoTrianguloIrregular tipoTrianguloIrregular,
                              double lado1, double lado2, double lado3) {
        this.tipoTrianguloIrregular = tipoTrianguloIrregular;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public final TipoFigura getTIPO_FIGURA() {
        return TIPO_FIGURA;
    }

    public final TipoTrianguloIrregular getTipoTrianguloIrregular() {
        return tipoTrianguloIrregular;
    }

    public final double getLado1() {
        return lado1;
    }

    public final double getLado2() {
        return lado2;
    }

    public final double getLado3() {
        return lado3;
    }

    public final void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public final void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public final void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public String obtenerInformacion() {
        return null;
    }
}
