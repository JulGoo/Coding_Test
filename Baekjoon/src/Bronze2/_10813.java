package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        String[] arr = new String[n];

        for (int j = 0; j < n; j++) {
            arr[j] = String.valueOf(j + 1);
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            String aV = arr[a-1];
            String bV = arr[b-1];
            arr[a - 1] = bV;
            arr[b - 1] = aV;
        }

        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}

