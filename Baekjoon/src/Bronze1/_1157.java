package Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();
        StringBuilder sb = new StringBuilder(word);
        Map<Character, Integer> map = new HashMap<>();

        while (!sb.isEmpty()) {
            int count = 0;
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(0) == sb.charAt(j)) {
                    count++;
                }
            }
            map.put(sb.charAt(0), count);
            sb = new StringBuilder(sb.toString().replaceAll(String.valueOf(sb.charAt(0)), ""));
            //System.out.println(count);
        }
        StringBuilder result = new StringBuilder();

        int maxValue = Collections.max(map.values());
        for(Map.Entry<Character, Integer> m : map.entrySet()) {
            if(m.getValue()==maxValue) {
                result.append(m.getKey());
            }
        }
        if (result.length() > 1){
            System.out.println("?");
        }else {
            System.out.println(result);
        }
    }
}
