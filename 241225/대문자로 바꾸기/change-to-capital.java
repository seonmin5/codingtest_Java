import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [][] arr2d = new String [5][3];

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < 3; j++) {
                arr2d[i][j] = st.nextToken().toUpperCase();
                System.out.printf("%s ", arr2d[i][j]);
            }
            System.out.println();
        }

        br.close();
    }
}