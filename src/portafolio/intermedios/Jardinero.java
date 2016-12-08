/* Jardinero.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:46
Fecha: 
*/
package portafolio.intermedios;

import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;


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
            resp = d.readString("¿Desea seguir en el programa? s/n");
            System.in.skip(2);
        }
    }
}

