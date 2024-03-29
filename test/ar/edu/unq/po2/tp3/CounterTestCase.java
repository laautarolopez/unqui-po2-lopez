package ar.edu.unq.po2.tp3;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;
 
public class CounterTestCase {    
    private Counter counter;    

    @Before
    public void setUp() throws Exception {
   	 
   	 //Se crea el contador
   	 counter = new Counter();
   	 
   	 //Se agregan los numeros. Un solo par y nueve impares
   	 counter.addNumber(1);
   	 counter.addNumber(3);
   	 counter.addNumber(5);
   	 counter.addNumber(7);
   	 counter.addNumber(9);
   	 counter.addNumber(1);
   	 counter.addNumber(1);
   	 counter.addNumber(1);
   	 counter.addNumber(1);
   	 counter.addNumber(4);
    }
    
    @Test
    public void testEvenNumbers() {
   	 // Getting the even occurrences
   		 int amount = counter.getEvenOcurrences(); 
   	 // I check the amount is the expected one
   		 assertEquals(amount, 1);
   		
    }
    
    @Test
    public void testUnevenNumbers() {
    	int amount = counter.getUnevenOcurrences();
    	assertEquals(amount, 9);
    }
    
}