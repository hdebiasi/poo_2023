package fundamentos.intermediario;

public class FI_01c_Inicializacao {
    int numero;
    float valor;
    boolean estado;
    char letra;
    String nome;

    public static void main(String[] args) {
        FI_01c_Inicializacao vp = new FI_01c_Inicializacao();

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
