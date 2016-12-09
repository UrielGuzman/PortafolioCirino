/* AritmeticaArreglos.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:62
Fecha: 
*/

package portafolio.avanzados;

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
    
        int i=0;    
        int [] numeros =new int[50];
        int numero=1;
            double a,valor;
        

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
        String aux;

        
            numero = 1;
             
            while(numero!=0){         
                do{
                    aux = d.readString("Introduce un valor hacer el arreglo,\n"
                            + "para salir introduce 0");                                     
                }while(!isNum(aux));
                numero = Integer.parseInt(aux);  
                numeros[i]=numero;
                i++;
                if(Integer.parseInt(aux)==0) {
                i++;
                                   
            }                    
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
         
            
    }


    void resultados() { //No. 3 Imprimir
        valor = (double) warm.getvalor();
        String tipo =(String) warm.gettipo();
        x.setVisible(true);
        
    if (tipo.equals("s") || tipo.equals("S")) {
               
        for( i=0; i<numeros.length-25; i++){
           
            a = numeros[i]+valor;
            x.out("El nuevo arreglo utilizando suma ");
            x.out ("es "+i+" [ " +a+ " ] \n");
            }
    }
    
    else if (tipo.equals("r") || tipo.equals("R")) {
        
        for( i=0; i<numeros.length-25; i++){
           
            a = numeros[i]-valor;
            x.out("El nuevo arreglo utilizando resta ");
            x.out ("es "+i+" [ " +a+ " ] \n");
            }
     
    }
    else if  (tipo.equals("m") || tipo.equals("M")) {
        
        for( i=0; i<numeros.length-25; i++){
           
            a = numeros[i]*valor;
            x.out("El nuevo arreglo utilizando multiplicacion ");
            x.out ("es "+i+" [ " +a+ " ] \n");
            }
    }
    else if (tipo.equals("d") || tipo.equals("D")) {
        
        for( i=0; i<numeros.length-25; i++){
           
            a = numeros[i]/valor;
            x.out("El nuevo arreglo utilizando division ");
            x.out ("es "+i+" [ " +a+ " ] \n");
            }
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


