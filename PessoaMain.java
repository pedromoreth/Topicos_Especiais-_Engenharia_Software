class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = 0;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    public int getIdade() {
        return idade;
    }
}

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Roberto Dinamite");
        pessoa1.setIdade(68);
        System.out.println("Nome: " + pessoa1.getIdade() + ", Idade: " + pessoa1.getIdade());
    }
}
