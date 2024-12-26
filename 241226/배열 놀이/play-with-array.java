import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine().trim());

        int n = Integer.parseInt(st1.nextToken());
        int q = Integer.parseInt(st1.nextToken());
        int arr[] = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int j = 0; j < q; j++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine().trim());
            int qq = Integer.parseInt(st3.nextToken());
            
            if (qq == 1) {
                int q1 = Integer.parseInt(st3.nextToken());
                System.out.println(arr[q1-1]);
            } else if (qq == 2) {
                int q2 = Integer.parseInt(st3.nextToken());
                int found = 0;
                for (int k = 0; k < n; k++) {
                    if (arr[k] == q2) {
                        System.out.println(k+1);
                        found = 1;
                        break;
                    }
                }
                if (found == 0) {
                    System.out.println(0);
                }
            } else {
                int q3 = Integer.parseInt(st3.nextToken());
                int q4 = Integer.parseInt(st3.nextToken());
                for (int l = q3-1; l < q4; l++) {
                    System.out.print(arr[l] + " ");
                }
                System.out.println();
            }
        }

        br.close();
    }
}