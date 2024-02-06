package junit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
	private ArrayList<String> list = new ArrayList<String>();

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testInsertion() {

		list.add("John Doe");
		assertEquals("John Doe", list.get(0));
		list.add("Jane Doe");
		list.add("Derick");
		assertEquals("Derick", list.get(list.size() - 1));
	}

	@Test
	public void testDeletion() {
		list.clear();
		assertTrue(list.isEmpty());
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		assertEquals(4, list.size());
	}

}
