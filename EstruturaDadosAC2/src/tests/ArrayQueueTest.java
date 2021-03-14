package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import me.javacourse.queue.ArrayQueue;
import me.javacourse.queue.EmptyQueueException;

class ArrayQueueTest {

	/* 8) Crie os testes e implemente o TAD Fila. Use implementação do TAD Pilha como
		exemplo. */
	
	private static final ArrayQueue<Integer> aq = new ArrayQueue<Integer>(5);
	
	@Test
	void integerArrayQueueTest() {
		Assertions.assertThrows(EmptyQueueException.class, () -> { aq.front(); });
		aq.enqueue(3);
		assertEquals("(3)", aq.toString(), "Deve imprimir (3)");
		assertEquals(1, aq.size(), "Deve retornar 1");
		aq.enqueue(8);
		assertEquals("(3, 8)", aq.toString(), "Deve imprimir (3, 8)");
		aq.enqueue(11);
		assertEquals("(3, 8, 11)", aq.toString(), "Deve imprimir (3, 8, 11)");
		assertEquals(false, aq.isEmpty(), "Deve retornar false");
		assertEquals(3, aq.dequeue(), "Deve retornar 3");
		assertEquals("(8, 11)", aq.toString(), "Deve imprimir (8, 11)");
		assertEquals(8, aq.front(), "Deve retornar 8");
		assertEquals(8, aq.dequeue(), "Deve retornar 8");
		aq.enqueue(14);
		assertEquals("(11, 14)", aq.toString(), "Deve imprimir (11, 14)");

//		aq.enqueue(1);
//		assertEquals("(1)", aq.toString(), "Deve imprimir (1)");
//		assertEquals(1, aq.size(), "Deve retornar 1");
//		aq.enqueue(2);
//		assertEquals("(1, 2)", aq.toString(), "Deve imprimir (1, 2)");
//		aq.enqueue(3);
//		assertEquals("(1, 2, 3)", aq.toString(), "Deve imprimir (1, 2, 3)");
//		assertEquals(false, aq.isEmpty(), "Deve retornar false");
//		assertEquals(1, aq.dequeue(), "Deve retornar 1");
//		assertEquals("(2, 3)", aq.toString(), "Deve imprimir (2, 3)");
//		aq.enqueue(4);
//		aq.enqueue(5);
//		assertEquals("(2, 3, 4, 5)", aq.toString(), "Deve imprimir (2, 3, 4, 5)");
//		assertEquals(2, aq.dequeue(), "Deve retornar 2");
//		assertEquals("(3, 4, 5)", aq.toString(), "Deve imprimir (3, 4, 5)");
//		aq.enqueue(6);
//		assertEquals("(3, 4, 5, 6)", aq.toString(), "Deve imprimir (3, 4, 5, 6)");
//		assertEquals(3, aq.dequeue(), "Deve retornar 3");
//		assertEquals(4, aq.dequeue(), "Deve retornar 4");
//		assertEquals("(5, 6)", aq.toString(), "Deve imprimir (5, 6)");
//		System.out.println(aq);
	}

}
