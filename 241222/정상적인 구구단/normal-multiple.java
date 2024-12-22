import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        for (int i = 1; i <= n; i++) {
            for (int multiple = 1; multiple <= n; multiple++) {
                System.out.printf("%d * %d = %d", i, multiple, i*multiple);
                if (multiple < n) System.out.print(", ");
            }
            System.out.println();
        }
        br.close();
    }
}