package Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.*;

public class _2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = parseInt(st.nextToken());
        int m = parseInt(st.nextToken());

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] sum = new int[n][m];

        for (int i = 0; i < n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr1[i][j] = parseInt(st1.nextToken());
            }
        }
        for (int j = 0; j < n; j++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                arr2[j][i] = parseInt(st2.nextToken());
            }
        }

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < m; l++) {
                sum[k][l] = arr1[k][l] + arr2[k][l];
                System.out.print(sum[k][l] + " ");
            }
            System.out.println();
        }
    }
}
