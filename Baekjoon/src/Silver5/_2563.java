package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int paper = Integer.parseInt(br.readLine());
        int[][] arr = new int[100][100];

        for (int i = 0; i < paper; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken(br.readLine()));
            int y = Integer.parseInt(st.nextToken(br.readLine()));
            arr[x][y] = 1;
        }


    }
}
