package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < T; i++) {
//
//        }
        String ox = br.readLine();
        int score = 0;
        for (int i = 0; i < ox.length(); i++) {
            if (ox.charAt(i) == 'O') {
                score += 1;
                if (i == 0){
                    continue;
                }else if (ox.charAt(i) == ox.charAt(i - 1)){
                    score += 1;
                }
            }
        }

        System.out.println(score);
    }
}
