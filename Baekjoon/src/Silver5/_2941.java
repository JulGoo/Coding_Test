package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        s = s.replace("lj", "a").replace("nj", "b").replace("dz=", "q");

        String[] arr = s.split("[-=]");

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() > 1){
                count += arr[i].length();
            }else {
                count += 1;
            }
        }

        System.out.println(count);
    }
}
