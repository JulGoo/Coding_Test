package Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        String[] array = new String[n];
        StringBuilder sb = new StringBuilder();

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = st1.nextToken();
            if (Integer.parseInt(array[i]) < x) {
                sb.append(array[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
