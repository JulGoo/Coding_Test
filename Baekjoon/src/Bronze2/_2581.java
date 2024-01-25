package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        if (min == 1) {
            min = 2;
        }

        for (int i = min; i <= max; i++) {
            int count = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                list.add(i);
            }
        }

        int sum = 0;
        for (int n : list) {
            sum += n;
        }

        if (!list.isEmpty()) {
            System.out.println(sum);
            System.out.println(list.get(0));
        } else {
            System.out.println("-1");
        }
    }
}

