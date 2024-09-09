package fundamentos.basico.boxingwrappers;

public class Wrapper {
    public static void main(String[] args) {
        Boolean estado = null;
        System.out.println(estado);

        estado = Boolean.valueOf("true");
        System.out.println(estado);

        // Converte para String e então para maiúsculas
        System.out.println(estado.toString().toUpperCase());
        System.out.println();

        //-----------
        Integer a = 1000;
        Integer b = 1000;

        // Sempre use equals(), nunca use == com wrappers
        System.out.println("Integer a = 128, b = 128;");
        System.out.println("a.equals(b): " + a.equals(b));  // true
        System.out.println("a == b: " + (a == b));          // false
        System.out.println();

        a = 127;
        b = 127;

        System.out.println("Integer a = 127, b = 127;");
        System.out.println("a.equals(b): " + a.equals(b));  // true
        System.out.println("a == b: " + (a == b));		  // true
    }
}
