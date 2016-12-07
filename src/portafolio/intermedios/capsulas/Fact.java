/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.intermedios.capsulas;

/**
 *
 * @author Dixven
 */
public class Fact {
        private double numero;
	public double getnumero(){return numero;}

        
	public boolean setnumero (double numero){
                if (numero>0) {
	this.numero = numero;
	return true;
	}	
            else return false;
        }        
    

}
