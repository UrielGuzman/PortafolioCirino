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
public class Medallas {
    	private String n;
        private String p;
	private double ms;
        private double ma;
	private double mp;
        private double ml;
	private double mr;
	public String getn(){return n;}
        public String getp(){return p;}
	public double getms(){return ms;}
        public double getma(){return ma;}
	public double getmp(){return mp;}
        public double getml(){return ml;}
	public double getmr(){return mr;}
	public boolean setn (String n){
            if (!n.isEmpty()) {
             this.n = n;
             return true;
         } else
             return false;
        }
        public boolean setp (String p){
            if (!p.isEmpty()) {
             this.p = p;
             return true;
         } else
             return false;
        }
	public boolean setms (double ms){
            if (ms>0) {
	this.ms = ms;
	return true;
	}	
            else return false;
        }
        
        public boolean setma (double ma){
            if (ma>0) {
	this.ma = ma;
	return true;
	}	
            else return false;
        }
	public boolean setmp (double mp){
                if (mp>0) {
	this.mp = mp;
	return true;
	}	
            else return false;
        }
        public boolean setml (double ml) {
            if (ml>0) {
	this.ml = ml;
	return true;
	}	
            else return false;
        }
                
	public boolean setmr (double mr){
            if (mr>0) {
	this.mr = mr;
	return true;
	}	
            else return false;
        }
	public	String printStates() {
            return 
                    " "+n+" del pais "+p;
                    }        
    

}

