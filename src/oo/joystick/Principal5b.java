package oo.joystick;

public class Principal5b {
    public static void main(String[] args) {
        Joystick js = new Joystick();

        js.setModelo("PS4");
        js.setCor("Preto");
        js.setPorcentagemBateria(100);

        System.out.println("Cor: " + js.getCor());
        System.out.println("Modelo: " + js.getModelo());
        System.out.println("Porcentagem bateria: " + js.getPorcentagemBateria());
    }
}
