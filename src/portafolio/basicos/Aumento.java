/* Aumento.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:32
Fecha: 
*/
package portafolio.basicos;

import portafolio.basicos.capsulas.Aum;
import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;


public class Aumento {

    Aum aumen = new Aum();
    Pizarra x = new Pizarra();



    public void inicio() {
        System.out.println("Para calcular los aumentos");
    }
    
    double aumento,salt;
    int salario;
   

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


    public void datos(Aum y) {
        Dialog d = new Dialog();
        String aux;


         do aux = d.readString("Ingrese el Nombre del Empleado:");
        while (aux.isEmpty());
        y.setnombre(aux);


        do aux = d.readString("Ingrese el sueldo base:");
        while (!isNum(aux));
        y.setsalario((Double.parseDouble(aux)));
        
    }

    public void calculos() {
         salario = (int) aumen.getsalario();
        if (salario<=2000) {        
            aumento=salario*.3;
            salt=salario*1.3;
                    
        }
          else if ((salario>2000) & (salario<=4000)) {
            aumento=salario*.25;
            salt=salario*1.25;
          }
          else if ((salario>4000) & (salario<=10000)) {
            aumento=salario*.1;
            salt=salario*1.1;
          }
          else if (salario>10000) { 
            aumento=salario*.05;
            salt=salario*1.05; 
          } 
    }

    void resultados() { //No. 3 Imprimir
        String nombre =(String) aumen.getnombre();
            x.setVisible(true);  
            x.out("\nEl empleado " +nombre);
            x.out("\ncon sueldo"+salario );
            x.out("\n obtuvo un aumento de\n"+aumento);
            x.out("\ntiene un nuevo sueldo de\n"+salt);
            x.ofoto("aumento.jpg");
       
        
        
    }

    public static void main(String[] args) throws IOException {
        Aumento a = new Aumento ();
        String resp = "s";

        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.aumen);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otro aumento? s/n");
            System.in.skip(2);
        }
    }
}

    