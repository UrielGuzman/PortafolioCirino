/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.intermedios;

import portafolio.intermedios.capsulas.Rehil;
import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;

public class Rehilete {
    Rehil rehil = new Rehil ();
    Pizarra p = new Pizarra();
    int nu;

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
    
    public void datos(Rehil y) {
        Dialog d = new Dialog();
        String aux;
        System.out.println("Este Programa Crea Un Rehilete.");
        
        do aux = d.readString("Ingrese el tamaño del rehilete:");
        while (!isNum(aux));
        y.setnu((Integer.parseInt(aux)));

    }

    public void trazo() {
        nu = (int) rehil.getnu ();
        
        boolean bandera = false, bandera2 = false;

        for (int i = 0; i < nu + 1; i++) {
            for (int x = 0; x < i; x++) {
//                System.out.printf("/");
                p.out("*");

                bandera = true;
            }
            if (bandera == true) {
                for (int x = nu; x > i - 1; x--) {
//                    System.out.printf(" ");
                    p.out(" ");

                    bandera2 = true;
                }
            }
            if (bandera2 == true) {
                for (int x = nu; x > i - 1; x--) {
//                    System.out.printf("/");
                    p.out("*");

                }
            }
//            System.out.printf("\n");
            p.out("\n");

            for (int x = nu; x > i; x--) {
//                System.out.printf(" ");
                p.out(" ");

            }
            for (int x = -1; x < i; x++) {
//                System.out.printf(" ");
                p.out(" ");

            }
        }
    }

    public void trazo2() {
        p.out("\n");
//        System.out.printf("\n");

        for (int i = 0; i < nu; i++) {
            for (int x = -1; x < i; x++) {
//                System.out.printf(" ");
                p.out(" ");

            }
            for (int x = nu; x > i; x--) {
//                System.out.printf(" ");
                p.out(" ");

            }
            for (int x = nu; x > i; x--) {
//                System.out.printf(" ");
                p.out(" ");

            }
            for (int x = -1; x < i; x++) {
//                System.out.printf("/");
                p.out("*");

            }
            for (int x = -1; x < i; x++) {
//                System.out.printf(" ");
                p.out(" ");

            }
            for (int x = nu; x > i; x--) {
//                System.out.printf("/");
                p.out("*");

            }
//            System.out.printf("\n");
            p.out("\n");

        }
        p.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        Rehilete a = new Rehilete ();
        String resp = "s";


        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.rehil);
            a.trazo();
            a.trazo2()  ;
            Pizarra x = new Pizarra();  
            Dialog d = new Dialog();
            resp = d.readString("¿Desea ver otro rehilete? s/n");
            System.in.skip(2);
        }
    }
}
