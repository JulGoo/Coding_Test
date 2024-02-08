package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            for (int j = 0; j < n; j++) {
                sum += arr[j];
                for (int k = 0; k < n; k++) {
                    sum += arr[k];
                    if ((i == j) || (j == k) || (i == k)) {
                        sum -= arr[k];
                        break;
                    } else {
                        list.add(sum);
                        sum -= arr[k];
                    }
                }
                sum -= arr[j];
            }
            sum -= arr[i];
        }

        List<Integer> sub = new ArrayList<>();
        for (int i : list) {
            int a= m-i;
            if (a < 0){
                a *= -1;
            }
            sub.add(a);
        }

        int min = Collections.min(sub);
        System.out.println(list.get(sub.indexOf(min)));

    }
}

