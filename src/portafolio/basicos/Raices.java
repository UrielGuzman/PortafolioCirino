/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.basicos;

import portafolio.basicos.capsulas.Variables;
import java.io.IOException;
import cstio.*;
import java.lang.Math;

/**
 *
 * @author Dixven
 */
public class Raices {

        Variables  c1 = new Variables ();
        Pizarra x = new Pizarra();



    public void inicio() {
        System.out.println("Para calcular las raices de una ecuacion ");
        System.out.println("de la forma Ax^2+Bx+C ");
    }
    
    double w;
    double q;
    double q1;
    double q2;

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


    public void datos(Variables y) {
        Dialog d = new Dialog();
        String aux;

        x.setVisible(true);
        do aux = d.readString("Ingrese el valor de A: ");
        while (!isNum(aux));
        y.setx((Double.parseDouble(aux)));

        x.setVisible(true);
        do aux = d.readString("Ingrese el valor de B: ");
        while (!isNum(aux));
        y.sety((Double.parseDouble(aux)));
        
        x.setVisible(true);
        do aux = d.readString("Ingrese el valor de C: ");
        while (!isNum(aux));
        y.setz((Double.parseDouble(aux)));
        

    }

    public void calculos() {
    int x = (int) c1.getx();
    int y = (int) c1.gety();
    int z = (int) c1.getz();
     
    w = ((y*y)-4);
    q = Math.sqrt(q);
    q1 = (-y+x)/(2*x);
    q2 = (-y-x)/(2*x);
    }


    void resultados() { //No. 3 Imprimir
        
        x.setVisible(true);
        if (w<0) {
            x.out("\n La ecuacion se indetermina por raiz negativa\n");
        }
        else  {
        x.out("\nLas raices de la ecuacion\n" + c1.printStates());
        x.out("\n Es igual a: " + q1 + " y " +q2+ "\n");
        x.ofoto("Raices.png");
        
    }
    }

    public static void main(String[] args) throws IOException {
        Raices a = new Raices ();
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

