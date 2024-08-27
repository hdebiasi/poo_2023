package fundamentos.basico;

public class FB_02g_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Olá");
        sb.append(" Mundo!");
        System.out.println(sb);

        sb.insert(4, "a vocês ");
        System.out.println(sb);

        sb.deleteCharAt(17);
        sb.delete(4, 12);
        System.out.println(sb);
    }
}