package alunos.joao.pedro.meiopagamento;

import alunos.joao.pedro.meiopagamento.meiopagamento.TipoMeioPagamento;
import alunos.joao.pedro.meiopagamento.meiopagamento.Caixa;

import java.util.HashMap;
import java.util.Map;

public class Carrinho {
    private Map<Produto, Integer> produtos = new HashMap<>();
    private TipoMeioPagamento meioPagamento;
    private double valorTotal = 0;

    public Carrinho(TipoMeioPagamento meioPagamento) {
        this.meioPagamento = meioPagamento;
    }

    public void addProduto(Produto produto, int quantidade){
        if(produtos.containsKey(produto)){
            this.produtos.put(produto, produtos.get(produto) + quantidade);
        }else{
            this.produtos.put(produto, quantidade);
        }
        this.valorTotal += produto.getValor() * quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void checkout(Caixa caixa, Produto p){
        gerarPedido(p);
        caixa.pagar(this.meioPagamento, this.valorTotal);
    }

    private void gerarPedido(Produto p){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("--------------------------DESCRIÇÃO DO PEDIDO---------------------------");
        System.out.println("------------------------------------------------------------------------");
        this.produtos
                .forEach((k,v) -> {
            System.out.printf("Produto: %s, quantidade: %d, valor unitário: R$%.2f, valor total R$%.2f\n", k.getNome(), v, k.getValor(), k.getValor() * v);
        });
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("Valor total da compra sem desconto R$%.2f \n", this.valorTotal);
        System.out.println("------------------------------------------------------------------------");
    }
}
