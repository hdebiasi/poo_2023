package oo.banco;

public abstract class ContaBancaria {
    protected String nome;
    protected String documento;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public double sacar(double valor) {
        saldo -= valor;
        return saldo;
    }

    public double depositar(double valor) {
        saldo += valor;
        return saldo;
    }

    public ContaBancaria(String nome, String documento,
                         int agencia, int numero,
                         double saldo) {
        this.nome = nome;
        this.documento = documento;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    public int getAgencia() { return agencia; }
    public void setAgencia(int agencia) { this.agencia = agencia; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
}
