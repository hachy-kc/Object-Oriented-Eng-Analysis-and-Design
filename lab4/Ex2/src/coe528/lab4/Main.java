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
        // Test the queue implementation
        testQueue();
    }

    
    private static void testQueue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        //queue.enqueue(4545);
        
        
        try {
            int dequeuedElement1 = queue.dequeue(); // 10
            int dequeuedElement2 = queue.dequeue(); // 20
           // int dequeuedElement3 = queue.dequeue();
            // Dequeue all elements from the queue
         //while (!queue.isEmpty()) {
         //  queue.dequeue();
           
         //}
            boolean isEmpty = queue.isEmpty(); // false

            System.out.println("Dequeued element 1: " + dequeuedElement1);
            System.out.println("Dequeued element 2: " + dequeuedElement2);
            System.out.println("Is the queue empty? " + isEmpty);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

