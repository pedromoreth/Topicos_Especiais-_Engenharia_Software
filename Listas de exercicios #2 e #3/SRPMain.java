class GeradorRelatorio {
    public void gerarRelatorio() {
        System.out.println("Gerando relatório...");
    }
}

class SalvarRelatorio {
    public void salvarEmArquivo(String nomeArquivo) {
        System.out.println("Salvando relatório no arquivo: " + nomeArquivo);
    }
}

public class SRPMain {
    public static void main(String[] args) {
        GeradorRelatorio gerador = new GeradorRelatorio();
        SalvarRelatorio salvar = new SalvarRelatorio();

        gerador.gerarRelatorio();
        salvar.salvarEmArquivo("relatorio.txt");
    }
}
