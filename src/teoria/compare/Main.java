package teoria.compare;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(
                new Persona("pérez", "manuel", LocalDate.of(2000, 10, 2)));
        personas.add(
                new Persona("zamora", "jorge", LocalDate.of(1999, 10, 2)));
        personas.add(
                new Persona("molina", "elisa", LocalDate.of(2000, 10, 2)));
        personas.add(
                new Persona("molina", "macarena", LocalDate.of(2003, 10, 2)));
        personas.add(
                new Persona("pérez", "azucena", LocalDate.of(2002, 10, 2)));
        personas.add(
                new Persona("sánchez", "miguel", LocalDate.of(2005, 10, 2)));
        personas.add(
                new Persona("abolafia", "gabriel", LocalDate.of(2010, 10, 2)));
        System.out.println("=========LISTADO ORIGINAL==============");
        personas.forEach(System.out::println);
        List<String> apellidos = personas.stream()
                .map(Persona::apellido)
                .collect(Collectors.toList());
        System.out.println("=========LISTADO APELLIDOS ORIGINAL==============");
        apellidos.forEach(System.out::println);
        System.out.println("=========LISTADO ORDENADO POR APELLIDOS==============");
        Collections.sort(apellidos);
        apellidos.forEach(System.out::println);
        //ordenamos la lista
        Collections.sort(personas); //se cambia el orden de la lista
        System.out.println("=========LISTADO ORDENADO SEGÚN COMPARABLE DE PERSONA==============");
        personas.forEach(System.out::println);
        System.out.println("===COMPROBANDO ESTADO ACTUAL LISTA===");
        System.out.printf("Persona 0: %S%n", personas.get(0));
        System.out.println("===LISTADO ORDENADO POR APELLIDOS====");
        personas.stream()
                .sorted(Comparator.comparing(Persona::apellido))
                .forEach(System.out::println);
        System.out.println("===LISTADO ORDENADO POR APELLIDOS EN FORMA INVERSA====");
        personas.stream()
                .sorted(Comparator.comparing(Persona::apellido).reversed())
                .forEach(System.out::println);
        System.out.println("===LISTADO ORDENADO POR APELLIDOS EN FORMA INVERSA====");
        System.out.println("===LISTADO ORDENADO POR Y EDAD INVERSA====");
        personas.stream()
                .sorted(Comparator.comparing(Persona::apellido).reversed().thenComparing(Persona::fechaNacimiento))
                .forEach(System.out::println);
    }
}
