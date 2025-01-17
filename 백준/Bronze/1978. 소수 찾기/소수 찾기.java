import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int j=2; j*j<=number; j++) {
                if (number % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int count = 0;
        while (st.hasMoreTokens()) {
            int number = Integer.parseInt(st.nextToken());
            if (isPrime(number)) {
                count++;
            }
        }
        System.out.println(count);
    }
}