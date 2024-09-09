package fundamentos.basico.boxingwrappers;

public class PrimitivosVsObjetos {
    public static void main(String[] args) {
        int x = 42;
        System.out.println("Valor da variável primitiva x = " + x);
        System.out.println("--------------");

        Integer iX = 42;
        System.out.println("Valor do objeto Integer iX = " + iX);
        System.out.println("Valor do objeto Integer iX (como int) = " + iX.intValue());
        System.out.println("Valor do objeto Integer iX (como float) = " + iX.floatValue());

        if (iX instanceof Integer) {
            System.out.println("--------------");
            System.out.println("iX é um objeto da classe Integer");
            System.out.println("Classe de iX: " + iX.getClass());
            System.out.println("Nome da classe de iX: " + iX.getClass().getName());
            System.out.println("Nome simples da classe de iX: " + iX.getClass().getSimpleName());
        }
    }
}
