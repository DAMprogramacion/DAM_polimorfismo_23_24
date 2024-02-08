package teoria.interfacesPreJava8;

import teoria.interfacesPreJava8.figurasRegulares.Cuadrado;
import teoria.interfacesPreJava8.figurasRegulares.FiguraRegular;
import teoria.interfacesPreJava8.figurasRegulares.Pentagono;
import teoria.interfacesPreJava8.figurasRegulares.TrianguloEquilatero;

public class Main {
    public static void main(String[] args) {
        //NO SE PUEDE INSTANCIAR UN OBJETO DE UNA CLASE ABSTRACTA
      //  FiguraRegular figuraRegular =
      //          new FiguraRegular(TipoFiguraPoligonal.PENTAGONO, 2.7);
        FiguraRegular cuadrado1 = new Cuadrado(2.2);
        System.out.println(cuadrado1.obtenerInformacion());
        FiguraRegular triangEq1 = new TrianguloEquilatero(1.1);
        System.out.println(triangEq1.obtenerInformacion());
        FiguraRegular pentagono1 = new Pentagono(5);
        System.out.println(pentagono1.obtenerInformacion());
    }
}
