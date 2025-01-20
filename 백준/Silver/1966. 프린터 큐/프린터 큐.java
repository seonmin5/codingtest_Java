import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> q = new LinkedList<>();
            StringTokenizer levelSt = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < N; j++) {
                int level = Integer.parseInt(levelSt.nextToken());
                q.offer(new int[]{j, level});
            }

            int printOrder = 0;

            while (!q.isEmpty()) {
                int[] cur = q.poll();
                boolean isPrint = true;

                for (int[] doc : q) {
                    if (doc[1] > cur[1]) {
                        isPrint = false;
                        break;
                    }
                }

                if (isPrint) {
                    printOrder++;
                    if (cur[0] == M) {
                        System.out.println(printOrder);
                        break;
                    }
                } else {
                    q.offer(cur);
                }
            }
        }
    }
}