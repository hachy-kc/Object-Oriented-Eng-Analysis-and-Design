/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe528.lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lphew01550
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testConstructor() {
        System.out.println("testConstructor");
        Flight test = new Flight( 690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        assertEquals(690, test.getflightNumber());
        assertEquals("Toronto", test.getorigin());
        assertEquals("Ottawa", test.getdestination());
        assertEquals("29/02/77 7:30 pm", test.getdepartureTime());
        assertEquals(100, test.getcapacity());
        assertEquals(600.00, test.getoriginalPrice(), 0.001);
        
    }

    /**
     * Test of getflightNumber method, of class Flight.
     */
    @Test
    public void testGetflightNumber() {
        System.out.println("getflightNumber");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        int expResult = 690;
        int result = test.getflightNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setflightNumber method, of class Flight.
     */
    @Test
    public void testSetflightNumber() {
        System.out.println("setflightNumber");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        test.setflightNumber(700);
        int expResult = 700;
        assertEquals(expResult, test.getflightNumber());
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetcapacity() {
        System.out.println("getcapacity");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        int expResult = 100;
        int result = test.getcapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetcapacity() {
        System.out.println("setcapacity");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        test.setcapacity(200);
        int expResult = 200;
        assertEquals(expResult, test.getcapacity());
    }

    /**
     * Test of getnumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetnumberOfSeatsLeft() {
        System.out.println("getnumberOfSeatsLeft");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        int expResult = 100;
        int result = test.getnumberOfSeatsLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of setnumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetnumberOfSeatsLeft() {
        System.out.println("setnumberOfSeatsLeft");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        test.setnumberOfSeatsLeft(30);
        int expResult = 30;
        assertEquals(expResult, test.getnumberOfSeatsLeft());
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetorigin() {
        System.out.println("getorigin");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        String expResult = "Toronto";
        String result = test.getorigin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetorigin() {
        System.out.println("setorigin");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        test.setorigin("New York");
        String expResult = "New York";
        assertEquals(expResult, test.getorigin());
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetdestination() {
        System.out.println("getdestination");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        String expResult = "Ottawa";
        String result = test.getdestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetdestination() {
        System.out.println("setdestination");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        test.setdestination("Paris");
        String expResult = "Paris";
        assertEquals(expResult, test.getdestination());
    }

    /**
     * Test of getdepartureTime method, of class Flight.
     */
    @Test
    public void testGetdepartureTime() {
        System.out.println("getdepartureTime");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        String expResult = "29/02/77 7:30 pm";
        String result = test.getdepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setdepartureTime method, of class Flight.
     */
    @Test
    public void testSetdepartureTime() {
        System.out.println("setdepartureTime");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        test.setdepartureTime("04/01/98 4:50 pm");
        String expResult = "04/01/98 4:50 pm";
        assertEquals(expResult, test.getdepartureTime());
    }

    /**
     * Test of getoriginalPrice method, of class Flight.
     */
    @Test
    public void testGetoriginalPrice() {
        System.out.println("getoriginalPrice");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        double expResult = 600.00;
        double result = test.getoriginalPrice();
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of setoriginalPrice method, of class Flight.
     */
    @Test
    public void testSetoriginalPrice() {
        System.out.println("setoriginalPrice");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        test.setoriginalPrice(700.00);
        double expResult = 700.00;
        assertEquals(expResult, test.getoriginalPrice(), 0.001);
    }

  

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testbookASeat() {
        System.out.println("bookASeat");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        boolean expResult = true;
        boolean result = test.bookASeat();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testtoString() {
        System.out.println("toString");
        Flight test = new Flight(690, "Toronto", "Ottawa", "29/02/77 7:30 pm", 100, 600.00);
        String expResult = "Flight 690, Toronto to Ottawa, 29/02/77 7:30 pm, original price: 600.0$";
        String result = test.toString();
        assertEquals(expResult, result);
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    /**
     * Test of bookASeat method, of class Flight.
     */
}
