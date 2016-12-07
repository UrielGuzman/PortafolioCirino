/* Pointe.java
instituto tecnologico de leon
ingenieria en sistemas computacionales
fundamentos de programacion
alumno(a): Edvin Uriel Guzman Ruiz
tarea #:11
Fecha: 
*/
package portafolio.basicos.capsulas;



public class Point { 
	private double x;
	private double y;
	public double getX(){return x;}
	public double getY(){return y;}
	public void setX (double x){this.x=x;}
	public void setY (double y){this.y=y;}
	public	String toString(){
	return "("+x+","+y+")";
}
}
