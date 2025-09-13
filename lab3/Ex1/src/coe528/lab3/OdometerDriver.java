/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author hndu
 */
import java.util.Scanner;

public class OdometerDriver {
    public static void main(String[] args){
        try{
            // Read number of digits for odometer from console
            System.out.print("Enter number of digits for odometer: ");
            Scanner s = new Scanner(System.in);
            int numOfDigits = s.nextInt();

            Odometer odometer = new Odometer(numOfDigits);

            // Increment 130 times and print the count.
            for (int i = 0; i < 130; ++i) {
                odometer.increment();
            }
            System.out.println(odometer.count());

            // Decrement 31 times and print the count.
            for (int i = 0; i < 31; ++i){
                odometer.decrement();
            }
            System.out.println(odometer.count());

            // Increment 1001 times and print the count.
            for (int i = 0; i < 1001; ++i){
                odometer.increment();
            }
            System.out.println(odometer.count());

            // Decrement 1101 times and print the count.
            for (int i = 0; i < 1101; ++i){
                odometer.decrement();
            }
            System.out.println(odometer.count());

            // Reset the odometer and print the count.
            odometer.reset();
            System.out.println(odometer.count());

            // Decrement once and print the count.
            odometer.decrement();
            System.out.println(odometer.count());

            // Increment once and print the count.
            odometer.increment();
            System.out.println(odometer.count());
        } catch(IllegalArgumentException ex){
            System.out.println("Number of digits in odometer must be at least 1");
        }
    }
}
