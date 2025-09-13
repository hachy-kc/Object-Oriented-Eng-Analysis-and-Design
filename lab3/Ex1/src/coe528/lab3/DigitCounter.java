/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author hndu
 */
public class DigitCounter extends AbstractCounter {
    public DigitCounter() {
        super(0); // Initialize with 0
    }

    @Override
    public void increment() {
        value = (value + 1) % 10;
    }

    @Override
    public void decrement() {
        value = (value + 9) % 10; // Equivalent to decrementing with wrap-around
    }

    @Override
    public String count() {
        return String.valueOf(value);
    }
}
