import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        StringTokenizer st1 = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(st1.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.print(isSubsequence(arr1, arr2) ? "Yes" : "No");
        br.close();
    }

    private static boolean isSubsequence(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        for (int i = 0; i <= n1-n2; i++) {
            boolean match = true;

            for (int j = 0; j < n2; j++) {
                if (arr1[i+j] != arr2[j]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return true;
            } 
        }   
        return false;
    }
}