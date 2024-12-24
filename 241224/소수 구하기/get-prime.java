import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static boolean isPrimeNumber(int n) {
        int count = 1;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 1;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i)) {
                System.out.printf("%d ", i);
            }
        }
        br.close();
    }
}