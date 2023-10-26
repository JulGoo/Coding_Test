package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int prize = 0;
        int[] array = {a, b, c};

        if (a == b && b == c) {
            prize = 10000 + a * 1000;
        } else if ((a == b && a != c) || (a == c && a != b)) {
            prize = 1000 + a * 100;
        } else if (b == c && b != a) {
            prize = 1000 + b * 100;
        } else {
            int max = Arrays.stream(array).max().getAsInt();
            prize = max*100;
        }
        System.out.println(prize);
    }
}
