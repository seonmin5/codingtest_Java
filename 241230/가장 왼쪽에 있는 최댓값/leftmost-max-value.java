import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int end = n;
        while (end > 0) {
            int max = Integer.MIN_VALUE;
            int idx = 0;

            for (int i = 0; i < end; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    idx = i + 1;
                }
            }

            System.out.printf("%d ", idx);
            end = idx - 1;
        }        
        br.close();
    }
}