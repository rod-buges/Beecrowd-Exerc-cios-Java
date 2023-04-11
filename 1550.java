import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int a, b;
    static int[] d = new int[100010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            for (int i = 0; i < d.length; i++) {
                d[i] = -1;
            }
            a = sc.nextInt();
            b = sc.nextInt();
            bfs(a);
            System.out.println(d[b]);
        }
        sc.close();
    }
    static void bfs(int u) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(u);
        d[u] = 0;
        while (!queue.isEmpty()) {
            int v = queue.peek();
            if (d[b] != -1) {
                break;
            }
            queue.poll();
            int rev = 0, uu = v;
            while (uu > 0) {
                rev *= 10;
                rev += uu % 10;
                uu /= 10;
            }
            if (d[rev] == -1) {
                d[rev] = d[v] + 1;
                queue.add(rev);
            }
            if (d[v + 1] == -1) {
                d[v + 1] = d[v] + 1;
                queue.add(v + 1);
            }
        }
    }
}
