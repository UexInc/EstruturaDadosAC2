package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import me.javacourse.queue.NodeQueue;
import me.javacourse.queue.EmptyQueueException;

class NodeQueueTest {

	/*
	 * 9) Implemente o TAD Fila com base nos testes e no fragmento de implementação
	 * de duas operações apresentados a seguir (Tarefa 13 - TAD-Fila.pptx, slidese
	 * 19, 20 e 21).
	 */

	private static final NodeQueue<Integer> a = new NodeQueue<Integer>();

	@Test
	void test() throws EmptyQueueException {
		assertThrows(EmptyQueueException.class, () -> { a.front(); });
		assertEquals("[]", a.toString(), "Fila vazia");
		a.enqueue(39);
		assertEquals("[39]", a.toString(), "Deve resultar [39]");
		a.enqueue(45);
		assertEquals("[39, 45]", a.toString(), "Deve resultar [39, 45]");
		assertEquals(39, a.dequeue(), "Deve resultar 39");
		assertEquals(false, a.isEmpty(), "Deve resultar false");
		a.enqueue(69);
		assertEquals("[45, 69]", a.toString(), "Deve resultar [45, 69]");
		a.enqueue(80);
		assertEquals("[45, 69, 80]", a.toString(), "Deve resultar [45, 69, 80]");
		assertEquals(3, a.size(), "Deve resultar 3");
		assertEquals(45, a.dequeue(), "Deve resultar 45");
	}

}
