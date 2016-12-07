/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.basicos;

import portafolio.basicos.capsulas.Bono;
import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;

/**
 *
 * @author Dixven
 */
public class BonoNavideño {

Bono c1 = new Bono();
Pizarra x = new Pizarra();



    public void inicio() {
        System.out.println("Para calcular los bonos navideños");
    }
    
    double t,z,b;
    int w,w1,w2,w3,w4,w5;
   

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


    public void datos(Bono y) {
        Dialog d = new Dialog();
        String aux;


         do aux = d.readString("Ingrese el Nombre del Empleado:");
        while (aux.isEmpty());
        y.setn(aux);

        do aux = d.readString("Ingrese el numero de horas extra trabajadas:");
        while (!isNum(aux));
        y.sete((Double.parseDouble(aux)));


        do aux = d.readString("Ingrese el numero de ausencias:");
        while (!isNum(aux));
        y.setaus((Double.parseDouble(aux)));
        
       
        do aux = d.readString("Ingrese el sueldo base:");
        while (!isNum(aux));
        y.setsal((Double.parseDouble(aux)));
        
    }

    public void calculos() {
        int e = (int) c1.gete(),sal = (int) c1.getsal(),aus = (int) c1.getaus();
        z = (e-((2/3)*aus));
        if ((0<z) & (z<10)) {
            b=200;
            t= sal+b;
            w=2;
            w2++;
        }
          else if ((10<=z) & (z<15)) {
                
            b=300;
            t= sal+b;
            w=3;
            w3++;
          }
          else if ((15<=z) & (z<20)) {
            b=400;
            t= sal+b;
            w=4;
            w4++;
          }
          else if (z>=20) { 
            b=500;
            t= sal+b;
            w=5;
            w5++; 
          }
          else  {
            b=100;
            t= sal+b;
            w=1;
            w1++;
          }   
    }

    void resultados() { //No. 3 Imprimir
            x.setVisible(true);  
            x.out("\nEl empleado " + c1.printStates());
            x.out("\nobtuvo un bono de "+b+" el cual es" );
            x.out("\n decategoria " + w + " teniendo un sueldo\n");
            x.out("\ntotal de "+t+" y hay un total de \n");
            x.out("\nBonos de primera categoria\n"+w1 );
            x.out("\nBonos de segunda categoria\n"+w2 );
            x.out("\nBonos de tercera categoria\n"+w3 );
            x.out("\nBonos de cuarta categoria\n"+w4 );
            x.out("\nBonos de quinta categoria\n"+w5+"\n" );
            x.ofoto("navideño.jpg");
       
        
        
    }

    public static void main(String[] args) throws IOException {
        BonoNavideño a = new BonoNavideño ();
        String resp = "s";

        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.c1);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otro bono? s/n");
            System.in.skip(2);
        }
    }
}

    