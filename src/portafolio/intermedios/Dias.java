/* Dias.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:38
Fecha: 
*/
package portafolio.intermedios;

import portafolio.intermedios.capsulas.Date;
import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;

/**
 *
 * @author Dixven
 */
public class Dias {
    
    Date Date = new Date();

    Pizarra x = new Pizarra();

    public void inicio() {
        System.out.println("Para calcular los dias transcurridos en el año");
    }
    
    int diasr,b,dia,mes,año;

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


    public void datos(Date y) {
        Dialog d = new Dialog();
        String aux;

        do aux = d.readString("Ingrese el año actual:");
        while (!isNum(aux));
        y.setaño((Integer.parseInt(aux)));
        
        do aux = d.readString("Ingrese el mes actual:");
        while (!isNum(aux));
        y.setmes((Integer.parseInt(aux)));
        
        do aux = d.readString("Ingrese el dia actual:");
        while (!isNum(aux));
        y.setdia((Integer.parseInt(aux)));
        

    }

    public void calculos() {
         año = (int) Date.getaño();
         mes = (int) Date.getmes();
         dia = (int) Date.getdia();
      
        if (año % 4==0) {
            b = 1;
        }
        else {
            b = 0;
        }
        
        switch (mes) {
            case 1:
                dia = dia;
                break;
            case 2:
                dia = dia + 31;
                break;
            case 3:
                dia = dia + 59 + b;
                break;
            case 4:
                dia = dia + 90 + b;
                break;
            case 5:
                dia = dia + 120 + b;
                break;
            case 6:
                dia = dia + 151 + b;
                break;
            case 7:
                dia = dia + 181 + b;
                break;
            case 8:
                dia = dia + 212 + b;
                break;
            case 9:
                dia = dia + 243 + b;
                break;
            case 10:
                dia = dia + 273 + b;
                break;
            case 11:
                dia = dia + 304 + b;
                break;
            case 12:
                dia = dia + 334 + b;
                break;
             
        }
        diasr = (365 + b) - dia; 
    }


    void resultados() { //No. 3 Imprimir
        
        x.setVisible(true);

        x.out("\nHan transucrrido: "+dia+" dias \n"  );
        x.out("\n para acabar el año faltan " + diasr + " dias\n");
            if (año % 4==0)  {
           x.out("\nEste año es bisiesto\n");
        }
        x.ofoto("calendario.jpg");
    }

    public static void main(String[] args) throws IOException {
        Dias a = new Dias ();
        String resp = "s";


        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.Date);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otros dias? s/n");
            System.in.skip(2);
        }
    }
}


