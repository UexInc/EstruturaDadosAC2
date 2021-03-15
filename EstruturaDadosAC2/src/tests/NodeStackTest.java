package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import me.javacourse.stack.EmptyStackException;
import me.javacourse.stack.NodeStack;

class NodeStackTest {

	// 3) Desenvolva um projeto no GitHub que implemente os testes do TAD Pilha usando LSE.
	
	private static NodeStack<Character> ns = new NodeStack<Character>();
	
	@Test
	void characterNodeStackTest() {
		ns.push('E');
		assertEquals("[E]", ns.toString(), "Deve imprimir [E]");
		assertEquals('E', ns.pop(), "Deve retornar E");
		Assertions.assertThrows(EmptyStackException.class, () -> { ns.top(); });
		ns.push('X');
		assertEquals("[X]", ns.toString(), "Deve imprimir [X]");
		assertEquals(false, ns.isEmpty(), "Deve retornar false");
		ns.push('P');
		assertEquals("[P, X]", ns.toString(), "Deve imprimir [P, X]");
		ns.push('T');
		assertEquals("[T, P, X]", ns.toString(), "Deve imprimir [T, P, X]");
		ns.push('O');
		assertEquals("[O, T, P, X]", ns.toString(), "Deve imprimir [O, T, P, X]");
		assertEquals('O', ns.top(), "Deve retornar O");
		assertEquals('O', ns.pop(), "Deve retornar O");
		// 4) b. Inverta os dados de um arranjo usando o TAD Pilha usando LSE.
        	ns = ns.reverseList();
        	assertEquals("[X, P, T]", ns.toString(), "Deve imprimir [X, P, T]");
	}
}
