package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int one = Integer.parseInt(br.readLine());
        int two = Integer.parseInt(br.readLine());

        int three = one * (two % 10);
        int four = one * ((two / 10) % 10);
        int five = one * (two / 100);

        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(three + four * 10 + five * 100);
    }
}
