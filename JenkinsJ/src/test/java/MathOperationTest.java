import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class MathOperationTest {

	int x,y;
	   @BeforeEach
	  public void setUp() throws Exception { 
		  x=4;y=5;
		  System.out.println("before");
	  }
	@DisplayName("Testing the Add Method...")
	@Test
	public void testAdd() {
		System.out.println("Testing add . . . ");
		int result = MathOperation.add(x,y);
		System.out.println(result);
		assertTrue(result == 15);
	}
	@DisplayName("Testing the Sub Method...")
	@Test
	public void testSub() {
		System.out.println("Testing Sub . . . ");
		int result = MathOperation.subtract(x,y);
		System.out.println(result);
		assertTrue(result == -1);
	}

}
