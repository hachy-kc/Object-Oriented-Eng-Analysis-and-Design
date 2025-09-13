/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab4;

/**
 *
 * @author hndu
 */
public class Main {
    public static void main(String[] args) {
        // Test the stack implementation
        testStack();
    }

    private static void testStack() {
        StackOfDistinctStrings stack = new StackOfDistinctStrings();
        try {
            stack.push("ab");
            stack.push("cd");
            stack.push("ae");
            stack.push("bd");
            stack.push("test");
            stack.push("test2");
            System.out.println("Stack: " + stack);
            System.out.println("Top element: " + stack.pop());
            System.out.println("Stack after popping: " + stack);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

