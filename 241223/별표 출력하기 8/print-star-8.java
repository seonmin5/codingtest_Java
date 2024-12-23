import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println("*");
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("* ");
                }
                System.out.println();
            }
        }

        br.close();
    }
}