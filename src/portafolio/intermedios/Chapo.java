/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.intermedios;

import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;

/**
 *
 * @author Dixven
 */
public class Chapo {
    Pizarra x = new Pizarra();



    public void inicio() {
        System.out.println("Para calcular la pelota con droga");
    }
    
    int a,b,c,a1,a2,a3,b1,b2,b3,c1,c2,c3;



    public void datos() {
        a1 = 1;
        a2 = 1;
        a3 = 1;
        b1 = 1;
        b2 = 1;
        b3 = 1;
        c1 = 1;
        c2 = 2;
        c3 = 1;
            
    }

    public void calculos() {
        //separamos en 3 grupos
        a = a1+a2+a3;
        b = b1+b2+b3;
        c = c1+c2+c3;
    }


    void resultados() { //No. 3 Imprimir
        
        x.setVisible(true);
        if (a>b) {
            if (a1>a2) {
                x.out("La pelota con droga es a1\n");
            }
            else if (a1<a2) {
                x.out("La pelota con droga es a2\n");
            }
            else if (a1==a2) {
                x.out("La pelota con droga es a3\n");
            }
        }
        
        else if (a<b) {
            if (b1>b2) {
                x.out("La pelota con droga es b1\n");
            }
            else if (b1<b2) {
                x.out("La pelota con droga es b2\n");
            }
            else if (b1==b2) {
                x.out("La pelota con droga es b3\n");
            }
        }
        
        else if (a==b) {
            if (c1>c2) {
                x.out("La pelota con droga es c1\n");
            }
            else if (c1<c2) {
                x.out("La pelota con droga es c2\n");
            }
            else if (c1==c2) {
                x.out("La pelota con droga es c3\n");
            }
        }
        x.ofoto("pelota.jpg");
    }

    public static void main(String[] args) throws IOException {
        Chapo a = new Chapo ();
        String resp = "s";


        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos();
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otra hipotenusa? s/n");
            System.in.skip(2);
        }
    }
}

