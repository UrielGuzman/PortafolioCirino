/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.tareas;

import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;
import portafolio.tareas.capsulas.Grumosa;

public class Kinder {
    Grumosa grumo = new Grumosa ();
    Pizarra x = new Pizarra();



    public void inicio() {
        System.out.println("Para meter los atributos de un juguete");
        x.setVisible(true);
        x.ofoto("grumosa.png");
    }
    

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


    public void datos(Grumosa y) {
        Dialog d = new Dialog();
        String aux;
        
        do aux = d.readString("\n Que color es? \n");
        while (aux.isEmpty());
        y.setcolor(aux);

        do aux = d.readString("Cuantas manos tiene?: ");
        while (!isNum(aux));
        y.setmanos((Double.parseDouble(aux)));

        do aux = d.readString("Cuantos grumos tiene?:");
        while (!isNum(aux));
        y.setgrumos((Double.parseDouble(aux)));
        

    }

    public void calculos() {
        
    }


    void resultados() { //No. 3 Imprimir
        int grumos = (int) grumo.getgrumos();
        int manos = (int) grumo.getmanos();
        String color = (String) grumo.getcolor();
        x.out("\n Las caracteristicas del huevito son");
        x.out("\n tiene "+manos+" manos, es de color "+color);
        x.out("\n y "+grumos+ " grumos");

    }

    public static void main(String[] args) throws IOException {
        Kinder a = new Kinder ();
        String resp = "s";


        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.grumo);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea volver a capturar las caracteristicas? s/n");
            System.in.skip(2);
        }
    }
}


