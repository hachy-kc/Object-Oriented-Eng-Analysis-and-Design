/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author hndu
 */
abstract class Passenger {
    
     String name;
    int age;
    
    
    
    public Passenger( String name, int age) {
        
        this.name = name;
        this.age = age;
        
    
    }
    
    
//Getters
    
    
    
    public String getName(){
        
        return name;
    }
    
    
    public int getAge(){
        return age;
    }
    
    
    
  // setters
    
    public void setName ( String newName){
        
        name = newName;
    }
    
    
    public void setAge (int newAge){
        
        age = newAge;
    }
    
    
    public abstract double applyDiscount(double p);
    

    @Override 
public abstract String toString();


    
}
