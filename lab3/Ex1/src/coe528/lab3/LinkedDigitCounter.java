/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author hndu
 */
public class LinkedDigitCounter extends AbstractCounter {
    private Counter leftNeighbor;

    public LinkedDigitCounter(Counter leftNeighbor) {
        super(0); // Initialize with 0
        this.leftNeighbor = leftNeighbor;
    }

    @Override
    public void increment() {
        value = (value + 1) % 10;
        if (value == 0 && leftNeighbor != null) {
            leftNeighbor.increment();
        }
    }

    @Override
    public void decrement() {
        if (value == 0 && leftNeighbor != null) {
            leftNeighbor.decrement();
        }
        value = (value + 9) % 10; // Wrap-around decrement
    }

    @Override
    public String count() {
        return String.valueOf(value);
    }
}
