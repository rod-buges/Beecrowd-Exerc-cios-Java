import java.util.Scanner;

public class Main {
    public static int remaining(int n, int k) {
        int r = 0;
        for (int i = 1; i < n; i++)
            r = (r + k) % i;

        return r;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;

            }
            int y = 1;
            while (true) {
                if (remaining(n, y) != 11) {
                    y++;
                } else {

                    break;
                }
            }

            System.out.println(y);
        }

        scan.close();
    }
}
