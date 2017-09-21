package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		MyInteger num1 = new MyInteger(12);
		MyInteger num2 = new MyInteger(13);
		
		
		assertTrue(num1.isEven());
		assertFalse(num1.isOdd());
		assertFalse(num1.isPrime());
		
		
		assertTrue(MyInteger.isEven(12));
		assertFalse(MyInteger.isOdd(250));
		assertFalse(MyInteger.isPrime(16));
		
		
		assertTrue(MyInteger.isEven(num1));
		assertFalse(MyInteger.isOdd(num1));
		assertFalse(MyInteger.isPrime(num1));
		
		
		assertTrue(num1.equals(12));
		assertFalse(num1.equals(2222));
		assertTrue(num1.equals(num1));
		assertFalse(num1.equals(num2));
		
		
		
		assertTrue(num2.isOdd());
		assertFalse(num2.isEven());
		assertTrue(num2.isPrime());
		
		assertTrue(num2.equals(13));
		assertFalse(num2.equals(1111));
		
		assertTrue(num2.equals(num2));
		assertFalse(num2.equals(num1));
		
		
	}

}