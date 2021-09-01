package New;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;



class TestSum {
	private static Sumnumbers obj;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		obj=new Sumnumbers();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		obj=null;
		System.out.println("at the end");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("at the end");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each test");
	}

	@RepeatedTest(10)
	void testError() {
		Exception exception=assertThrows(IllegalArgumentException.class, ()->obj.sum(12, 3));
		assertEquals("value should be less than 10",exception.getMessage());
	}

}
