/* AritmeticaArreglos.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Tarea: #8
Fecha: 
*/

package portafolio.tareas;

import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;
import portafolio.intermedios.capsulas.Temp;



public class EscalarArreglos {
    
   Temp warm = new Temp();
    Pizarra x = new Pizarra();

    public void inicio() {
        System.out.println("Para calcular limites");
    }
    
        int i=0,j=0;    
        int [] numeros =new int[50];
        int [] a =new int[50];
        int numero=1;
            int valor;
        

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

    public void datos(Temp y){
        Dialog d = new Dialog();
        String aux = "";

        
            numero = 1;
             
            while(! ( aux ).equalsIgnoreCase( "stop" )){         
                do{
                    aux = d.readString("Introduce un valor hacer el arreglo,\n"
                            + "para salir introduce stop");                                     
                }while (aux.isEmpty());
                
                if ((aux).equalsIgnoreCase("stop")){
               
                break;
             }
                numero = Integer.parseInt(aux);  
                numeros[i]=numero;
                i++;
                j++;
        }
        
        do aux = d.readString("\n Introduzca el tipo de operacion que desea realizar\n"
                + " S/R/M/D(suma,resta,multiplicacion o division): \n");
        while (aux.isEmpty());
        y.settipo(aux);

        do aux = d.readString("\n Ingrese un escalar: \n");
        while (!isNum(aux));
        y.setvalor((Double.parseDouble(aux)));
       
        
        }
    


    public void calculos() {
       
        valor = (int) warm.getvalor();
        String tipo =(String) warm.gettipo();
        
        
       switch (tipo) {
           case "s":
           case "S":
               for( i=0; i<j; i++){
                   
                   a[i] = numeros[i]+valor;
               }  break;
           case "r":
           case "R":
               for( i=0; i<j; i++){
                   
                   a[i] = numeros[i]-valor;
               }  break;
           case "m":
           case "M":
               for( i=0; i<j; i++){
                   
                   a[i] = numeros[i]*valor;
               }      break;
           case "d":
           case "D":
               for( i=0; i<j; i++){
                   
                   a[i] = numeros[i]/valor;
               }  break;
           default:
               break;
       }
            
    }


    void resultados() { //No. 3 Imprimir
        x.setVisible(true);
        x.out ("El nuevo arreglo es: \n");
        for( i=0; i<j; i++){
           
           x.out("valor ["+i+ "] "+a[i]+" ");
            }
        
    }
    public static void main(String[] args) throws IOException {
        EscalarArreglos a = new EscalarArreglos ();
        String resp = "s";


            a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.warm);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea hacer otra operacion aritmetica? s/n");
            System.in.skip(2);
        }
    }
}


