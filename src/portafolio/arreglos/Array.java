/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.arreglos;

/**
 *
 * @author Dixven
 */
public class Array { //ejercicio 54
 public static void main(String []args){
  char anArray[];
  
  anArray=new char[10];
  for(int i=0; i<anArray.length; i++){
   int tmp=Math.round((float)Math.random()*100000 % 65536);
  anArray[i]=(char)tmp;
  System.out.println("A["+i+"]="+anArray[i]+",");
  }
  System.out.println();
 }
}
