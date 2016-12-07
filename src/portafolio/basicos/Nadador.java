/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.basicos;

import portafolio.basicos.capsulas.Medallas;
import java.io.IOException;
import cstio.*;


/**
 *
 * @author Dixven
 */
public class Nadador {	
Medallas c1 = new Medallas();
Pizarra x = new Pizarra();



    public void inicio() {
        System.out.println("Para calcular el promedio de medallas");
    }
    
    double mt;
    double pr;

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


    public void datos(Medallas y) {
        Dialog d = new Dialog();
        String aux;

        x.setVisible(true);
         do aux = d.readString("Ingrese el Nombre del Nadador:");
        while (aux.isEmpty());
        y.setn(aux);

        x.setVisible(true);
        do aux = d.readString("Ingrese el Pais del Nadador:");
        while (aux.isEmpty());
        y.setp(aux);

        x.setVisible(true);
        do aux = d.readString("Ingrese las medallas ganadas en Sydney:");
        while (!isNum(aux));
        y.setms((Double.parseDouble(aux)));

        x.setVisible(true);
        do aux = d.readString("Ingrese las medallas ganadas en Atenas:");
        while (!isNum(aux));
        y.setma((Double.parseDouble(aux)));
        
        x.setVisible(true);
        do aux = d.readString("Ingrese las medallas ganadas en Beijin:");
        while (!isNum(aux));
        y.setmp((Double.parseDouble(aux)));
        
        x.setVisible(true);
        do aux = d.readString("Ingrese las medallas ganadas en Londres:");
        while (!isNum(aux));
        y.setml((Double.parseDouble(aux)));
        
        x.setVisible(true);
        do aux = d.readString("Ingrese las medallas ganadas en Rio:");
        while (!isNum(aux));
        y.setmr((Double.parseDouble(aux)));


    }

    public void calculos() {
        int ms = (int) c1.getms();
        int ma = (int) c1.getma();
        int mp = (int) c1.getmp();
        int ml = (int) c1.getml();
        int mr = (int) c1.getmr();

        mt = ms+ma+mp+ml+mr;
        pr = mt/5;
    }


    void resultados() { //No. 3 Imprimir
        x.setVisible(true);

        x.out("\nLos datos del nadador son:\n" + c1.printStates());
        x.out("\n El promedio de medallas ganadas es: " + pr + "\n");
        x.ofoto("phelps.jpg");
    }

    public static void main(String[] args) throws IOException {
        Nadador a = new Nadador ();
        String resp = "s";


        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.c1);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otro promedio? s/n");
            System.in.skip(2);
        }
    }
}

    