package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(n%i == 0){
                list.add(i);
            }
        }

        try {
            System.out.println(list.get(k-1));
        } catch (Exception e) {
            System.out.println("0");
        }
    }
}
