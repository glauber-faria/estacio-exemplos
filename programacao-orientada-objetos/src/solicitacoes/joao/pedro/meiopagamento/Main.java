package solicitacoes.joao.pedro.meiopagamento;

import solicitacoes.joao.pedro.meiopagamento.meiopagamento.Caixa;
import solicitacoes.joao.pedro.meiopagamento.meiopagamento.TipoMeioPagamento;

public class Main {
    public static void main(String[] args) {
        Caixa c1 = new Caixa();

        Produto camisa1 = new Produto(1,"Camisa Preta G", "Camisa Preta tamanho G", 50);
        Produto camisa2 = new Produto(2,"Camisa Preta M", "Camisa Preta tamanho M", 40);

        Carrinho carrinho = new Carrinho(TipoMeioPagamento.Pix);
        carrinho.addProduto(camisa1, 2);
        carrinho.addProduto(camisa2, 1);
        carrinho.addProduto(camisa1, 1);
        carrinho.checkout(c1, camisa1);


    }
}
