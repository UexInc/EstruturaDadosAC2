package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import me.javacourse.stack.ArrayStack;
import me.javacourse.stack.EmptyStackException;
import me.javacourse.stack.FullStackException;

class ArrayStackTest {

	/*	2) Desenvolva um projeto no GitHub que estenda a classe de testes do TAD Pilha 
	 	implementado usando array que teste uma pilha de String. */
	
	private static final ArrayStack<String> s = new ArrayStack<String>(5);
	
	@Test
	void pilhaStrings() {
		s.push("Ricardo");
		assertEquals("(Ricardo)", s.toString(), "Deve imprimir (Ricardo)");
		s.push("Willian");
		assertEquals("(Ricardo, Willian)", s.toString(), "Deve imprimir (Ricardo, Willian)");
		assertEquals("Willian", s.top(), "Deve imprimir Willian");
		assertEquals(2, s.size(), "Deve imprimir 2");
		s.push("Gabriel");
		assertEquals("(Ricardo, Willian, Gabriel)", s.toString(), "Deve imprimir (Ricardo, Willian, Gabriel)");
		assertEquals("Gabriel", s.pop(), "Deve imprimir Gabriel");
		assertEquals("Willian", s.pop(), "Deve imprimir Willian");
		assertEquals(false, s.isEmpty(), "Deve imprimir false");
		assertEquals("Ricardo", s.pop(), "Deve imprimir Ricardo");
		assertEquals(0, s.size(), "Deve imprimir 0");
		Assertions.assertThrows(EmptyStackException.class, () -> { s.top(); });
		s.push("Geisa");
		assertEquals("(Geisa)", s.toString(), "Deve imprimir (Geisa)");
		s.push("Raphael");
		assertEquals("(Geisa, Raphael)", s.toString(), "Deve imprimir (Geisa, Raphael)");
		assertEquals("Raphael", s.top(), "Deve imprimir Raphael");
		s.push("Gabriel");
		assertEquals("(Geisa, Raphael, Gabriel)", s.toString(), "Deve imprimir (Geisa, Raphael, Gabriel)");
		assertEquals(3, s.size(), "Deve imprimir 3");
		s.push("Willian");
		assertEquals("(Geisa, Raphael, Gabriel, Willian)", s.toString(), "Deve imprimir (Geisa, Raphael, Gabriel, Willian)");
		s.push("Ricardo");
		assertEquals("(Geisa, Raphael, Gabriel, Willian, Ricardo)", s.toString(), "Deve imprimir (Geisa, Raphael, Gabriel, Willian, Ricardo)");
		assertEquals("Ricardo", s.top(), "Deve imprimir Ricardo");
		Assertions.assertThrows(FullStackException.class, () -> { s.push("XYZ"); });
	}

}
