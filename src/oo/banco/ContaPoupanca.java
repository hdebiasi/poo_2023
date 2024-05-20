package oo.banco;

public class ContaPoupanca extends ContaBancaria {
    private int diaAniversario;

    public ContaPoupanca(String nome, String documento,
                         int agencia, int numero,
                         double saldo, int diaAniversario) {
        super(nome, documento, agencia, numero, saldo);

        this.diaAniversario = diaAniversario;
    }

    public double sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Impossível sacar o valor total solicitado!");
            System.out.println("Sacando R$ " + saldo);
            saldo = 0;
        } else {
            super.sacar(valor);
        }
        return saldo;
    }

    public int getDiaAniversario() { return diaAniversario; }
    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    @Override
    public String toString() {
        super.toString();
        return "ContaPoupanca{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", diaAniversario=" + diaAniversario +
                '}';
    }
}
