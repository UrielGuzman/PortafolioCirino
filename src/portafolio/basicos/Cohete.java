/* Cohete.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:29
Fecha: 
*/
package portafolio.basicos;

import portafolio.basicos.capsulas.Tiempo;
import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;


public class Cohete {

    Tiempo tie = new Tiempo();
    Pizarra x = new Pizarra();



    public void inicio() {
        System.out.println("Para calcular el tiempo del cohete");
    }
    
    int  segundovuelo, segundodespegue,minutodespegue,horadespegue,dia,hora,minuto,segundo;
    int segundo1, segundo2, segundot;


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


    public void datos(Tiempo y) {
        Dialog d = new Dialog();
        String aux;

        
        do aux = d.readString("Ingrese la hora a la que despego el cohete:");
        while (!isNum(aux));
        y.sethoradespegue((Integer.parseInt(aux)));
        
        do aux = d.readString("Ingrese los minutos a la que despego el cohete:");
        while (!isNum(aux));
        y.setminutodespegue((Integer.parseInt(aux)));
        
        do aux = d.readString("Ingrese la segundos a la que despego el cohete:");
        while (!isNum(aux));
        y.setsegundodespegue((Integer.parseInt(aux)));

        do aux = d.readString("Ingrese los segundos que duro el vuelo:");
        while (!isNum(aux));
        y.setsegundovuelo((Integer.parseInt(aux)));
        

    }

    public void calculos() {
         horadespegue = (int) tie.gethoradespegue();
         minutodespegue = (int) tie.getminutodespegue();
         segundodespegue = (int) tie.getsegundodespegue();
         segundovuelo = (int) tie.getsegundovuelo();
         
         segundo1 = (minutodespegue * 60);
         segundo2 = (horadespegue * 3600);
         segundot = (segundo1 + segundo2 + segundovuelo + segundodespegue);
         
         dia = (segundot / 86400);
         hora = (((segundot - (86400 * dia))) / 3600);
         minuto = ((((segundot) - ((3600*hora)+(86400*dia))))/60);
         segundo = (segundot - ((hora * 3600) + (minuto * 60) +(86400*dia)));
    }


    void resultados() { //No. 3 Imprimir
        
        x.setVisible(true);

        x.out("\nEl cohete regreso a los: "+dia+" dias \n");
        x.out("\ncon "+hora+" horas \n");
        x.out("\ncon " + minuto + " minutos y " +segundo+" segundos \n");
        x.ofoto("cohete.jpg");
    }

    public static void main(String[] args) throws IOException {
        Cohete a = new Cohete ();
        String resp = "s";


        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.tie);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otro tiempo? s/n");
            System.in.skip(2);
        }
    }
}