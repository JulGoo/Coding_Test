package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        String[] arr = new String[n];

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            int c = Integer.parseInt(st2.nextToken());

            for (int j = a; j <= b; j++) {
                arr[j-1] = String.valueOf(c);
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if(arr[k] == null){
                arr[k] = String.valueOf(0);
            }
            System.out.print(arr[k]+" ");
        }
    }
}
