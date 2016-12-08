/* Promedio.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:44
Fecha: 
*/
package portafolio.intermedios;

import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;


public class Promedio {


    Pizarra x = new Pizarra();

    public void inicio() {
        System.out.println("Para calcular el promedio");
    }
    
    int [] numeros =new int[100];

            int i=0 ,control,promedio,suma;
        

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
        String aux;       
        
        int numero=1;
        
            while(numero!=0){         
                do{
                    aux = d.readString("Introduce un valor para promediar,\n"
                            + "para salir introduce 0");                                     
                }while(!isNum(aux));
                numero = Integer.parseInt(aux);  
                numeros[i]=numero;
                suma = suma + numero;
                if(Integer.parseInt(aux)==0) {
                i++;
               }                    
        }    
    
    }

    public void calculos() {
         promedio = suma/control;
    }


    void resultados() { //No. 3 Imprimir
        
        x.setVisible(true);

        x.out("\nEl promedio de los datos " );
        x.out("\n es "+promedio+"\n");
        x.ofoto("promedio.png");
    }

    public static void main(String[] args) throws IOException {
        Promedio a = new Promedio ();
        String resp = "s";


            a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos();
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otro promedio? s/n");
            System.in.skip(2);
        }
    }
}

