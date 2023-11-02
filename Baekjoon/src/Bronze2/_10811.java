package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        int temp = 0;

        for (int j = 1; j <= n; j++) {
            arr[j] = j;
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());

            while (a < b && a != b) {
                temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;

                a++;
                b--;
            }
        }

        for (int j = 1; j <= n; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
