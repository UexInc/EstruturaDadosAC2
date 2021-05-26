package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import me.javacourse.arraydnode.NodePositionList;
import me.javacourse.arraydnode.Position;

class NodePositionListTest {
	
	@Test
	void invertNodePositionListTest() {
		NodePositionList<Integer> l = new NodePositionList<Integer>();
		assertEquals("[]", l.toString(), "[]");
		l.addFirst(4);
		assertEquals("[4]", l.toString(), "[4]");
		Position<Integer> p1 = l.first();
		assertEquals(4, p1.element(), "4");
		assertEquals("[4]", l.toString(), "[4]");
		l.addAfter(p1, 9);
		assertEquals("[4, 9]", l.toString(), "[4, 9]");
		Position<Integer> p2 = l.next(p1);
		assertEquals(9, p2.element(), "9");
		assertEquals("[4, 9]", l.toString(), "[4, 9]");
		l.addBefore(p2, 6);
		assertEquals("[4, 6, 9]", l.toString(), "[4, 6, 9]");
		Position<Integer> p3 = l.prev(p2);
		assertEquals(6, p3.element(), "6");
		assertEquals("[4, 6, 9]", l.toString(), "[4, 6, 9]");
		l.addFirst(24);
		assertEquals("[24, 4, 6, 9]", l.toString(), "[24, 4, 6, 9]");
		p2 = l.last();
		assertEquals(9, p2.element(), "9");
		assertEquals("[24, 4, 6, 9]", l.toString(), "[24, 4, 6, 9]");
		assertEquals(24, l.remove(l.first()), "24");
		assertEquals("[4, 6, 9]", l.toString(), "[4, 6, 9]");
		assertEquals(6, l.set(p3, 1), "6");
		assertEquals("[4, 1, 9]", l.toString(), "[4, 1, 9]");
		l.addAfter(l.first(), 6);
		assertEquals("[4, 6, 1, 9]", l.toString(), "[4, 6, 1, 9]");
		

		// 11) Implemente um método não recursivo para inverter uma lista de nodos.
		
		l.reverse();
		assertEquals("[9, 1, 6, 4]", l.toString(), "[9, 1, 6, 4]");
		
		/*
		 * 12) Implemente um novo método, makeFirst(p), que move o elemento na posição p
		 * para a primeira posição, mantendo a ordem relativa dos demais elementos
		 * inalterada.
		 */
		
		l.makeFirst(p3);
		assertEquals("[6, 9, 1, 4]", l.toString(), "[6, 9, 1, 4]");
		
		Position<Integer> p4 = l.next(l.first());
		l.makeFirst(p4);
		assertEquals("[9, 6, 1, 4]", l.toString(), "[9, 6, 1, 4]");
		
		Position<Integer> p5 = l.next(l.next(l.first()));
		l.makeFirst(p5);
		assertEquals("[1, 9, 6, 4]", l.toString(), "[1, 9, 6, 4]");
	}

}
