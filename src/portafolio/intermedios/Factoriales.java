/* Fractoriales.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:43
Fecha: 
*/

package portafolio.intermedios;

import portafolio.intermedios.capsulas.Fact;
import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;


public class Factoriales {
    Fact fac = new Fact();
    Pizarra x = new Pizarra();

    public void inicio() {
        System.out.println("Para calcular los factoriales");
    }
    

            double   factor = 1;
        

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

    public void datos(Fact y){
        Dialog d = new Dialog();
        String aux;
        
        do aux = d.readString("Ingrese un numero natural (0 a infinito):");
        while (!isNum(aux));
        y.setnumero((Double.parseDouble(aux)));
        
        
        }
    


    public void calculos() {
         
            
    }


    void resultados() { //No. 3 Imprimir
        
        x.setVisible(true);
        
        int numero = (int) fac.getnumero();

        while(factor <= numero){
            if(numero % factor == 0){
               x.out(factor + " \nes el factor de " + numero+"\n");
            }
            factor ++;
    }
        x.ofoto("factor.png");
    }

    public static void main(String[] args) throws IOException {
        Factoriales a = new Factoriales ();
        String resp = "s";


            a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.fac);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otro factor? s/n");
            System.in.skip(2);
        }
    }
}

