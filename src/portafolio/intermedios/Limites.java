/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.intermedios;

import portafolio.intermedios.capsulas.Temp;
import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;


public class Limites {

    Temp warm = new Temp();
    Pizarra x = new Pizarra();

    public void inicio() {
        System.out.println("Para calcular limites");
    }
    

            double a,valor,valor2;
        

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

        do aux = d.readString("\n Introdusca el tipo de escala que desea convertir C/F: \n");
        while (aux.isEmpty());
        y.settipo(aux);

        do aux = d.readString("\n Ingrese el limite inferior: \n");
        while (!isNum(aux));
        y.setvalor((Double.parseDouble(aux)));
        
        do aux = d.readString("\n Ingrese el limite superior: \n");
        while (!isNum(aux));
        y.setvalor2((Double.parseDouble(aux)));
       
        
        }
    


    public void calculos() {
         
            
    }


    void resultados() { //No. 3 Imprimir
        valor = (double) warm.getvalor();
        valor2 = (double) warm.getvalor2();
        String tipo =(String) warm.gettipo();
        x.setVisible(true);
        
    if (tipo.equals("c") || tipo.equals("C")) {
        while(valor <= valor2){
            a = (valor*1.8)+32;
               x.out(valor + " grados °C equivalen a " +a+ " Grados °F \n");
            
            valor ++;
        }
    }
    
    else if (tipo.equals("f") || tipo.equals("F")) {
        
        while(valor <= valor2){
            a = (valor-32)/1.8;
               x.out("\n"+valor + " grados °F equivalen a " +a+ " Grados °C \n");
            
            valor ++;
        
        
    }
        
    }
    x.ofoto("tabla.jpg");
    }
    public static void main(String[] args) throws IOException {
        Limites a = new Limites ();
        String resp = "s";


            a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.warm);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otro factor? s/n");
            System.in.skip(2);
        }
    }
}


