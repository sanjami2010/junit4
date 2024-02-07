package junit4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class HahSet {

	@Test
	public void add() {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		assertEquals(4, set.size());
	}

	@Test
	public void remove() {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.remove(3);
		assertEquals(2, set.size());
	}

	@Test
	public void removeall() {
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(3);
		set1.removeAll(set2);
		assertEquals(2, set1.size());
	}
}
