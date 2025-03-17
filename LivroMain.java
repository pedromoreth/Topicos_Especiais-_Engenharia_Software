class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao);
    }
}

public class LivroMain {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A História do Vasco", "Autor Desconhecido", 1898);
        livro1.exibirInfo();
    }
}
