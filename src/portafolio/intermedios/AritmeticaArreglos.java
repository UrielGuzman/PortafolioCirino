/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.intermedios;

import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;
import portafolio.intermedios.capsulas.Temp;



public class AritmeticaArreglos {
    
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
        AritmeticaArreglos a = new AritmeticaArreglos ();
        String resp = "s";


            a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.warm);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea seguir en el programa? s/n");
            System.in.skip(2);
        }
    }
}


