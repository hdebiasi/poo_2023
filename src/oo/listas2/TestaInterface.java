package oo.listas2;

import java.util.ArrayList;

public class TestaInterface {
    public static void main(String[] args) {
        ArrayList<Calculavel> objetos = new ArrayList<Calculavel>();
        objetos.add(new Quadrado("Quadrado", 10));
        objetos.add(new Retangulo("Retângulo", 10, 5));

        objetos.add(new Funcionario("Fulano", 1000));

        for (Calculavel objeto: objetos) {
            System.out.println(objeto.calcular());
        }
    }
}
