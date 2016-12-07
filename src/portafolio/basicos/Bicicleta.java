/* Bicicleta.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:18
Fecha: 
*/
package portafolio.basicos;

import portafolio.basicos.capsulas.Bicycle;
import cstio.*;
import java.util.Scanner;
import java.io.*;

public class Bicicleta { 
	Scanner teclado = new Scanner (System.in);
        
        Bicycle c1 = new Bicycle();
        


void inicio () {
        System.out.println("Para observar las propiedades de la bicicleta  ");
        
}

boolean isNum(String cad) {
        Dialog d = new Dialog();
    try {
            Double.parseDouble(cad);
            return true;
    }
            catch(NumberFormatException nfe) {
                    d.display("solo se admiten valores numericos");}
    return false;
}

void datos (Bicycle p) { //No. 1 introducir datos
        Pizarra x = new Pizarra(); 
    Dialog d = new Dialog();
    String v;
    int numero;
    
  x.setVisible(true);
do    v = d.readString ("Ingrese la cantidad de Piñones:");
  while (!isNum(v));
        numero=Integer.parseInt(v);
    p.setPiñon(numero);
    
    
   do v = d.readString ("Ingrese la cantidad de rodadas hechas:");
   while (!isNum(v)); 
   numero=Integer.parseInt(v);
    p.setRodada(numero);
    
    
   do  v = d.readString ("Ingrese la velocidad:");
   while (!isNum(v)); 
   numero=Integer.parseInt(v);
    p.setVelocidad(numero);
    
}

 // No. 2 no hay calculos
    
void resultados (){ //No. 3 Imprimir
      Pizarra p = new Pizarra();

    p.out("Bienvenido a la programacion en Java\n"); //change
    p.setVisible(true);
 
      p.out("\nSu bicicleta tiene las siguientes piesas"+c1.prinStates());
      p.out("\n");
      p.ofoto("bicicleta.jpg");   //change
    }

    
// No. 4 navegación
public static void main (String args[]) throws IOException {
    Bicicleta dist= new Bicicleta ();
    int resp = 'S';
    
    dist.inicio();
    while (resp == 's' || resp =='S') {
        dist.datos(dist.c1);
        dist.resultados();
        System.out.print("Ver otra bicicleta? s/n");
        resp = System.in.read();
        System.in.skip(2);
        
    }
}


}
