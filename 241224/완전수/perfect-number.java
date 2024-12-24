import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPerfectNumber(i)) {
                count++;
            }
        }

        System.out.print(count);

        br.close();
    }
}