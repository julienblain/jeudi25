/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jeudi25.personne;

public class Personne {
    static private int nombre =0;
    final private int MAJEUR = 18;
    public String nom;
    protected int age;
    private String tel;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    Civilite politesse;
    
    public Personne(String nom, int age) throws Exception{
        setAge(age);
        this.nom = nom;
        ++nombre;
    }
    
    public Personne(Civilite c,String nom, int age) throws Exception{
        setAge(age);
        this.nom = nom; 
        ++nombre;
        this.politesse = c;
    }

    public Personne() {
        nom="anonyme";
        age=0;
        ++nombre;
    }
    
    public static  int getNombre() {
        return nombre;
    }
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) throws Exception {
        if(age<0) {
            //System.out.println("Un age négatif n'existe pas");
           // return;
            throw new Exception("age négatif");  
        }
        this.age = age;
    }
    
    public boolean setMajeur() {
        return age >= MAJEUR;
    }
    
    private String prenom;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(nom);
        sb.append(", age : ");
        sb.append(getAge());
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }      
     public int exemple(int i) {
        ++i;
        return i;
    }
    
    public void RAZ (int [] table) {
        for (int i=0; i<table.length; ++i) {
            table[i] =i;
        }
        table = new int[10];
        System.out.println(table.length);
        return;
    }
    
    public void AjouteFormation(String Sujet, int nbJour) {
        System.out.println(nom + " a suivi la formation "+ Sujet+ " d'une duréee de jours de : "+nbJour); 
    }
    
    public void AjouteFormation(String Sujet) {
        System.out.println(nom + " a suivi la formation "+ Sujet );
    }
    
    int somme (int... v){
        int somme = 0;
        for (int i = 0; i<v.length; ++i){
            somme += v[i];
        }
        return somme;
    }
    
    public void close() {
        --nombre; //decremente quand l'objet est detruit
    }
    
    enum Civilite {
        MADAME, MONSIEUR
    }
}
