package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean TF = false;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            sum += i;

            String num = String.valueOf(i);
            String[] arr = num.split("");
            for (int j = 0; j < arr.length; j++) {
                sum += Integer.parseInt(arr[j]);
            }

            if (sum == n){
                System.out.println(i);
                TF = true;
                break;
            }
        }

        if (TF == false){
            System.out.println(0);
        }
    }
}
