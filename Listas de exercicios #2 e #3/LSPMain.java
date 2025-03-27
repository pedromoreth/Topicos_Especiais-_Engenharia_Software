abstract class Ave {}

interface Voador {
    void voar();
}

class Aguia extends Ave implements Voador {
    public void voar() {
        System.out.println("A águia está voando!");
    }
}

class Pinguim extends Ave {
    public void nadar() {
        System.out.println("O pinguim está nadando!");
    }
}

public class LSPMain {
    public static void main(String[] args) {
        Voador ave1 = new Aguia();
        ave1.voar();

        Pinguim ave2 = new Pinguim();
        ave2.nadar();
    }
}
