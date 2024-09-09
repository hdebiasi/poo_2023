package fundamentos.basico.boxingwrappers;

public class Boxing {
    public static void main(String[] args) {
        int x = 42;
        Integer iX = new Integer(x);    // Depreciado
//        Integer iX = Integer.valueOf(x);
//        Integer iX = x;

        System.out.println("Tipo primitivo..: " + x);
        System.out.println("Objeto (wrapper): " + iX);
    }
}
