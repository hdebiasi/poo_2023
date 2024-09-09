package fundamentos.basico.tipos;

public class Nulo {
    public String nome;

    public static void main(String[] args) {
        Nulo vn = new Nulo();

        // A linha abaixo causa um erro de execução do tipo NullPointerException
//        System.out.println(vn.nome.concat(", olá!"));

        if (vn.nome == null) {
            vn.nome = "Fulano";
        }

        System.out.println(vn.nome.concat(", olá!"));
    }
}
