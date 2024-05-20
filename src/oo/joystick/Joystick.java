package oo.joystick;

public class Joystick {
    private String modelo;
    private String cor;
    private int porcentagemBateria;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPorcentagemBateria() {
        return porcentagemBateria;
    }

    public void setPorcentagemBateria(int porcentagemBateria) {
        this.porcentagemBateria = porcentagemBateria;
    }

    // Construtor padrão
    public Joystick() {
    }

    // Construtor parametrizado
    public Joystick(String m, String c, int pb) {
        this.modelo = m;
        this.cor = c;
        this.porcentagemBateria = pb;
    }

    public void visualizarInfoJoystick() {
        System.out.println("Informações do joystick:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Porcentagem de bateria: " + this.porcentagemBateria + "%");
    }

    public void conectar() {
        System.out.println("Conectando o joystick...");
    }

    public void recarregar() {
        System.out.println("Recarregando o joystick...");
    }
}