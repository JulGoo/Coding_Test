package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> xlist = new ArrayList<>();
        List<Integer> ylist = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xlist.add(Integer.parseInt(st.nextToken()));
            ylist.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(xlist);
        Collections.sort(ylist);

        int xmax = xlist.get(0);
        int xmin = xlist.get(n - 1);

        int ymax = ylist.get(0);
        int ymin = ylist.get(n - 1);

        System.out.println((xmax - xmin) * (ymax - ymin));
    }
}
