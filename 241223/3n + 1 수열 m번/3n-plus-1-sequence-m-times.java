import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int countResult(int n) {
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                count++;
            } else {
                n = n * 3 + 1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < m; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println(countResult(n));
        }

        br.close();
    }
}