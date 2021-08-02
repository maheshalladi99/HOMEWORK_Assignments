package Testingpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTestone {

	@Test
	void addtest() {
		
		Testing1 one= new Testing1();
		int result=one.sub(54,1);
		String s="mahesh";
		String s2="mahesh";
		assertEquals(s,s2);
		assertSame(s,s2);
		assertNotSame(s,s2);
		assertNotNull(s);
		assertNull(s2);
	}

}
