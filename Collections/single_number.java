import java.util.Arrays;
import java.util.Scanner;

public class single_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ar[] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    ar[i] = arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
