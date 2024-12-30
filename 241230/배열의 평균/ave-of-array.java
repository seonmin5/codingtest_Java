import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] arr2d = new int [2][4];
        float totalSum = 0;
        
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            float rowSum = 0;
            for (int j = 0; j < 4; j++) {
                arr2d[i][j] = Integer.parseInt(st.nextToken());
                rowSum += arr2d[i][j];
            }
            totalSum += rowSum;
            System.out.printf("%.1f ", rowSum/4);
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            float colSum = 0;
            for (int j = 0; j < 2; j++) {
                colSum += arr2d[j][i];
            }
            System.out.printf("%.1f ", colSum/2);
        }
        System.out.println();
        System.out.printf("%.1f", (float) totalSum/8);
        br.close();
    }
}