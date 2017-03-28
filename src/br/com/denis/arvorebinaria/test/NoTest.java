package br.com.denis.arvorebinaria.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.denis.arvorebinaria.No;

public class NoTest {
	
	private No arvore;

	@Before
	public void setUp() throws Exception {
		arvore = new No();
		arvore.incluirNoEmArvore(9);
		arvore.incluirNoEmArvore(2);
		arvore.incluirNoEmArvore(13);
		arvore.incluirNoEmArvore(6);
	}

	@Test
	public void testIncluirNoRaizEmArvoreInt() {
		assertEquals(9, arvore.getRaiz().getValor());
	}
	
	@Test
	public void testIncluirNoEsquerdaRaizEmArvoreInt() {
		assertEquals(2, arvore.getRaiz().getEsquerdo().getValor());
	}
	
	@Test
	public void testIncluirNoDireitaRaizEmArvoreInt() {
		assertEquals(13, arvore.getRaiz().getDireito().getValor());
	}
	
	@Test
	public void testDirecaoEsquedaInserirNoDireitaArvoreInt() {
		assertEquals(6, arvore.getRaiz().getEsquerdo().getDireito().getValor());
	}

}
