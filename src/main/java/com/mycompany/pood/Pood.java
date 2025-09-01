/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pood;
import java.util.Scanner;
import com.mycompany.pood.persona;


public class Pood {
    
    Scanner in = new Scanner (System.in);
    
          public static void main(String[] args) {
        persona p1 = new persona();
        
        p1.setnombre();
        p1.setedad();
        
        
        System.out.println("mi nombre es "+p1.getnombre());
        System.out.println("Mi edad es "+ p1.getedad());
        
    }
}
