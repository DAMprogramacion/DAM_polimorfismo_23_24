package ejercicios.ejercicio1;

import java.util.Arrays;

public class ArrayReales implements Estadistica {
    private double[] datos;

    public ArrayReales(double[] datos) {
        this.datos = datos;
        Arrays.sort(this.datos);
    }

    public double[] getDatos() {
        return datos;
    }

    @Override
    public int obtenerNumeroValores() {
        return datos.length;
    }

    @Override
    public double obtenerValorMinimo() {
        return datos[0];
    }

    @Override
    public double obtenerValorMaximo() {
        return datos[datos.length - 1];
    }

    @Override
    public double calcularSuma() {
        /*double suma = 0.0;
        for (double dato : datos)
            suma += dato;
        return suma;*/
        return Arrays.stream(datos)
                .sum();
    }

  /*  @Override
    public double calcularValorMedio() {
      *//*  return Arrays.stream(datos)
                .average()
                .getAsDouble();*//*
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
