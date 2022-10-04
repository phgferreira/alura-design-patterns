package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {
	
	protected Desconto desconto;

	public Desconto(Desconto desconto) {
		this.desconto = desconto;
	}
	
	public abstract BigDecimal calcular(Orcamento orcamento);
}
