import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] < 500) {
                max = Math.max(max, arr[i]);
            } else {
                min = Math.min(min, arr[i]);
            }
        }
        System.out.printf("%d %d", max, min);
        br.close();
    }
}