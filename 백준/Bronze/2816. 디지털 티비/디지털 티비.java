import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] channel = new String[N];

        int k1 = -1;
        int k2 = -1;
        for (int i = 0; i < N; i++) {
            channel[i] = br.readLine();
            if (channel[i].equals("KBS1")) {
                k1 = i;
            } else if (channel[i].equals("KBS2")) {
                k2 = i;
            }
        }

        if (k1 > k2) {
            k2++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("1".repeat(k1));
        sb.append("4".repeat(k1));
        sb.append("1".repeat(k2));
        sb.append("4".repeat(k2-1));
        System.out.println(sb.toString().trim());
    }
}