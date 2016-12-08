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
public class Grumosa {
        
        private String color;
        private double grumos;
        private double manos;
        public String getcolor () {return color;}
        public double getgrumos(){return grumos;}
        public double getmanos(){return manos;}
        public boolean setcolor (String color){
          if (!color.isEmpty()) {
             this.color = color;
             return true;
         } else
             return false;
     }
	public boolean setgrumos (double grumos){
            if ((grumos>=0) & (grumos < 20)) {
	this.grumos = grumos;
	return true;
	}	
            else return false;
        }
        public boolean setmanos (double manos){
            if ((manos>=0) & (manos < 4)) {
	this.manos = manos;
	return true;
	}	
            else return false;
        }
}