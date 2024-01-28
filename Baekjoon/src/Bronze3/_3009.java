package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] xs = new int[3];
        int[] ys = new int[3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xs[i] = Integer.parseInt(st.nextToken());
            ys[i] = Integer.parseInt(st.nextToken());
        }

        int x = 0;
        if (xs[0] == xs[1]) {
            x = xs[2];
        } else if (xs[0] == xs[2]) {
            x = xs[1];
        } else {
            x = xs[0];
        }

        int y = 0;
        if (ys[0] == ys[1]) {
            y = ys[2];
        } else if (ys[0] == ys[2]) {
            y = ys[1];
        } else {
            y = ys[0];
        }

        System.out.println(x + " " + y);
    }
}
