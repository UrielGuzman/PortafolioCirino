/* distancia.java
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
alumno(a): Edvin Uriel Guzman Ruiz
tarea #:17
Fecha: 
*/
package portafolio.basicos;

import portafolio.basicos.capsulas.Point;
import java.util.Scanner;
import java.io.*;

public class Distancia {
	Scanner teclado = new Scanner (System.in);
        Point c1 = new Point();
        
        
        Point c2 = new Point();
         double d;
         
    
         
void inicio () {
        System.out.println("Para calcular la distancia entre dos puntos ");
        System.out.println("del plano cartesiano, alimentados por el usuario ");
}

boolean isNum(String cad) {
    try {
            Double.parseDouble(cad);
            return true;
    }
            catch(NumberFormatException nfe) {
                    System.out.println("solo se admiten valores numericos");}
    return false;
}

void datos (Point p) { //No. 1 introducir datos 
    String aux;
    do {
        System.out.print("Cuannto vale x:");
        aux = teclado.nextLine();
    }
    while (!isNum(aux));
    p.setX(Double.parseDouble(aux));
    do {
        System.out.print("Cuannto vale y:");
        aux = teclado.nextLine();
    }
    while (!isNum(aux));
    p.setX(Double.parseDouble(aux));
    }
    

void calculos (){ // No. 2 calculos
    double difX, difY;
    difX = c2.getX() - c1.getY();
    difY = c2.getX() - c1.getY();
    d = Math.sqrt(Math.pow(difX,2) + Math.pow(difY,2));
    
}
void resultados (){ //No. 3 Imprimir
    System.out.println("cuando la 1era. coordenada esta en "+c1.toString());
    System.out.println("cuando la 2da. coordenada esta en "+c2.toString());
    System.out.println("La distancia entre ellas es "+d);
}
// No. 4 navegación
public static void main (String args[]) throws IOException {
    Distancia dist= new Distancia ();
    int resp = 'S';
    
    dist.inicio();
    while (resp == 's' || resp =='S') {
        dist.datos(dist.c1);
        dist.datos (dist.c2);
        dist.calculos();
        dist.resultados();
        System.out.print("Desea calcular otra distancia? s/n");
        resp = System.in.read();
        System.in.skip(2);
    }
}
}
