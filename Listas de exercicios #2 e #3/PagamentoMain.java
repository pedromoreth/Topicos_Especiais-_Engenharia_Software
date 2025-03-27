interface Pagamento {
    void processarPagamento();
}

class PagamentoCartao implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Cartão de Crédito processado.");
    }
}

class PagamentoBoleto implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Boleto Bancário processado.");
    }
}

class PagamentoPix implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Pix processado.");
    }
}

public class PagamentoMain {
    public static void main(String[] args) {
        Pagamento cartao = new PagamentoCartao();
        Pagamento boleto = new PagamentoBoleto();
        Pagamento pix = new PagamentoPix();

        cartao.processarPagamento();
        boleto.processarPagamento();
        pix.processarPagamento();
    }
}
