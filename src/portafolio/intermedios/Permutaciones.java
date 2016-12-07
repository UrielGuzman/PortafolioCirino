    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.intermedios;

import portafolio.intermedios.capsulas.Combinaciones;
import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;


public class Permutaciones {
    Combinaciones comb = new Combinaciones ();

    Pizarra x = new Pizarra();

    public void inicio() {
        System.out.println("Para calcular las permutaciones");
    }
    


            int cosas,posibles,nf,nkf,resultado;
        

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

    public void datos(Combinaciones y){
        Dialog d = new Dialog();
        String aux;
        
        
        do aux = d.readString("Ingrese el numero de objetos que puedes elegir:");
        while (!isNum(aux));
        y.setcosas((Integer.parseInt(aux)));
        
        do aux = d.readString("Ingrese la cantidad que puedes elegir:");
        while (!isNum(aux));
        y.setposibles((Integer.parseInt(aux)));
        
        }
    
public static int factorial(int n){
        return (n==0)?1:n*factorial(n-1);
    }

    public void calculos() {
           
        cosas = (int) comb.getcosas();
        posibles = (int) comb.getposibles();
       
        
        nf = factorial(cosas);
        nkf = factorial(cosas-posibles);
        resultado = nf/nkf; 
     
    }
            
    


    void resultados() { //No. 3 Imprimir
        
        x.setVisible(true);
        
        x.out("\nExisten un numero de \n");
        x.out (+resultado+ " Permutaciones posibles \n");
  
        x.ofoto("permutaciones.jpg");
    }

    public static void main(String[] args) throws IOException {
        Permutaciones a = new Permutaciones ();
        String resp = "s";


            a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.comb);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otra permutacion? s/n");
            System.in.skip(2);
        }
    }
}
