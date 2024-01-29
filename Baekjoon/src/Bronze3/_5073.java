package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            List<Integer> list = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if ((a == 0) && (b == 0) && (c == 0)) {
                break;
            }

            list.add(a);
            list.add(b);
            list.add(c);
            Collections.sort(list);

            int max = list.get(2);
            int sum = list.get(0) + list.get(1);

            if (max >= sum) {
                System.out.println("Invalid");
            } else {
                if ((a == c) && (b == c)) {
                    System.out.println("Equilateral");
                } else if ((a == b) || (a == c) || (b == c)) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
        }
    }
}
