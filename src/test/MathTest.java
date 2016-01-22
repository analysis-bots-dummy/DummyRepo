package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.Math;

public class MathTest{

	@Test
	public void testAddSimple(){
		assertEquals(5, Math.addInt(2,3));
	}

}
