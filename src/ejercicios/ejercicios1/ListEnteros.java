package ejercicios.ejercicios1;

import java.util.Collections;
import java.util.List;

public class ListEnteros implements Estadistica{
    private List<Integer> datos;

    public ListEnteros(List<Integer> datos) {
        this.datos = datos;
        Collections.sort(this.datos);
    }

    public List<Integer> getDatos() {
        return datos;
    }

    @Override
    public int obtenerNumeroValores() {
        return datos.size();
    }

    @Override
    public double obtenerValorMinimo() {
        return datos.get(0);
    }

    @Override
    public double obtenerValorMaximo() {
        return datos.get(datos.size() - 1);
    }

    @Override
    public double calcularSuma() {
        return datos.stream()
                .reduce( 0, (x, y) -> x + y)
                .longValue();
    }

   /* @Override
    public double calcularValorMedio() {
        return calcularSuma() / obtenerNumeroValores();
    }*/

    @Override
    public double calcularDesviacionTipica() {
        double valorMedio = calcularValorMedio();
        double suma = 0.0;
        for (double dato : datos)
            suma += Math.pow(dato - valorMedio , 2);
        return Math.sqrt(suma / obtenerNumeroValores());
    }
}
