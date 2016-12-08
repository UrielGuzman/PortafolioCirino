/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.tareas;

import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;
import portafolio.tareas.capsulas.Altura;
/**
 *
 * @author Dixven
 */
public class Pelota {
    
    Altura altura = new Altura();
    Pizarra x = new Pizarra();



    public void inicio() {
        System.out.println("Para calcular la gravedad por medio de una pelota");
    }
    
    double gravedad;
    int a,t;

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


    public void datos(Altura y) {
        Dialog d = new Dialog();
        String aux;

        do aux = d.readString("Ingrese la altura de donde cae la pelota:");
        while (!isNum(aux));
        y.setaltura((Double.parseDouble(aux)));

        do aux = d.readString("Ingrese el tiempo que tardo en llegar al suelo (en segundos):");
        while (!isNum(aux));
        y.settiempo((Double.parseDouble(aux)));
        

    }

    public void calculos() {
        a = (int) altura.getaltura();
        t = (int) altura.gettiempo();
      
        gravedad = a/(t*t);
        
    }


    void resultados() { //No. 3 Imprimir
        
        x.setVisible(true);

        x.out("\n La gravedad en el planeta es " +gravedad+" \n");
        x.ofoto("pelota.png");
    }

    public static void main(String[] args) throws IOException {
        Pelota a = new Pelota ();
        String resp = "s";


        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.altura);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otra gravedad? s/n");
            System.in.skip(2);
        }
    }
}
