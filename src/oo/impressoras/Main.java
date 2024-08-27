package oo.impressoras;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Impressora> impressoras = new ArrayList<Impressora>();

        impressoras.add(new Laser());
        impressoras.add(new JatoDeTinta());
        impressoras.add(new Matricial());

        for(Impressora impressora : impressoras){
            impressora.imprimir();
        }
    }
}
