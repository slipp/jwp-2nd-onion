package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SplitTest {

	@Test
	public void split() {
		String[] values = "1".split(",");
		assertArrayEquals(new String[] {"1"}, values);
		
		values = "1,2".split(",");
		assertArrayEquals(new String[] {"1", "2"}, values);
	}

}
