package solicitacoes.joao.pedro.meiopagamento.meiopagamento;

public class CartaoDebito extends MeioPagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagando com desconto de 10%%, valor R$%.2f\n", valor - valor * 0.1);
    }
}
