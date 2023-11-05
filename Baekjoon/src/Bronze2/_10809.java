package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split("");
        int[] ascii = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ascii[i] = arr[i].charAt(0);
        }

        int[] alpha = new int[26];

        for (int i = 0; i < 26; i++) {
            alpha[i] = 97 + i;

            boolean chk = false;
            for (int j = 0; j < ascii.length; j++) {
                if (alpha[i] == ascii[j]) {
                    chk = true;
                    alpha[i] = j;
                }
            }
            if(!chk) {
                alpha[i] = -1;
            }

            System.out.print(alpha[i] + " ");
        }
    }
}
