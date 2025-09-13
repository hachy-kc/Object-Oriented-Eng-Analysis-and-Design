/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author hndu
 */
public  abstract class NonMember extends Passenger {
    
    public NonMember (String name, int age){
        super (name, age);
    
    




}//private int yearsOfMembership;
    
 @Override 
    public double applyDiscount(double p) {
        
        if ( age > 65){
            
            return p * 0.9;
        }
        
        else
            return p;
}

}