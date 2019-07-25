/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jeudi25.personne;

import com.mycompany.jeudi25.personne.Personne;
import java.util.ArrayList;

/**
 *
 * @author Administrateur
 */
public class Ami extends Personne {
     
    public String prenom;
    public ArrayList<String> hobbies;
    
    
    public Ami() throws Exception{
        super("ami inconnu",0);
    }
    
    public Ami(String prenom, String nom, int age) throws Exception {
        //constructeur parent
        super(nom, age);
        
        this.prenom = prenom;
        hobbies = new ArrayList<>();
    }
    
    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void Appeler() {
        System.out.println("Methode appeler d'ami");
    }
    
    
}
