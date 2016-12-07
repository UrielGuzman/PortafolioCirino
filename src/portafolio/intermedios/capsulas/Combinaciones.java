/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.intermedios.capsulas;


public class Combinaciones {
        private int cosas;
        private int posibles;
	public int getcosas(){return cosas;}
        public int getposibles(){return posibles;}

        
	public boolean setcosas (int cosas){
                if (cosas>0) {
	this.cosas = cosas;
	return true;
	}	
            else return false;
        }        
        
        public boolean setposibles (int posibles){
                if (posibles>0) {
	this.posibles = posibles;
	return true;
	}	
            else return false;
        }

}
