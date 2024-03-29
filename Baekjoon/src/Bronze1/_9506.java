package Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            } else {
                List<Integer> list = new ArrayList<>();
                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        list.add(i);
                    }
                }

                int sum = 0;
                for (int i : list) {
                    sum += i;
                }

                if (sum == n) {
                    System.out.print(n + " = ");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i));
                        if (i == (list.size() - 1)) {
                            System.out.println();
                            break;
                        }
                        System.out.print(" + ");
                    }
                } else {
                    System.out.println(n + " is NOT perfect.");
                }
            }
        }
    }
}
