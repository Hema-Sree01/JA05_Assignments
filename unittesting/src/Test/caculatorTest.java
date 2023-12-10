package Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import calsi.caculator;
class caculatorTest {

	@Test
	void testAdd() {
		caculator cal = new caculator();

		int actual = cal.add(5,4);	

		assertEquals(9, actual);

		//assertNotNull(cal);

		
	}

	@Test
	void testSub() {
		caculator cal = new caculator();

		int actual = cal.sub(5,5);	

		assertEquals(0, actual);

		assertNotEquals(1, actual);

	}

}
