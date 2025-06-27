import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Deque<Integer> dq = new LinkedList<>();
        for (int i = n-1; i >= 0; i--) {
            int card = n-i;
            int skill = a[i];
            if (skill == 1) {
                dq.addFirst(card);
            } else if (skill == 2) {
                int first = dq.pollFirst();
                dq.addFirst(card);
                dq.addFirst(first);
            } else if (skill == 3) {
                dq.addLast(card);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int x : dq) {
            sb.append(x).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}