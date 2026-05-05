package solicitacoes.joao.pedro.meiopagamento.meiopagamento;

import java.util.Map;

public class Caixa {
    private final static Map<TipoMeioPagamento, MeioPagamento> listaComMeiosPagamento = Map.of(
            TipoMeioPagamento.Credito, new CartaoCredito(),
            TipoMeioPagamento.Debito, new CartaoDebito(),
            TipoMeioPagamento.Pix, new Pix()
    );

    public void pagar(TipoMeioPagamento meioPagamento, double valor){
        System.out.println("Pagamento selecionado: "+ meioPagamento.descricao);
        listaComMeiosPagamento.get(meioPagamento).pagar(valor);
        System.out.println("------------------------------------------------------------------------");

    }

}
