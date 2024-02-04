package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");

        int[] n = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            n[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(n);

        StringBuilder sb = new StringBuilder();
        for (int i : n) {
            sb.append(i);
        }
        sb.reverse();
        System.out.println(sb);
    }
}
