/* invertir.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:66
Fecha: 
*/
package portafolio.avanzados;

import cstio.*;
import java.awt.Color;
import java.io.*;

public class Invertir {
    
    Dialog d = new Dialog();
    private int normal[] = new int [1000], control; 
    private int invertido[] = new int[1000];
    
     public boolean isNum(String cad){
        Dialog d = new Dialog();
        try{
            Integer.parseInt(cad);
            return true;
        }catch(NumberFormatException nfe){
            d.display("Solo se aceptan numeros");
            return false;
        }
    }
    
    public void inicio(){
        d.display("Programa para invertir un arreglo");        
    }
    
    public void datos(){
        
        String v, res;
        int i=0, numero=0;
        
        
        //if(bandera){
            while(numero!=-1){         
                do{
                    v = d.readString("Introduce un valor para el arreglo,\n"
                            + "para salir introduce -1");                                     
                }while(!isNum(v));
                numero = Integer.parseInt(v);
                normal[i]=numero;
                //if(Integer.parseInt(v)==-1)
                    //bandera=false;
                i++;
                control = i;                    
            }                    
        //}    
    }
    
    public void rellenar(){
        for(int i = control;i<normal.length;i++)
            normal[i]=-1;
    }
    
    public void ver(){
        for(int i=0;i<invertido.length;i++){
            System.out.print(invertido[i]);
        }
        
    }
    
    public void calculos(){
        boolean bandera = true; 
        int i=0;        
        for(int j = (invertido.length-1); j >= 0; j--){            
            invertido[i]=normal[j];     
            i++;               
        }    
    }
    
    public void resultados(){
        Pizarra p = new Pizarra();            
        p.setVisible(true);
        
        p.out("Nota: los primeros son del arreglo normal\n"
                + "Los segundos son del invertido\n");
        
        for(int i=0;i<normal.length;i++){    
            if(normal[i]!=-1)
                p.out(normal[i]/*+" Invertido: "+invertido[i]+"\n"*/+",");  
            else if(invertido[i]!=-1)
                p.out(invertido[i]+",");
       }           
    }
    
    public static void main(String[] args) throws IOException{
        Invertir invertido = new Invertir();              
        char resp='s';
        
        invertido.inicio();
        while(resp=='s'){
            invertido.datos();            
            invertido.rellenar();            
            invertido.calculos();        
            invertido.ver();
            invertido.resultados();
            String res = invertido.d.readString("Deseas invertir mas arreglos? s/n");
            res = res.toLowerCase();
            resp = res.charAt(0);
            System.in.skip(2);
        }               
    }           
}
    
