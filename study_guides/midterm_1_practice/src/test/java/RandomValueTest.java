
import static org.junit.Assert.*;

import org.junit.*;
import org.mockito.*;
import java.util.Random;

public class RandomValueTest {
	RandomValue value;
	Random random;

	@Before
	public void setUp() {
		random = Mockito.mock(Random.class);
		value = new RandomValue(random);
	}
	
	@Test
	public void testIncValNone() {
		assertEquals(0, value.getVal());
	}
	
	@Test
	public void testIncValOnce() {
		Mockito.when(random.nextInt(2)).thenReturn(1);
		value.incVal();
		assertEquals(1, value.getVal());
	}

	@Test
	public void testIncValTwice() {
		Mockito.when(random.nextInt(2)).thenReturn(1);
		value.incVal();
		value.incVal();
		assertEquals(2, value.getVal());
	}
}
