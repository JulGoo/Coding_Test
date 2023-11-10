package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int[] second = new int[word.length()];

        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'A', 'B', 'C':
                    second[i] = 3;
                    break;
                case 'D', 'E', 'F':
                    second[i] = 4;
                    break;
                case 'G', 'H', 'I':
                    second[i] = 5;
                    break;
                case 'J', 'K', 'L':
                    second[i] = 6;
                    break;
                case 'M', 'N', 'O':
                    second[i] = 7;
                    break;
                case 'P', 'Q', 'R', 'S':
                    second[i] = 8;
                    break;
                case 'T', 'U', 'V':
                    second[i] = 9;
                    break;
                case 'W', 'X', 'Y', 'Z':
                    second[i] = 10;
                    break;
            }
        }

        int sum = 0;
        for (int sec : second) {
            sum += sec;
        }
        System.out.println(sum);
    }
}
