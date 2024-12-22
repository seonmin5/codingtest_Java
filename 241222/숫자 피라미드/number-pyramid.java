import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }

        br.close();
    }
}