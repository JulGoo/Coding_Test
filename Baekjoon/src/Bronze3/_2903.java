package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int a = 2;
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            a = a + (a - 1);
            answer = a * a;
        }
        System.out.println(answer);
    }
}
