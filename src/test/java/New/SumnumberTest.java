package New;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumnumberTest {
private final Sumnumbers obj = new Sumnumbers();
	@Test
	void testSum() {
		assertEquals(6,obj.sum(2, 3));
		
		
	}
	@Test
	void testSumNegative() {
		assertNotEquals(7,obj.sum(2, 3));
	}

}
