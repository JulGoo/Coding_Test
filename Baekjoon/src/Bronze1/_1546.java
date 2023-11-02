package Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        double sum = 0;
        double[] newarr = new double[n];
        for (int i = 0; i < n; i++) {
            newarr[i] = ((double) arr[i] /arr[n-1])*100;
            sum += newarr[i];
        }

        double result = (double) sum / n;

        System.out.println(result);

    }
}
