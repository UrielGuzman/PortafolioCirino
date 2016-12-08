/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.tareas;

import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;
import portafolio.tareas.capsulas.Medallas;

/**
 *
 * @author Dixven
 */
public class NadadorArreglos {
    

Medallas c1 = new Medallas();
Pizarra x = new Pizarra();



    public void inicio() {
        System.out.println("Para calcular el promedio de medallas");
    }
    
    int [] medallas =new int[25];
    String [] competencia =new String[25];
    int i=0,suma,a,j=0;
    double mt,pr;
    
    
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


    public void datos(Medallas y) {
        Dialog d = new Dialog();
        String aux;

         do aux = d.readString("Ingrese el Nombre del Nadador:");
        while (aux.isEmpty());
        y.setn(aux);

        do aux = d.readString("Ingrese el Pais del Nadador:");
        while (aux.isEmpty());
        y.setp(aux);

             
  
        
        String c = "" ;
             
         while (! ( c ).equalsIgnoreCase( "stop" )) { //this initializes the name variable and sentinel stop
            do aux = d.readString("Ingrese el nombre de la competencia, o entra stop para terminar:");
            while (aux.isEmpty());
            y.setc(aux);
             c = (String) c1.getc ();
             competencia[j] = c;
             j++;
            
             if ((c).equalsIgnoreCase("stop")){
               
                break;
             }
            do aux = d.readString("\n Ingrese las medallas que gano: \n");
            while (!isNum(aux));
            y.setms((Double.parseDouble(aux)));
            int ms = (int) c1.getms();
            medallas[i]=ms;
            i++;
      
            
            
         
        }

    }

    public void calculos() {

     for( j=0; j<i; j++){
           
         a = medallas[j];
         suma = suma + a;
    
     }
     
     pr = suma/j;
    }
    
    


    void resultados() { //No. 3 Imprimir
        x.setVisible(true);
        String n = (String) c1.getn ();
        String p = (String) c1.getp ();
        
        x.out("\nEl nadador "+n+" del pais "+p+" \n" );
        
        for(j=0; j<i; j++){
         
         x.out( "en la competencia de "+competencia[j]);
         x.out( " obtuvo "+medallas[j]+" medallas\n");
    
     }
        
        x.out("\n El promedio de medallas ganadas es: " + pr + "\n");
        x.ofoto("phelps.jpg");
    }

    public static void main(String[] args) throws IOException {
        NadadorArreglos a = new NadadorArreglos ();
        String resp = "s";


        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.c1);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otro promedio? s/n");
            System.in.skip(2);
        }
    }
}


