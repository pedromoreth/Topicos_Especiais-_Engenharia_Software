interface Cadeira {
    void sentar();
}

interface Sofa {
    void deitar();
}

interface MesaDeCentro {
    void usar();
}

class CadeiraModerna implements Cadeira {
    public void sentar() {
        System.out.println("Sentando em uma cadeira moderna.");
    }
}

class SofaModerno implements Sofa {
    public void deitar() {
        System.out.println("Deitando em um sofá moderno.");
    }
}

class MesaDeCentroModerna implements MesaDeCentro {
    public void usar() {
        System.out.println("Usando uma mesa de centro moderna.");
    }
}

class CadeiraClassica implements Cadeira {
    public void sentar() {
        System.out.println("Sentando em uma cadeira clássica.");
    }
}

class SofaClassico implements Sofa {
    public void deitar() {
        System.out.println("Deitando em um sofá clássico.");
    }
}

class MesaDeCentroClassica implements MesaDeCentro {
    public void usar() {
        System.out.println("Usando uma mesa de centro clássica.");
    }
}

interface FabricaDeMoveis {
    Cadeira criarCadeira();
    Sofa criarSofa();
    MesaDeCentro criarMesaDeCentro();
}

class FabricaModerna implements FabricaDeMoveis {
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }
    public Sofa criarSofa() {
        return new SofaModerno();
    }
    public MesaDeCentro criarMesaDeCentro() {
        return new MesaDeCentroModerna();
    }
}

class FabricaClassica implements FabricaDeMoveis {
    public Cadeira criarCadeira() {
        return new CadeiraClassica();
    }
    public Sofa criarSofa() {
        return new SofaClassico();
    }
    public MesaDeCentro criarMesaDeCentro() {
        return new MesaDeCentroClassica();
    }
}

public class LojaDeMoveis {
    public static void main(String[] args) {
        FabricaDeMoveis fabrica = new FabricaModerna();
        Cadeira cadeira = fabrica.criarCadeira();
        Sofa sofa = fabrica.criarSofa();
        MesaDeCentro mesa = fabrica.criarMesaDeCentro();

        cadeira.sentar();
        sofa.deitar();
        mesa.usar();

        System.out.println("---");

        fabrica = new FabricaClassica();
        cadeira = fabrica.criarCadeira();
        sofa = fabrica.criarSofa();
        mesa = fabrica.criarMesaDeCentro();

        cadeira.sentar();
        sofa.deitar();
        mesa.usar();
    }
}
