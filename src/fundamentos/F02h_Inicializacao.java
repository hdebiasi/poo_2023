package fundamentos;

public class F02h_Inicializacao {
    int numero;
    float valor;
    boolean estado;
    char letra;
    String nome;

    public static void main(String[] args) {
        F02h_Inicializacao vp = new F02h_Inicializacao();

        System.out.println("int....: " + vp.numero);
        System.out.println("float..: " + vp.valor);
        System.out.println("boolean: " + vp.estado);
        System.out.println("char...: " + vp.letra);
        System.out.println("String.: " + vp.nome);
    }

    public void teste() {
        String s;
        int numero;

//        System.out.println(s);
//        System.out.println(numero);
    }
}
