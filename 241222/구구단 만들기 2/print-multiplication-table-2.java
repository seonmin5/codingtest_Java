import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 2; i <= 8; i+=2) {
            for (int multiple = b; multiple >= a; multiple--) {
                System.out.printf("%d * %d = %d", multiple, i, multiple*i);
                if (multiple > a) System.out.print(" / ");
            }
            System.out.println();
        }
        br.close();
    }
}