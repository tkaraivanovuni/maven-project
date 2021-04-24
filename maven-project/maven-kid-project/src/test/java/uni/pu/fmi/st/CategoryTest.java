package uni.pu.fmi.st;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CategoryTest {
	
	@Category(SlowTest.class)
	@Test
	public void testSlowTest() {
		assertTrue(true);
	}
	
	@Category(FastTest.class)
	@Test
	public void testFastTest() {
		assertTrue(true);
	}

}
