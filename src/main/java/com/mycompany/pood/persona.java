/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pood;
import java.util.Scanner;


public class persona {
    
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
    
    
}
