/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jeudi25;

import com.mycompany.jeudi25.personne.Ami;
import com.mycompany.jeudi25.personne.Personne;


/**
 *
 * @author Administrateur
 */
public class Entree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
       
        Ami a1 = new Ami();
        a1.setAge(25);
        Personne p1;
        
        //on peut pas prendre un personne pour en faire un ami 
        p1 = a1;
        a1.prenom= "Xavier";
        a1 = new Ami("Jean", "Dupond",20);
        try {
            p1.setAge(-100);
        }
        catch(Exception e) {
            System.out.println("L'age d'une personne ne peut être négative");
        }
        a1.setAge(-100);
        System.out.println(a1.getAge());
        
    }
    
}
