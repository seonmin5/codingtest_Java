import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int start = 0;
        int end = 0;

        if (isEven(b)) {
            start = b;
        } else {
            start = b-1;
        }

        if (isEven(a)) {
            end = a;
        } else {
            end = a+1;
        }

        for (int i = 1; i <= 9; i++) {
            for (int multiple = start; multiple >= end; multiple-=2) {
                System.out.printf("%d * %d = %d", multiple, i, multiple*i);
                if (multiple > end) System.out.print(" / ");
            }
            System.out.println();
        }

        br.close();
    }
}