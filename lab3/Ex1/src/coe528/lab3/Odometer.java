/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author hndu
 */
public class Odometer {
    private Counter[] digits;

    public Odometer(int size) {
        if (size < 1) throw new IllegalArgumentException("Size must be at least 1");

        digits = new Counter[size];
        for (int i = size - 1; i >= 0; i--) {
            if (i == size - 1) {
                digits[i] = new DigitCounter();
            } else {
                digits[i] = new LinkedDigitCounter(digits[i + 1]);
            }
        }
    }

    public void increment() {
        digits[0].increment();
    }

    public void decrement() {
        digits[0].decrement();
    }

    public void reset() {
        for (Counter digit : digits) {
            digit.reset();
        }
    }

    public String count() {
    StringBuilder sb = new StringBuilder();
    for (int i = digits.length - 1; i >= 0; i--) {
        sb.append(digits[i].count());
    }
    return sb.toString();
}

}
