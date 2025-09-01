/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pood;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pood {
    
    Scanner in = new Scanner (System.in);
    
    
    
    private  String nombre ="";
    private int edad = 0;
    
    public void setnombre(){
       
       System.out.println("Ingrese nombre: ");
        nombre = in.nextLine(); 
    }
    
       public void setedad(){
       
       System.out.println("Ingrese edad: ");
        edad = in.nextInt(); 
        in.nextLine();
    }
   
    public String getnombre (){
        
        return(nombre);
        
    }
       
    
     public int getedad (){
        
        return(edad);
        
    }

    public static void main(String[] args) {
        Pood p1 = new Pood();
        
        p1.setnombre();
        p1.setedad();
        
        
        System.out.println("mi nombre es "+p1.getnombre());
        System.out.println("Mi edad es "+ p1.getedad());
        
    }
}
