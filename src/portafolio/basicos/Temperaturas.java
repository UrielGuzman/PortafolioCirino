/* Temperaturas.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:30
Fecha: 
*/
package portafolio.basicos;

import portafolio.basicos.capsulas.Temp;
import java.io.IOException;
import cstio.*;
        
public class Temperaturas {

Temp warm = new Temp();
Pizarra x = new Pizarra();



    public void inicio() {
        System.out.println("Para convertir temperaturas");
    }
    
    double a,b;


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


    public void datos(Temp y) {
        Dialog d = new Dialog();
        String aux;

        do aux = d.readString("\n Introdusca el tipo de escala que desea convertir C/F: \n");
        while (aux.isEmpty());
        y.settipo(aux);

        do aux = d.readString("\n Ingrese el valor de la temperatura: \n");
        while (!isNum(aux));
        y.setvalor((Double.parseDouble(aux)));

        

    }

    public void calculos() {
        String tipo =(String) warm.gettipo();
        int valor = (int) warm.getvalor();
       
        if (tipo.equals("c") || tipo.equals("C")) {
            a = (valor*1.8)+32;
        }
        else if (tipo.equals("f") || tipo.equals("F")) {
            a = (valor-32)/1.8;
        }

        
        
    }


    void resultados() { //No. 3 Imprimir
        String tipo =(String) warm.gettipo();
        int valor = (int) warm.getvalor();
        
        x.setVisible(true);
        if (tipo.equals("c") || tipo.equals("C")) {
            x.out("\n El resultado de su convercion son "+a);
            x.out(" grados fahrenheit\n");
            x.ofoto("fahren.jpg");
        }
        else if (tipo.equals("f") || tipo.equals("F")) {
            x.out("\n El resultado de su convercion son "+a);
            x.out(" grados centigrados\n");
            x.ofoto("celcius.jpg");
        }
        else {
            x.setVisible(true);
            x.out("\nSolo se admite C o F\n");
        
            
        }
        
    }

    public static void main(String[] args) throws IOException {
        Temperaturas a = new Temperaturas ();
        String resp = "s";


        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.warm);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea ingresar nuevas cantidades? s/n");
            System.in.skip(2);
        }
    }
}
