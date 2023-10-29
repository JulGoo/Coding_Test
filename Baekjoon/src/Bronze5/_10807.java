package Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] array = new String[n];
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = st.nextToken();
        }

        int v = Integer.parseInt(br.readLine());

        for (int i = 0; i < array.length; i++) {
            if (v == Integer.parseInt(array[i])) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
