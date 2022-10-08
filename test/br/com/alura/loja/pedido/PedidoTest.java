package br.com.alura.loja.pedido;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PedidoTest {

	@Test @DisplayName("Deve salvar o pedido no Banco de Dados")
	void cenario1() {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("600");
		int quantidadeItens = 4;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);

	}

}
