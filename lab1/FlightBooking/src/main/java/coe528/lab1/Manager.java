/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hndu
 */
public class Manager {

    // Instance variables to store flights and tickets
    private ArrayList<Flight> flights;
    private ArrayList<Ticket> tickets;

    // Constructor to initialize the ArrayLists
    public Manager() {
        flights = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    // Method to create new flights
    public void createFlights() {
        Scanner scan = new Scanner(System.in);

        // Collect information for a new flight from the user
        System.out.println("Enter the flight number:");
        int flightNum = scan.nextInt();

        System.out.println("Enter the flight's capacity:");
        int cap = scan.nextInt();

        scan.nextLine(); // Consume the newline character

        System.out.println("Enter the flight's origin:");
        String origin = scan.nextLine();

        System.out.println("Enter the flight's destination:");
        String des = scan.nextLine();

        System.out.println("Enter the flight's departure time:");
        String depTime = scan.nextLine();

        System.out.println("Enter the flight's original price:");
        double origPrice = scan.nextDouble();

        // Create a new Flight object and add it to the flights ArrayList
        Flight f = new Flight(flightNum, origin, des, depTime, cap, origPrice);
        flights.add(f);

        System.out.println("The flight has been created:");
        System.out.println(f);
    }

    // Method to display available flights based on origin and destination
    public void displayAvailableFlights(String origin, String destination) {
        System.out.println("List of available flights:");

        // Iterate through the flights ArrayList
        for (Flight flight : flights) {
            // Check if the flight meets the criteria and has available seats
            if (flight.getorigin().equals(origin)
                    && flight.getdestination().equals(destination)
                    && flight.getnumberOfSeatsLeft() > 0) {
                System.out.println(flight);
            }
        }
    }

    // Method to retrieve a Flight object based on the flight number
    public Flight getFlight(int flightNumber) {
        for (Flight flight : flights) {
            if (flightNumber == flight.getflightNumber()) {
                return flight;
            }
        }
        return null;
    }

    // Method to book a seat for a passenger on a given flight
    public void bookSeat(int flightNumber, Passenger p) {
        for (Flight flight : flights) {
            if (flightNumber == flight.getflightNumber()) {
                if (flight.bookASeat()) {
                    // Calculate the discounted price based on passenger type
                    double price = p.applyDiscount(flight.getoriginalPrice());
                    // Create a new Ticket object and add it to the tickets ArrayList
                    Ticket t = new Ticket(p, price, flight);
                    tickets.add(t);
                    System.out.println("A seat has been booked for your flight " + flightNumber);
                } else {
                    System.out.println("Sorry, the flight is full.");
                }
                return; // Exit the loop since the flight is found
            }
        }
        System.out.println("This flight does not exist.");
    }

    // Main method for testing the Manager class
    public static void main(String[] args) {
        Manager m = new Manager();
        Scanner scan = new Scanner(System.in);

        int user;
        do {
            // Display menu options to the user
            System.out.println("1. Create a new flight");
            System.out.println("2. Display available flights");
            System.out.println("3. Get flight information");
            System.out.println("4. Book a seat");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            user = scan.nextInt();

            switch (user) {
                case 1:
                    m.createFlights();
                    break;
                case 2:
                    scan.nextLine(); // Consume the newline character
                    System.out.println("Enter the flight's origin:");
                    String origin = scan.nextLine();
                    System.out.println("Enter the flight's destination:");
                    String destination = scan.nextLine();
                    m.displayAvailableFlights(origin, destination);
                    break;
                case 3:
                    System.out.println("Enter the flight number:");
                    int flightNum = scan.nextInt();
                    Flight f = m.getFlight(flightNum);
                    if (f == null) {
                        System.out.println("Unfortunately flight " + flightNum + " does not exist");
                    } else {
                        System.out.println("Info for Flight " + flightNum + ":");
                        System.out.println(f);
                    }
                    break;
                case 4:
                    scan.nextLine(); // Consume the newline character
                    System.out.println("Enter 'n' if you are a non-member passenger and 'm' if you are a member:");
                    String input = scan.nextLine();
                    System.out.println("Enter the passenger's name:");
                    String name = scan.nextLine();
                    System.out.println("Enter the passenger's age:");
                    int age = scan.nextInt();
                    System.out.println("Enter the flight number:");
                    int flightNumber = scan.nextInt();

                    if (input.equals("n")) {
                        Passenger p = new NonMember(name, age) {
                            @Override
                            public String toString() {
                                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                            }
                        };
                        m.bookSeat(flightNumber, p);
                    } else if (input.equals("m")) {
                        System.out.println("Enter years of membership:");
                        int years = scan.nextInt();
                        Passenger p = new Member(name, age, years);
                        m.bookSeat(flightNumber, p);
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Invalid option entered!");
            }

        } while (user != 5);
    }
}
