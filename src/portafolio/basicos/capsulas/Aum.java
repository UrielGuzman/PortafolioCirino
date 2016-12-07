/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.basicos.capsulas;

/**
 *
 * @author Dixven
 */
public class Aum {
    
private String nombre;
	private double salario;
	public String getnombre(){return nombre;}
	public double getsalario(){return salario;}
        public boolean setnombre (String nombre){
          if (!nombre.isEmpty()) {
             this.nombre = nombre;
             return true;
         } else
             return false;
     }
        

        
	public boolean setsalario (double salario){
                if (salario>0) {
	this.salario = salario;
	return true;
	}	
            else return false;
        }        
    

}

   
