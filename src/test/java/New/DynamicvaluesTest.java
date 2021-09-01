package New;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)

class DynamicvaluesTest {
	private static Sumnumbers obj;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("in the beginning");
		obj =new Sumnumbers();
	}


	

	 @TestFactory
	public Stream<DynamicTest>testAdditions(){
	int[][]data =new int[][] {{1,2,3},{5,3,7},{6,7,9}};
	return Arrays.stream(data).map(entry->{
			int a =entry[0];
			int b=entry[1];
			return dynamicTest(a + "+" +b +"=" +sum,()->{ assertEquals(sum,obj.sum(a, b));
		}};
	}};
}
}