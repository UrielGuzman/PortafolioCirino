/* Extraer.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:68
Fecha: 
*/
package portafolio.avanzados;

import cstio.*;
import java.awt.Color;
import java.io.*;

public class Extraer {
    Dialog d = new Dialog();
    private int originales[]=new int[1000], control;
    private int extraidos[]=new int[1000], uno, dos;
    
    public boolean isNum(String cad){
        try{
            Integer.parseInt(cad);
            return true;
        }catch(NumberFormatException nfe){
            d.display("Solo se aceptan numero");
            return false;
        }        
    }
    
    public void inicio(){
        d.display("Programa para extraer datos de un arreglo(datos numericos)");
    }
    
    public void datos(){
        String v;
        int numero=0, i=0;
         while(numero!=-1){         
            do{
                v = d.readString("Introduce un valor positivo para el arreglo,\n"
                    + "para salir introduce -1");                                     
            }while(!isNum(v));
            numero = Integer.parseInt(v);
            originales[i]=numero;
            i++;
            control = i;         
        }                
        do 
            v = d.readString("Ingresa un rango de datos\n"
                    + "primer numero");
        while(!isNum(v));
        uno = Integer.parseInt(v);
        do 
            v = d.readString("Segundo numero");
        while(!isNum(v));
        dos = Integer.parseInt(v);
    }
    
    public void rellenar(){
        for(int i = control;i<originales.length;i++)
            originales[i]=-1;
    }
    
    public void calculos(){
        if(dos<uno){
            for(int i=dos;i<=uno;i++){
                //if(originales[i]!=-1)
                    extraidos[i]=originales[i];
                //else break;
            }            
        }
        else 
            for(int i=uno;i<=dos;i++)
                extraidos[i]=originales[i];
    }
    
    public void resultados(){
        Pizarra p = new Pizarra();
        p.setVisible(true);
        int j, k;
        
        p.out("Los valores originales son los siguientes\n");
        for(int i=0;i<originales.length;i++){
            if(originales[i]!=-1)            
                p.out(originales[i]+", ");            
            else break;
        }
        p.out("\nLos datos extraidos son los siguientes\n");
        if(dos<uno){
            j=dos;
            for(j=dos;j<uno;j++){            
            p.out(extraidos[j]+", ");
        } 
        }
        else{
            j=uno;
            for(j=uno;j<dos;j++)            
            p.out(extraidos[j]+", ");            
        }
               
    }
    
    
    public static void main(String[] args) throws IOException{        
        Extraer extraer = new Extraer();
        char resp='s';
                
        extraer.inicio();
        while(resp=='s'){
            extraer.datos();
            extraer.rellenar();
            extraer.calculos();
            extraer.resultados();
            
            String res = extraer.d.readString("Deseas hacer otra extraccion? s/n");
            res = res.toLowerCase();
            resp = res.charAt(0);
            System.in.skip(2);                    
        }

    }
    
}
