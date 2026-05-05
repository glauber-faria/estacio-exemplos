package solicitacoes.joao.pedro.meiopagamento.meiopagamento;

public abstract class MeioPagamento {
    public void pagar(double valor){
        System.out.printf("Pagamento sem desconto, valor R$%.2f \n", valor);
    }
}
