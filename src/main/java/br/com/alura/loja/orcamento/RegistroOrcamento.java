package br.com.alura.loja.orcamento;

import br.com.alura.loja.exception.DomainException;
import br.com.alura.loja.http.HttpAdapter;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

import java.util.HashMap;
import java.util.Map;

public class RegistroOrcamento {

    private HttpAdapter adapter;

    public RegistroOrcamento(HttpAdapter adapter) {
        this.adapter = adapter;
    }

    public void registrar(Orcamento orcamento) {

        if (orcamento.isFinalizado())
            throw new DomainException("Orçamento não foi finalizado ainda");

        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidade", orcamento.getQuantidadeItens()
        );
        adapter.post(url, dados);
        // chamada http para API externa
        // URL Connection
        // Http Client
        // lib Rest
    }

}
