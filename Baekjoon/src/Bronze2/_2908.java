package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class _2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        a.append(st.nextToken());
        b.append(st.nextToken());

        int reverseA = Integer.parseInt(a.reverse().toString());
        int reverseB = Integer.parseInt(b.reverse().toString());

        if (reverseA > reverseB) {
            System.out.print(reverseA);
        } else {
            System.out.print(reverseB);
        }
    }
}
