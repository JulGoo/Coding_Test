package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int min = a;
        int max = a;
        for (int i = 1; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            if(min > x){
                min = x;
            }
            if(max < x){
                max = x;
            }
        }
        System.out.println(min + " " + max);
    }
}
