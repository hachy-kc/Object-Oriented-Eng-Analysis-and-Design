/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author hndu
 */
public class Ticket {
    
    
    private Passenger passenger;
    private Flight flight;
    private double price;
    private  int number ;
    private static int ticketCounter = 1;
    
    
    public Ticket ( Passenger p, double price,Flight flight ) {
        
        this.passenger = p;
        this.price = price;
        this.flight = flight;
        this.number = ticketCounter;
        ticketCounter++;
    }
    
    
    public Passenger getPassenger(){
        return passenger;
    }
    
    public Flight getFlight(){
        return flight;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getTicketCounter(){
        return number -1 ;      
    }
    
    public int getNumber(){
        return number;
    }
    
    public void setPassenger(Passenger newPassenger){
        passenger = newPassenger;
    }
    
    public void setPrice ( double newPrice){
        price = newPrice;
    }
    
    //public void set
    
    @Override
    public String toString(){
        return this.passenger + ", " + this.flight + ", " + this.flight.getorigin() + "to " + this.flight.getdestination() + ", " + this.flight.getdepartureTime() + ", ticket price: $" + this.price;
    }
    
    
    
}

