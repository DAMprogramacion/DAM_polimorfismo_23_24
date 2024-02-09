package teoria.interfacesJava8y9;

public interface Figura {
    double calcularPerimetro();
    double calcularArea();
    default String mostrarPerimetroYArea() {
        return String.format(
                "ÁREA: %.2f%nPERÍMETRO: %.2f", calcularArea(), calcularPerimetro());
    }
    default void mostrarEnConsolaAreaYPerimetro() {
        System.out.println(mostrarPerimetroYArea());
    }
}
