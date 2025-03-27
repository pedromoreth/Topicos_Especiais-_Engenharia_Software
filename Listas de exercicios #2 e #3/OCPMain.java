interface Desconto {
    double aplicarDesconto(double valor);
}

class DescontoComum implements Desconto {
    public double aplicarDesconto(double valor) {
        return valor * 0.95;
    }
}

class DescontoVip implements Desconto {
    public double aplicarDesconto(double valor) {
        return valor * 0.90;
    }
}

class CalculadoraDesconto {
    public double calcular(Desconto desconto, double valor) {
        return desconto.aplicarDesconto(valor);
    }
}

public class OCPMain {
    public static void main(String[] args) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        System.out.println("Desconto Comum: " + calculadora.calcular(new DescontoComum(), 100));
        System.out.println("Desconto VIP: " + calculadora.calcular(new DescontoVip(), 100));
    }
}
