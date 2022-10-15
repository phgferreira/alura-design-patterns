package br.com.alura.loja.pedido;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PedidoTest {
	
	private ByteArrayOutputStream out;

	@BeforeEach
	public void beforeEach() {
		out = new ByteArrayOutputStream();
		System.setOut( new PrintStream( out ));
	}

	@Test @DisplayName("Deve salvar o pedido no Banco de Dados")
	public void cenario1() {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("600");
		int quantidadeItens = 4;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido())
		);
		handler.execute(gerador);
		
		assertEquals("Salvando pedido no banco de dados" + System.lineSeparator()
				+ "Enviando email com os dados do pedido" + System.lineSeparator()
				, out.toString());
	}

}
