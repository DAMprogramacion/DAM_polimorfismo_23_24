package teoria.interfacesPreJava8;

import teoria.interfacesPreJava8.figurasCirculares.Circulo;
import teoria.interfacesPreJava8.figurasCirculares.Elipse;
import teoria.interfacesPreJava8.figurasCirculares.FiguraCircular;
import teoria.interfacesPreJava8.figurasRegulares.Cuadrado;
import teoria.interfacesPreJava8.figurasRegulares.FiguraRegular;
import teoria.interfacesPreJava8.figurasRegulares.Pentagono;
import teoria.interfacesPreJava8.figurasRegulares.TrianguloEquilatero;
import teoria.interfacesPreJava8.triangulosIrregulares.TrianguloEscaleno;
import teoria.interfacesPreJava8.triangulosIrregulares.TrianguloIrregular;
import teoria.interfacesPreJava8.triangulosIrregulares.TrianguloIsosceles;
import teoria.interfacesPreJava8.triangulosIrregulares.TrianguloRectangulo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //NO SE PUEDE INSTANCIAR UN OBJETO DE UNA CLASE ABSTRACTA
      //  FiguraRegular figuraRegular =
      //          new FiguraRegular(TipoFiguraPoligonal.PENTAGONO, 2.7);
        /*FiguraRegular cuadrado1 = new Cuadrado(2.2);
        System.out.println(cuadrado1.obtenerInformacion());
        FiguraRegular triangEq1 = new TrianguloEquilatero(1.1);
        System.out.println(triangEq1.obtenerInformacion());
        FiguraRegular pentagono1 = new Pentagono(5);
        System.out.println(pentagono1.obtenerInformacion());
        TrianguloIrregular isosceles1 = new TrianguloIsosceles(7,2);
        System.out.println(isosceles1.obtenerInformacion());
        TrianguloIrregular rectangulo1 = new TrianguloRectangulo(2,3.3);
        System.out.println(rectangulo1.obtenerInformacion());
        TrianguloIrregular escaleno1 = new TrianguloEscaleno(2.2, 3.3, 4.7);
        System.out.println(escaleno1.obtenerInformacion());
        FiguraCircular circulo1 = new Circulo(6.3);
        System.out.println(circulo1.obtenerInformacion());
        FiguraCircular elipse1 = new Elipse(3.5, 1.9);
        System.out.println(elipse1.obtenerInformacion());*/

        //GUARDAMOS TODAS LAS FIGURAS EN UNA LISTA
        List<Figura> figuras = List.of(new Cuadrado(2.2) ,
           new TrianguloEquilatero(1.1), new Pentagono(5),
           new TrianguloIsosceles(7,2), new TrianguloRectangulo(2,3.3),
           new TrianguloEscaleno(2.2, 3.3, 4.7), new Circulo(6.3),  new Elipse(3.5, 1.9));
        mostrarInformacionFiguras(figuras);
    }

    private static void mostrarInformacionFiguras(List<Figura> figuras) {
        /*for (Figura figura : figuras){
            System.out.println(figura.obtenerInformacion());
        }*/
        figuras.stream()
                .forEach(figura -> System.out.println(figura.obtenerInformacion()));
    }












}
