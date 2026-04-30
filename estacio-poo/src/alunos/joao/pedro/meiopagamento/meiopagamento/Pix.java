package alunos.joao.pedro.meiopagamento.meiopagamento;

public class Pix extends MeioPagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagando com desconto de 15%%, valor R$ %.2f\n", valor - valor * 0.15);
    }
}
