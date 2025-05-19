interface TomadaNova {
    void conectarNovoPino();
}

class TomadaAntiga {
    public void conectarPinoRedondo() {
        System.out.println("Conectado usando pino redondo (Tomada Antiga).");
    }
}

class AdaptadorTomada implements TomadaNova {
    private TomadaAntiga tomadaAntiga;

    public AdaptadorTomada(TomadaAntiga tomadaAntiga) {
        this.tomadaAntiga = tomadaAntiga;
    }

    public void conectarNovoPino() {
        tomadaAntiga.conectarPinoRedondo();
    }
}

public class Aplicacao {
    public static void main(String[] args) {
        TomadaNova tomada = new AdaptadorTomada(new TomadaAntiga());
        tomada.conectarNovoPino();
    }
}
