abstract class Instrumento {
    public abstract void tocar();
}

class Violao extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando Violão: Strum strum!");
    }
}

class Piano extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando Piano: Plim plim!");
    }
}

class Bateria extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando Bateria: Bum bum tss!");
    }
}

public class InstrumentoMain {
    public static void main(String[] args) {
        Instrumento violao = new Violao();
        Instrumento piano = new Piano();
        Instrumento bateria = new Bateria();

        violao.tocar();
        piano.tocar();
        bateria.tocar();
    }
}
