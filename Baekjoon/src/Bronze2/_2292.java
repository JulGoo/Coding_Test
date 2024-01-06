package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println("1");
        } else {
            int count = 0;
            int i = 0;
            n -= 1;
            while (n > 0) {
                count++;
                n = n - (i * 6);
                i += 1;
            }
            System.out.println(count);
        }
    }
}
