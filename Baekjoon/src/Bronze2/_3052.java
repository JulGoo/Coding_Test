package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        //정렬
        Arrays.parallelSort(arr);

        int count = 0;
        for (int j = 1; j <= 9; j++) {
            if (arr[j - 1] != arr[j]) {
                count += 1;
            }
        }
        System.out.println(count + 1);
    }
}
