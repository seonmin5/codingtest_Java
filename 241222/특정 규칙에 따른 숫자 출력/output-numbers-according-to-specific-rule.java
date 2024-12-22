import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = 0;

        for (int i = n; i >= 1; i--) {
            for (int empty = 0; empty < n - i; empty++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", result[index]);
                index = (index + 1) % result.length;
            }
            System.out.println();
        }

    }
}