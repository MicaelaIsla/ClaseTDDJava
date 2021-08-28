import static org.junit.Assert.*;

import org.junit.Test;

import factorial.Factorial;

public class FactorialTest {

	@Test
	public void cero() {
		assertEquals (1, Factorial.de(0));	
	}
	
	@Test
	public void naturales() {
	assertEquals (1, Factorial.de(1));	
	assertEquals (2, Factorial.de(2));	
	assertEquals (6, Factorial.de(3));	
	assertEquals (24, Factorial.de(4));	
	assertEquals (120, Factorial.de(5));	
	assertEquals (720, Factorial.de(6));	
	}

	@Test(expected=Error.class)
	public void negativos () {
		Factorial.de(-1);
	}
}
