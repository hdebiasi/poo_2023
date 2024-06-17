package oo.banco;

public class TestaContas {
    public static void main(String[] args) {
        ContaBancaria fulano = new ContaPoupanca("Fulano",
                "RG 12345678",
                123,
                456,
                100,
                10
        );
        System.out.println(fulano);

        fulano.depositar(1900);
        System.out.println(fulano);

        fulano.sacar(1500);
        System.out.println(fulano);

    }
}
