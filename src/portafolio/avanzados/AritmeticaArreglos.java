/* AritmeticaArreglos.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:67
Fecha: 
*/
package portafolio.avanzados;

import cstio.*;
import java.awt.Color;
import java.io.*;
public class AritmeticaArreglos {
    
    Dialog d=new Dialog();
    private float primero[]=new float[1000];
    private float segundo[]=new float[1000];
    private float tercero[]=new float[1000];
    private char aritmetica[]=new char[1000];
    private int control;
    
    public boolean isNum(String cad){
        try{
            Float.parseFloat(cad);
            return true;
        }catch(NumberFormatException nfe){
            d.display("Solo se aceptan valores numericos");
            return false;
        }
    }
    
    public void inicio(){
        d.display("Pograma para hacer aritmetica con arreglos");
    }
    
    public void datos(){
        String v;
        int i=0;
        float numero=0;
        char resp='b';
        
        while(numero!=-1){
            do
                v = d.readString("Introduce el primer valor numerico\n"
                        + "para salir ingresa -1");
            while(!isNum(v));
            numero=Float.parseFloat(v);
            primero[i]=numero;
            if(numero==-1)
                break;
            
            if(resp!='a'){
                v = d.readString("Introduce la operacion que quieras realizar(signo)\n"
                        + "para salir ingrea 'a'\n"                        
                    + "Suma '+'\n"
                    + "Resta '-'\n"
                    + "Division '/'\n"
                    + "Multiplicacion '*'\n");
                resp=v.charAt(0);
                aritmetica[i]=v.charAt(0);
            }
            
            do
                v = d.readString("Introduce el segundo valor numerico\n");
            while(!isNum(v));
            numero=Float.parseFloat(v); 
            segundo[i]=numero;
            i++;
            control=i;
        }
    }
    
    public void rellenar(){
        for(int i=control;i<primero.length;i++){
            primero[i]=-1;
            segundo[i]=-1;
            aritmetica[i]='a';
        }
    }
    
    public void calculos(){
        for(int i=0;i<control;i++){
            switch(aritmetica[i]){
                case '+':
                    tercero[i]=primero[i]+segundo[i];
                    break;
                case '-':
                    tercero[i]=primero[i]-segundo[i];
                    break;
                case '/': 
                    tercero[i]=primero[i]/segundo[i];
                    break;
                case '*':
                    tercero[i]=primero[i]*segundo[i];
                    break;
            }
        }
    }
    
    public void resultados(){
        Pizarra p=new Pizarra();
        p.out("Bienvenido al programa de la aritmetica con arreglos \n");
        p.setVisible(true);
        
        for(int i=0;i<control;i++){
            p.out("El resultado de "+primero[i]+" "+aritmetica[i]+" "+segundo[i]+"\n"
                    + " fue "+tercero[i]+"\n");
        }
    }
    
    public static void main(String[] args) throws IOException{        
        AritmeticaArreglos aritmetica = new AritmeticaArreglos();        
        char resp = 's';
        aritmetica.inicio();
        
        while(resp=='s'){
            aritmetica.datos();
            aritmetica.rellenar();
            aritmetica.calculos();
            aritmetica.resultados();
            
            String res = aritmetica.d.readString("Deseas usar el programa nuevamente? s/n");
            res = res.toLowerCase();
            resp = res.charAt(0);
            System.in.skip(2);
        }
   }
    
}
