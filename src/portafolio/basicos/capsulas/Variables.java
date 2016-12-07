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
public class Variables {
	private double x;
        private double y;
	private double z;
        public double getx(){return x;}
        public double gety(){return y;}
	public double getz(){return z;}
        public void setx (double x){this.x = x;}
	public void sety (double y){this.y = y;}
        public void setz (double z) {this.z=z;}
        
	public	String printStates() {
            return 
                    +x+","+y+"y"+z ;
                    }        
    

}

