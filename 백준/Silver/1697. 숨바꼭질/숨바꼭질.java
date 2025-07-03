import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(BFS(N, K));
    }

    static int BFS(int N, int K) {
        if (N == K) return 0;

        Deque<int[]> q = new LinkedList<>();
        q.offer(new int[]{N, 0});
        boolean[] visited = new boolean[100001];
        visited[N] = true;

        while (!q.isEmpty()) {
            int[] polled = q.poll();
            int cur = polled[0];
            int depth = polled[1];
            for (int x : new int[]{1, -1, cur}) {
                int next = cur + x;
                if (next == K) {
                    return depth + 1;
                }
                if (next < 0 || next > 100000) continue;
                if (!visited[next]) {
                    visited[next] = true;
                    q.offer(new int[]{next, depth+1});
                }
            }
        }

        return -1;
    }
}
