package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.Math;

public class MathTest2{

	@Test
	public void testAddComplex(){
		assertEquals(559674, Math.addInt(2456456,345645645));
	}
	
	@Test
	public void testAddSimple2(){
		assertEquals(5, Math.addInt(2,3));
	}

}
