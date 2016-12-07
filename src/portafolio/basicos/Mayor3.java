/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.basicos;

import portafolio.basicos.capsulas.Variables;
import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;

/**
 *
 * @author Dixven
 */
public class Mayor3 {

Variables mayor = new Variables();
Pizarra x = new Pizarra();



    public void inicio() {
        System.out.println("Para calcular el mayor de 3 numeros");
    }
    
    double max,cant;
    int n1,n2,n3;

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

        do aux = d.readString("Ingrese el primer valor: ");
        while (!isNum(aux));
        y.setx((Double.parseDouble(aux)));

        do aux = d.readString("Ingrese el segundo valor: ");
        while (!isNum(aux));
        y.sety((Double.parseDouble(aux)));
        
        do aux = d.readString("Ingrese el tercer valor: " );
        while (!isNum(aux));
        y.setz((Double.parseDouble(aux)));
        

    }

    public void calculos() {
        
      
        
    }


    void resultados() { //No. 3 Imprimir
        
        x.setVisible(true);

        n1 = (int) mayor.getx();
        n2 = (int) mayor.gety();
        n3 = (int) mayor.getz();
        
        if ((n1>n2)&(n1 > n3) & (n1!=n2) & (n1!=n3)){
            x.out("\n"+n1+" Es la cantidad mayor y es la variable 1");
        }
        else if ((n2>n1) & (n2>n3) & (n2!=n3) & (n2!=n1)) {
            x.out("\n"+n2+" Es la cantidad mayor y es la variable 2");
        }
        else if ((n3>n1) & (n3>n1) & (n3!=n2) & (n3!=n1)) {
            x.out("\n"+n3+" Es la cantidad mayor y es la variable 3");
        }
        else if ((n1==n2) & (n1!=n3)) {
            x.out("\n 2 cantidades fueron iguales con cantidad "+n1);
            x.out("\n Fueron la variable 1 y 2");
        }
        else if ((n2==n3) & (n2!=n1)) {
            x.out("\n 2 cantidades fueron iguales con cantidad "+n2);
            x.out("\n Fueron la variable 2 y 3");
        }
        else if ((n1==n3) & (n1!=n2)) {
            x.out("\n 2 cantidades fueron iguales con cantidad "+n1);
            x.out("\n Fueron la variable 1 y 3");
        }
        else if ((n1==n2) & (n1==n3)) {
            x.out("\n Las 3 cantidades fueron iguales");
        }
    }

    public static void main(String[] args) throws IOException {
        Mayor3 a = new Mayor3 ();
        String resp = "s";


        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.mayor);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea ingresar nuevas cantidades? s/n");
            System.in.skip(2);
        }
    }
}