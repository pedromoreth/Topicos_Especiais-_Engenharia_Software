interface Botao {
    void desenhar();
}

interface Janela {
    void abrir();
}

class BotaoModerno implements Botao {
    public void desenhar() {
        System.out.println("Desenhando botão moderno.");
    }
}

class BotaoClassico implements Botao {
    public void desenhar() {
        System.out.println("Desenhando botão clássico.");
    }
}

class JanelaModerna implements Janela {
    public void abrir() {
        System.out.println("Abrindo janela moderna.");
    }
}

class JanelaClassica implements Janela {
    public void abrir() {
        System.out.println("Abrindo janela clássica.");
    }
}

abstract class FabricaDeComponentes {
    public abstract Botao criarBotao();
    public abstract Janela criarJanela();
}

class FabricaModerna extends FabricaDeComponentes {
    public Botao criarBotao() {
        return new BotaoModerno();
    }

    public Janela criarJanela() {
        return new JanelaModerna();
    }
}

class FabricaClassica extends FabricaDeComponentes {
    public Botao criarBotao() {
        return new BotaoClassico();
    }

    public Janela criarJanela() {
        return new JanelaClassica();
    }
}

public class SistemaInterfaceGrafica {
    public static void main(String[] args) {
        FabricaDeComponentes fabrica = new FabricaModerna();

        Botao botao = fabrica.criarBotao();
        Janela janela = fabrica.criarJanela();

        botao.desenhar();
        janela.abrir();

        System.out.println("---");

        fabrica = new FabricaClassica();
        botao = fabrica.criarBotao();
        janela = fabrica.criarJanela();

        botao.desenhar();
        janela.abrir();
    }
}
