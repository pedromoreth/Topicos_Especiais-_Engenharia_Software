class Endereco {
    private String rua;
    private String cidade;
    private String cep;

    public Endereco(String rua, String cidade, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String exibirEndereco() {
        return rua + ", " + cidade + ", CEP: " + cep;
    }
}

class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + ", Endereço: " + endereco.exibirEndereco());
    }
}

public class EnderecoMain {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("São Januário", "Rio de Janeiro", "20921-060");
        Pessoa pessoa2 = new Pessoa("Torcedor Vascaíno", endereco1);
        pessoa2.exibirDados();
    }
}
