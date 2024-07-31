import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> innerlist = new ArrayList();
            int m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                int num = sc.nextInt();
                innerlist.add(num);
            }
            list.add(innerlist);
        }
        int nquery = sc.nextInt();
        for (int i = 0; i < nquery; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                System.out.println(list.get(a - 1).get(b - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
