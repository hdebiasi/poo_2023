package fundamentos.basico;

public class FB_02g_CastingNumerosStrings {
    public static void main(String[] args) {
        String str1 = "40";
        int num1 = Integer.parseInt(str1) + 2;
        System.out.println(num1);

        String str2 = "40.12f";
        float num2 = Float.parseFloat(str2) + 2;
        System.out.println(num2);

        String str3 = "40.01";
        double num3 = Double.parseDouble(str3) + 2;
        System.out.println(num3);

        Integer numero = Integer.valueOf("40");
        System.out.println(numero + 2);
    }
}
