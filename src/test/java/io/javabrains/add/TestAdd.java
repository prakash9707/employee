package io.javabrains.add;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class TestAdd {

	Add addobj = new Add();
	@Test
	public void add() {
		int sum = addobj.add(1, 2);
		assertEquals(sum, 3);
		
	}
	
	@Test
	public void adds() {
		int sum = addobj.add(1, 1);
		assertEquals(sum, 2);
	}

}
