abstract class Funcionario {
    public abstract double calcularSalario();
}

class Tecnico extends Funcionario {
    @Override
    public double calcularSalario() {
        return 100000.00;
    }
}

class Jogador extends Funcionario {
    @Override
    public double calcularSalario() {
        return 500000.00;
    }
}

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario tecnico = new Tecnico();
        Funcionario jogador = new Jogador();

        System.out.println("Salário do Técnico: R$" + tecnico.calcularSalario());
        System.out.println("Salário do Jogador: R$" + jogador.calcularSalario());
    }
}
