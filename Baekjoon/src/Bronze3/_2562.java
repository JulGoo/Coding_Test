package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[9];
        arr[0] = br.readLine();
        int max = Integer.parseInt(arr[0]);
        int order = 1;

        for (int i = 1; i < 9; i++) {
            arr[i] = br.readLine();
            if (max < Integer.parseInt(arr[i])) {
                max = Integer.parseInt(arr[i]);
                order = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(order);
    }
}
