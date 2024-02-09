package teoria.interfacesPreJava8.triangulosIrregulares;

public class TrianguloRectangulo extends TrianguloIrregular {

    public TrianguloRectangulo( double cateto1, double cateto2) {
        super(TipoTrianguloIrregular.RECTANGULO, cateto1, cateto2, Math.hypot(cateto1, cateto2));
    }

    @Override
    public double calcularArea() {  //No nos fiamos del método del padre
        return getLado1() * getLado2() / 2.0;
    }
}
