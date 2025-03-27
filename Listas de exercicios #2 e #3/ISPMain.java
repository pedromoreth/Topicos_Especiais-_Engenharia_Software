interface Programador {
    void programar();
}

interface Atendente {
    void atenderCliente();
}

class Desenvolvedor implements Programador {
    public void programar() {
        System.out.println("Escrevendo código...");
    }
}

class Suporte implements Atendente {
    public void atenderCliente() {
        System.out.println("Atendendo cliente...");
    }
}

public class ISPMain {
    public static void main(String[] args) {
        Programador dev = new Desenvolvedor();
        Atendente suporte = new Suporte();

        dev.programar();
        suporte.atenderCliente();
    }
}
