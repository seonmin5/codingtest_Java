import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int [][] arr2d = new int [4][4];
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < 4; j++) {
                arr2d[i][j] = Integer.parseInt(st.nextToken());
            }
            for (int k = 0; k <= i; k++) {
                sum += arr2d[i][k];
            }
        }
        System.out.print(sum);
        br.close();
    }
}