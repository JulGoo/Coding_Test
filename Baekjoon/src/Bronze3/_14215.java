package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(st.nextToken()));
        list.add(Integer.parseInt(st.nextToken()));
        list.add(Integer.parseInt(st.nextToken()));

        Collections.sort(list);

        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);
        if (list.get(2) >= list.get(0) + list.get(1)) {
            c = list.get(0) + list.get(1) - 1;
        }

        System.out.println(a + b + c);
    }
}
