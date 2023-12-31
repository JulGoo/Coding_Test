package Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[30];
        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num - 1] = true;
        }
        for (int j = 0; j < 30; j++) {
            if (!arr[j]) {
                System.out.println(j + 1);
            }
        }
    }
}
