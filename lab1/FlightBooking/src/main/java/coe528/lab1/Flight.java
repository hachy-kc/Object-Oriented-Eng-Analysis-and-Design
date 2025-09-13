/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package coe528.lab1;

/**
 *
 * @author hndu
 */
public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    
    public Flight(int flightNumber,String origin, String destination, String departureTime, int capacity, double originalPrice){
        if (origin.equals(destination)){
            throw new IllegalArgumentException("Origin and Destination cannot the same");
        }
    
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.numberOfSeatsLeft = capacity;
        this.originalPrice = originalPrice;
    
    
  
    }
    
    public int getflightNumber(){
        return flightNumber;
    }
    
    public void setflightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }
    
    public String getorigin(){
        return origin;
    }
    
    public void setorigin(String origin){
        this.origin = origin;        
    }
    
    public String getdestination(){
        return destination;
    }
    
    public void setdestination(String destination){
        this.destination = destination;        
    }
    
    public String getdepartureTime(){
        return departureTime;
    }
    
    public void setdepartureTime(String departureTime){
        this.departureTime = departureTime;        
    }
    
    public int getcapacity(){
        return capacity;
    }
    
    public void setcapacity(int capacity){
        this.capacity = capacity;        
    }
    
    public int getnumberOfSeatsLeft(){
        return numberOfSeatsLeft;
    }
    
    public void setnumberOfSeatsLeft(int numberOfSeatsLeft){
        this.numberOfSeatsLeft = numberOfSeatsLeft;        
    }
    
    public double getoriginalPrice(){
        return originalPrice;
    }
    
    public void setoriginalPrice(double originalPrice){
        this.originalPrice = originalPrice;        
    }
    
    public boolean bookASeat(){
        if(numberOfSeatsLeft > 0){
            numberOfSeatsLeft--;
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Flight " +flightNumber+ ", " +origin+ " to " +destination+ ", " +departureTime+ ", original price: " +originalPrice+ "$";
    }
    
}
