package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDesconto {

	public BigDecimal calcular(Orcamento orcamento) {
		// Isso abaixo é a cadeia de descontos, ou corrente de desconto
		Desconto desconto = 
				new DescontoParaOrcamentoComMaisDeCincoItens(
						new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
								new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}
}
