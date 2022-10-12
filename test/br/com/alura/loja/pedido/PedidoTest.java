package br.com.alura.loja.pedido;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

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
		gerador.executa();
		
		assertEquals("""
				Pedido salvo com sucesso
				E-Mail enviado com sucesso
				Cliente: Ana da Silva, valor: 600,000000, quantidade: 4
				""", out.toString());
	}

}
