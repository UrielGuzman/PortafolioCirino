/* Probabilidad.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:51
Fecha: 
*/
package portafolio.intermedios;

import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;
import static java.lang.Math.pow;   

public class Probabilidad {

    Pizarra x = new Pizarra();

    public void inicio() {
        System.out.println("Para calcular la probabiliad al lanzar una moneda");
    }
        
        int [] monedas = {1,2,3,4,5};

        int [] aguila = {0,1,2,3,4,5};
        double valor,promedio;
        
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

    public void datos(){
        Dialog d = new Dialog();
        
        
        
        }
    


    public void calculos() {
         
            
    }


    void resultados() { //No. 3 Imprimir
        
        x.setVisible(true);
       for (int y=0;y<=aguila.length; y++) {
           
        for(int i=1; i<=monedas.length; i++){
           if (valor==0)
               valor = 1;
          if (y>i) {
              valor = 1000000000;
          }
       promedio = i/pow(2,valor);
            valor = y;
        x.out("Al lanzar "+i+" ");
        x.out ("monedas la probabilidad de obtener " +y+ " ");
        x.out ("aguilas es " +promedio+ "\n");
  }
       
       }
        x.ofoto("moned.jpg");
    }

    public static void main(String[] args) throws IOException {
        Probabilidad a = new Probabilidad ();
        String resp = "s";


            a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos();
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea ver la probabilidad nuevamente? s/n");
            System.in.skip(2);
        }
    }
}



