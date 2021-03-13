package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import me.javacourse.arraylist.ArrayIndexList;

class ArrayListTest {

	// 1) Desenvolva um projeto no GitHub que Implemente os testes o TAD Lista Arranjo.
	
	private static final ArrayIndexList<Integer> l = new ArrayIndexList<Integer>();
	
	@Test
	void integerArrayListTest() {
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> { l.get(2); });
		l.add(0, 3);
		assertEquals("(3)", l.toString(), "Deve imprimir (3)");
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> { l.add(2, 10); });
		l.add(1, 8);
		assertEquals("(3, 8)", l.toString(), "Deve imprimir (3, 8)");
		l.add(2, 11);
		assertEquals("(3, 8, 11)", l.toString(), "Deve imprimir (3, 8, 11)");
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> { l.remove(3); });
		l.remove(1);
		assertEquals("(3, 11)", l.toString(), "Deve imprimir (3, 11)");
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> { l.set(2, 14); });
		assertEquals(11, l.set(1, 14), "Deve retornar 11");
		assertEquals(3, l.get(0), "Deve retornar 3");
	}

}
