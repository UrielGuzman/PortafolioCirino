/* NombreConsecutivo.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:49
Fecha: 
*/

package portafolio.intermedios;
import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;


public class NombreConsecutivo {
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();

    String nombre, numero;
    int n;

    //Validacion de numeros por teclado
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

    public void inicio() {
        System.out.println("Programa para calcular suma de los pares impares");
    }

    public void datos() {

        nombre = d.readString("Ingresa tu nombre: ");

        do numero = d.readString("Ingrese el valor del n:");
        while (!isNum(numero));
        n = Integer.parseInt(numero);

    }

    void calculos() {
        p.out("No hay calculos");
    }

    public void resultados() {
        p.setVisible(true);
        if ((0 < n) && (n <= 20)) {
            int i = 1;
            while (i <= n) {
                p.out("Tu nombre es: " + nombre + "\ny el numero consecutivo es: " + n+1);
                i++;
            }
        } else {
            p.out("Introduce un numero valido");
        }
    }

    public static void main(String[] args) throws IOException {
        NombreConsecutivo nombreConsecutivo = new NombreConsecutivo();

        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";

        nombreConsecutivo.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            nombreConsecutivo.datos();
            nombreConsecutivo.calculos();
            nombreConsecutivo.resultados();
            resp = d.readString("¿Desea calcular otro numero? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }

    }
}
