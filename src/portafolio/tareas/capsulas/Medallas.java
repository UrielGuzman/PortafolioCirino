/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.tareas.capsulas;

/**
 *
 * @author Dixven
 */
public class Medallas {
    
        private String n;
        private String p;
        private String c;
	private double ms;
	public String getn(){return n;}
        public String getp(){return p;}
        public String getc(){return c;}
	public double getms(){return ms;}
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
        
        public boolean setc (String c){
            if (!c.isEmpty()) {
             this.c = c;
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
}
