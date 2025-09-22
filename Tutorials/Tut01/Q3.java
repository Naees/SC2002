import java.util.Scanner;

public class Q3 {
    public static void bubble(int[] a, int n) {
        for (int i = n-2; i >= 0; i--){
            for (int j = 0; j <= i; j++){
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("\n\nEnter number of integer elements to be sorted: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("\n\nEnter integer value for element no. " + (i+1) + ": ");
            a[i] = scan.nextInt();
        }

        System.out.print("\n\nUnsorted array is: ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }

        bubble(a, n);
        
        System.out.print("\n\nFinally sorted array is: ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        scan.close();
    }
}