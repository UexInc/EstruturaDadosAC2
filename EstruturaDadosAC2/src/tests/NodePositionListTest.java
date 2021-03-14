package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import me.javacourse.arraydnode.NodePositionList;
import me.javacourse.arraydnode.Position;

class NodePositionListTest {

	// 11) Implemente um método não recursivo para inverter uma lista de nodos.
	/*
	 * 12) Implemente um novo método, makeFirst(p), que move o elemento na posição p
	 * para a primeira posição, mantendo a ordem relativa dos demais elementos
	 * inalterada.
	 */
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
		l.makeFirst(p3);
		assertEquals("[1, 4, 6, 9]", l.toString(), "[1, 4, 6, 9]");
		Position<Integer> p4 = l.next(l.first());
		l.makeFirst(p4);
		assertEquals("[4, 1, 6, 9]", l.toString(), "[4, 1, 6, 9]");
		Position<Integer> p5 = l.next(l.next(l.first()));
		l.makeFirst(p5);
		assertEquals("[6, 4, 1, 9]", l.toString(), "[6, 4, 1, 9]");
	}

	/*
	 * 13) A implementação de NodePositionList não faz verificações de erro para
	 * testar se uma dada posição p é realmente membro dessa lista em particular.
	 * 
	 * a. Por exemplo, se p é uma posição da lista S, a execução T.addAfter(p,e)
	 * deveria lançar a exceção InvalidPositionException pois p não é uma posição de
	 * T.
	 * 
	 * b. Descreva como alterar a implementação de NodePositionList de uma forma
	 * eficiente que impeça esses maus usos.
	 */

	@Test
	void checkPositionInList() {
		
	}

}
