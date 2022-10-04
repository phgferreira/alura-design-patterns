package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto{

	public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto desconto) {
		super(desconto);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0)
			return orcamento.getValor().multiply( new BigDecimal("0.05") );
			
		return desconto.calcular(orcamento);
	}
	
}
