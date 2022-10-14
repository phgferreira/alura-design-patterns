package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    // Construtor com injeção de dependências: repository, services, etc.

    public GeraPedidoHandler(/* Recebe as dependências */) {

    }

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.printf("""
				Pedido salvo com sucesso
				E-Mail enviado com sucesso
				Cliente: %s, valor: %f, quantidade: %d
				""", dados.getCliente(), dados.getValorOrcamento(), dados.getQuantidadeItens());
    }
}
