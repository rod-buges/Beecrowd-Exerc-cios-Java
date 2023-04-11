import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int contador1 = 0, contador2 = 0, contador3 = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
        }

        for (int i = 1; i < 4; i++) {
            if (vetor[i] < vetor[i + 1] && vetor[i - 1] < vetor[i]) {
                contador1++;
            } else if (vetor[i] > vetor[i + 1] && vetor[i - 1] > vetor[i]) {
                contador2++;
            } else {
                contador3 = 3;
                break;
            }
        }

        if (contador1 == 3) {
            System.out.println("C");
        } else if (contador2 == 3) {
            System.out.println("D");
        } else if (contador3 == 3) {
            System.out.println("N");
        }
    }
}
