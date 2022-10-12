package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {
	
	protected Desconto desconto;

	public Desconto(Desconto desconto) {
		this.desconto = desconto;
	}
	
	// Esse método abaixo é um template de como os métodos de calculo devem se comportar
	public BigDecimal calcular(Orcamento orcamento) {
		if (deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return desconto.calcular(orcamento);
	}

	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	public abstract Boolean deveAplicar(Orcamento orcamento);
}
