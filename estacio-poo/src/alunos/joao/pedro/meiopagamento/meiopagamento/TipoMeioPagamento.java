package alunos.joao.pedro.meiopagamento.meiopagamento;

public enum TipoMeioPagamento {
    Credito(1, "Cartão de crédito"),
    Debito(2, "Cartão de débito"),
    Pix(3,"Pix");
    public String descricao;
    public int numero;
    TipoMeioPagamento(int numero, String descricao){
       this.descricao = descricao;
       this.numero = numero;
    }

    public TipoMeioPagamento getTipoMeioPagamento(int numero){
        for (TipoMeioPagamento tipo : values()) {
            if (tipo.numero == numero) {
                return tipo;
            }
        }
        return  null;
    }


}
