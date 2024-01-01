package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int q = 0;
        int d = 0;
        int n = 0;
        int p = 0;

        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            q = C / 25;
            C -= q * 25;
            d = C / 10;
            C -= d * 10;
            n = C / 5;
            C -= n * 5;
            p = C;

            System.out.println(q + " " + d + " " + n + " " + p);
        }
    }
}
