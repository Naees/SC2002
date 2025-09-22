import java.util.Scanner;
public class P4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        
        if (height <= 0) {
            System.out.println("Error input!!");
            sc.close();
            return;
        }
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {

                if ((j + i) % 2 == 0) {
                    System.out.print("AA");
                }
                else {
                    System.out.print("BB");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}