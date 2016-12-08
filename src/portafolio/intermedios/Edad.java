/* Edad.java
Tecnologico Nacional De Mexico
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
Lunes-Miercoles: 10:30am - 12:10pm
Viernes: 10:30am - 11:20am
alumno(a): Edvin Uriel Guzman Ruiz
Ejercicio: #:52
Fecha: 
*/
package portafolio.intermedios;

import portafolio.intermedios.capsulas.Nacimiento;
import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;
import java.util.Calendar;



public class Edad {
    Calendar Calendario = Calendar.getInstance();
    Nacimiento nac = new Nacimiento ();
    Pizarra x = new Pizarra();

    public void inicio() {
        System.out.println("Para calcular la edad");
    }
    


            int año,dia,mes,añoh,mesh,diah,añof,mesf,diaf;
        

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

    public void datos(Nacimiento y){
        Dialog d = new Dialog();
        String aux;
        
        
        do aux = d.readString("Ingrese el año de nacimiento:");
        while (!isNum(aux));
        y.setaño((Integer.parseInt(aux)));
        
        do aux = d.readString("Ingrese el mes de nacimiento:");
        while (!isNum(aux));
        y.setmes((Integer.parseInt(aux)));
        
        do aux = d.readString("Ingrese el dia de nacimiento:");
        while (!isNum(aux));
        y.setdia((Integer.parseInt(aux)));
        }
    

    public void calculos() {
        
        año = (int) nac.getaño();
        mes = (int) nac.getmes();
        dia = (int) nac.getdia();
        
        añoh = Calendario.get(Calendar.YEAR);
        mesh = Calendario.get(Calendar.MONTH);
        diah = Calendario.get(Calendar.DATE);

        añof = añoh - año;
        mesf = mesh - mes;
        if (mes < 0) {
        añof = añof - 1;
         } else if (mes == 0) {
        diaf = diah - dia;
         if (dia > 0) {
          añof = añof - 1;
      }
         diaf=diah-dia;
        }
        
    }
            
    


    void resultados() { //No. 3 Imprimir
        
        x.setVisible(true);
        
        x.out("\nTu tienes "+añof+"años, ");
        x.out (+mesf+ " meses, " +diaf+ "dias \n");
  
        x.ofoto("permutaciones.jpg");
    }

    public static void main(String[] args) throws IOException {
        Edad a = new Edad ();
        String resp = "s";


            a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.nac);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otra edad? s/n");
            System.in.skip(2);
        }
    }
}


    
