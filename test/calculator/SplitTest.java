package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SplitTest {
	@Test
	public void split() {
		assertArrayEquals(new String[] {"1"}, "1".split(","));
		assertArrayEquals(new String[] {"1", "2"}, "1,2".split(","));
	}
}
