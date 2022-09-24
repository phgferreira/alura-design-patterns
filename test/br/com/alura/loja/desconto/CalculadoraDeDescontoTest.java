package br.com.alura.loja.desconto;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.loja.orcamento.Orcamento;

class CalculadoraDeDescontoTest {

	private Orcamento orcamento;
	private CalculadoraDeDesconto calculadora;
	
	@BeforeEach
	void beforeEach() {
		calculadora = new CalculadoraDeDesconto();
	}
	
	@Test
	void DeveriaCalcularDezPorcentoDeImpostoEmOrcamentosComMaisDeCincoItens() {
		orcamento = new Orcamento( new BigDecimal("100"), 6);
		calculadora.calcular(orcamento);
		assertEquals(new BigDecimal("90"), orcamento.getValor());
	}

}
