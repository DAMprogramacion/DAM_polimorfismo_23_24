package ejercicios.ejercicios1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        //trabajando con Array
        double[] datosDouble = new Random()
                .doubles(0,350)
                .limit(10)
                .toArray();
        Estadistica arrayReales = new ArrayReales(datosDouble);
        arrayReales.mostrarDatos();
        //trabajando con List
        int[] datoIntArr = new Random()
                .ints(0, 350)
                .limit(10)
                .toArray();
        List<Integer> datosInt = Arrays.stream(datoIntArr)
                .boxed()
                .collect(Collectors.toList());
        Estadistica listEnteros = new ListEnteros(datosInt);
        listEnteros.mostrarDatos();
    }
}
