package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private Integer quantidadeItens;

	public GeraPedido(String cliente, BigDecimal valorOrcamento, Integer quantidadeItens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
	}
	
	public void executa() {
		Orcamento orcamento = new Orcamento(valorOrcamento, quantidadeItens);
		
		Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);

		System.out.printf("""
				Pedido salvo com sucesso
				E-Mail enviado com sucesso
				Cliente: %s, valor: %f, quantidade: %d
				""", cliente, valorOrcamento, quantidadeItens);
	}
}
