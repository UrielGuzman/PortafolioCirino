/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.arreglos;

import java.util.Scanner;
public class test{     
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,hor,min,seg;
        System.out.println("ingrese los segundos ");
        num=sc.nextInt();
        hor=num/3600;
        min=(num-(3600*hor))/60;
        seg=num-((hor*3600)+(min*60));
        System.out.println(hor+"h "+min+"m "+seg+"s");
     }
}