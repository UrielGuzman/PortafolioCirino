/* Hipotenusa.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:33
Fecha: 
*/
package portafolio.basicos;

import portafolio.basicos.capsulas.Catetos;
import java.io.IOException;
import cstio.*;
import java.lang.Math;


public class Hipotenusa {
    Catetos c1 = new Catetos();
    Pizarra x = new Pizarra();



    public void inicio() {
        System.out.println("Para calcular la hipotenusa");
    }
    
    double z;
    double q;

    boolean isNum(String cad) {
        Dialog d = new Dialog();
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("solo se admiten valores numericos");
        }
        return false;
    }


    public void datos(Catetos y) {
        Dialog d = new Dialog();
        String aux;

        x.setVisible(true);
        do aux = d.readString("Ingrese el valor del primer cateto:");
        while (!isNum(aux));
        y.setx((Double.parseDouble(aux)));

        x.setVisible(true);
        do aux = d.readString("Ingrese el valor del segundo cateto:");
        while (!isNum(aux));
        y.sety((Double.parseDouble(aux)));
        

    }

    public void calculos() {
        int x = (int) c1.getx();
        int y = (int) c1.gety();
      
      q = ((x*x)+(y*y));
      z = Math.sqrt(q);
    }


    void resultados() { //No. 3 Imprimir
        
        x.setVisible(true);

        x.out("\nLa hipotenusa del triangulo con catetos:\n" + c1.printStates());
        x.out("\n Es igual a: " + z + "\n");
        x.ofoto("hipotenusa.png");
    }

    public static void main(String[] args) throws IOException {
        Hipotenusa a = new Hipotenusa ();
        String resp = "s";


        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.c1);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otra hipotenusa? s/n");
            System.in.skip(2);
        }
    }
}

