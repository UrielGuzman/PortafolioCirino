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
public class Jardinero {

    Pizarra x = new Pizarra();

    public void inicio() {
        System.out.println("Para calcular el area");
    }
    

            int array[] = new int[50];
            int area,max,valor=0;
        


    public void datos(){
        
        }
    


    public void calculos() {
     
    }
            
    


    void resultados() { //No. 3 Imprimir
        
        x.setVisible(true);
        
        for(int i=0; i<array.length; i++){
       area = i*(100 - (2*i));
        x.out("Tabla "+i+" ");
        x.out ("el area es " +area+ "\n");
  }
        x.ofoto("jardinero.jpg");
    }

    public static void main(String[] args) throws IOException {
        Jardinero a = new Jardinero ();
        String resp = "s";


            a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos();
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea terminar? s/n");
            System.in.skip(2);
        }
    }
}

