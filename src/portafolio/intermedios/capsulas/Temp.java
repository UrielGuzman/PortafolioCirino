/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.intermedios.capsulas;


public class Temp {
 
        private String tipo;
	private double valor,valor2;
	public String gettipo(){return tipo;}
	public double getvalor(){return valor;}
        public double getvalor2(){return valor2;}
        public boolean settipo (String tipo){
          if (!tipo.isEmpty()) {
             this.tipo = tipo;
             return true;
         } else
             return false;
     }
	public boolean setvalor (double valor){
            if ((valor>-100) & (valor < 400)) {
	this.valor = valor;
	return true;
	}	
            else return false;
        }
        public boolean setvalor2 (double valor2){
            if ((valor>-100) & (valor < 400)) {
	this.valor2 = valor2;
	return true;
	}	
            else return false;
        }
        
          

}

   