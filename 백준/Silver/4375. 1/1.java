import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            int N = Integer.parseInt(line);
            long reminder = 1 % N;
            int len = 1;

            while (reminder != 0) {
                reminder = (reminder * 10 + 1) % N; // 전체 값이 아닌 나머지를 활용할 것
                len++;
            }
            System.out.println(len);
        }
    }
}