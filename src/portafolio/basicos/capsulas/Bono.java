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
public class Bono {
        private String n;
	private double e;
        private double aus;
	private double sal;
	public String getn(){return n;}
	public double gete(){return e;}
        public double getaus(){return aus;}
	public double getsal(){return sal;}
        public boolean setn (String n){
          if (!n.isEmpty()) {
             this.n = n;
             return true;
         } else
             return false;
     }
	public boolean sete (double e){
            if (e>0) {
	this.e = e;
	return true;
	}	
            else return false;
        }
        
        public boolean setaus (double aus){
            if (aus>0) {
	this.aus = aus;
	return true;
	}	
            else return false;
        }
	public boolean setsal (double sal){
                if (sal>0) {
	this.sal = sal;
	return true;
	}	
            else return false;
        }
        
        
	public	String printStates() {
            return 
                    " "+n+" con sueldo "+sal;
                    }        
    

}

   