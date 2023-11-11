package Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] set = {1, 1, 2, 2, 2, 8};
        int[] get = new int[6];
        int[] need = new int[6];

        for (int i = 0; i < 6; i++) {
            get[i] = Integer.parseInt(st.nextToken());
            need[i] = set[i] - get[i];
            System.out.print(need[i] + " ");
        }
    }
}
