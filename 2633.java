import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static class Friboi {
        String carne;
        short validade;

        public Friboi(String carne, short validade) {
            this.carne = carne;
            this.validade = validade;
        }
    }

    static void ordena(Friboi[] churrasco) {
        Arrays.sort(churrasco, (c1, c2) -> c1.validade - c2.validade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            short qtsCarnes = sc.nextShort();

            Friboi[] churrasco = new Friboi[qtsCarnes];
            for (int i = 0; i < qtsCarnes; i++) {
                String carne = sc.next();
                short validade = sc.nextShort();
                churrasco[i] = new Friboi(carne, validade);
            }

            ordena(churrasco);

            for (int i = 0; i < qtsCarnes; i++) {
                System.out.print(churrasco[i].carne);

                if (i != qtsCarnes - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
