package prova1;

public class App {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa("Fulano da Silva", 2010);
        fulano.setAnoNascimento(2000);
        fulano.imprimirDados();
        System.out.println("\nIdade de " + fulano.getNome() +
                ": " + fulano.calcularIdade() + " anos.");
    }
}
