package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int[][] num = new int[9][9];
        int a = 0;
        int b = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                num[i][j] = Integer.parseInt(st.nextToken());
                if (num[i][j] > max) {
                    max = num[i][j];
                    a = i + 1;
                    b = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(a + " " + b);
    }
}
