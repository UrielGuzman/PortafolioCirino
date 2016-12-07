/* Bicycle.java
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
alumno(a): Edvin Uriel Guzman Ruiz
tarea #:13
Fecha: 
*/
package portafolio.basicos.capsulas;

/**
 *
 * @author Dixven
 */
public class Bicycle {
	int piñones;
	int rodada;
	double velocidad;

public boolean setPiñon (int p) {
	if (p>8) {
	piñones = p;
	return true;
	}	else return false;
}

public boolean setVelocidad(double v) {
if (v>= 0) {
	velocidad = v;
	return true;
}	else return false;
}

public boolean setRodada (int r) {
	if (r > 0){
	rodada = r;
	return true;
	} else return false;
}

public double getVelocidad() {return velocidad; }
public int getPiñon() {return piñones; }
public int getRodada() {return rodada;}

public String prinStates() {
	return  "\n La cantidad de Piñones es  " +piñones+"\n"+
		"\n La cantidad de Rodadas hechas es  "+rodada+"\n"+
		"\n La velocidad de la Bicicleta es  "+velocidad+"\n";
}

}