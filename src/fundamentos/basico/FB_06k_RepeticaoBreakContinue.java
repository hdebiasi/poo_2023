package fundamentos.basico;

public class FB_06k_RepeticaoBreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            } else if(i == 7) {
                break;
            }

            System.out.println("# " + i);
        }
    }
}

