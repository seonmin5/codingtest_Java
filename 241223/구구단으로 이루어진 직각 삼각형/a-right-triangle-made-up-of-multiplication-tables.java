import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int k = 1;

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %d", k, j, k*j);
                if (j != i) System.out.print(" / ");
            }
            System.out.println();
            k++;
        }
        br.close();
    }
}