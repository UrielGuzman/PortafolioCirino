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
public class Tiempo {
        private int horadespegue;
        private int minutodespegue;
	private int segundodespegue;
        private int segundovuelo;
        public int gethoradespegue(){return horadespegue;}
        public int getminutodespegue(){return minutodespegue;}
	public int getsegundodespegue(){return segundodespegue;}
        public int getsegundovuelo(){return segundovuelo;}
        public boolean sethoradespegue (int horadespegue){
            if (horadespegue>0) {
                this.horadespegue = horadespegue;
                return true;
            }	
            else return false;
        }
        public boolean setminutodespegue (int minutodespegue){
            if (minutodespegue>0) {
             this.minutodespegue = minutodespegue;
             return true;
            }	
            else return false;
        }
        public boolean setsegundodespegue (int segundodespegue) {
            if (segundodespegue>0) {
            this.segundodespegue = segundodespegue;
            return true;
            }	
            else return false;
        }
        
        public boolean setsegundovuelo (int segundovuelo) {
            if (segundovuelo>0) {
            this.segundovuelo = segundovuelo;
            return true;
            }	
            else return false;
        }
        
	public	String printStates() {
            return 
                    " " ;
                    }        
    

}

