package br.com.alura.loja.desconto;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.loja.orcamento.Orcamento;

class CalculadoraDeDescontoTest {

	private Orcamento orcamento;
	private CalculadoraDeDesconto calculadoraDeDesconto;
	
	@BeforeEach
	void beforeEach() {
		calculadoraDeDesconto = new CalculadoraDeDesconto();
	}
	
	@Test
	void DeveriaCalcularDezPorcentoDeImpostoEmOrcamentosComMaisDeCincoItens() {
		orcamento = new Orcamento( new BigDecimal("100"), 6);
		assertEquals(new BigDecimal("10.0"), calculadoraDeDesconto.calcular(orcamento));
	}

}
