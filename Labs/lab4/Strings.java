import java.util.Scanner;
public class Strings
{
// --------------------------------------------
// Reads in an array of Strings, sorts them,
// then prints them in sorted order.
// --------------------------------------------
    public static void main (String[] args)
    {
        String[] strList; // for 2. change int[] to Integer[]
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many strings do you want to sort? ");
        size = scan.nextInt();          // read the length
        scan.nextLine();                // consume the end-of-line after the int

        strList = new String[size];

        System.out.println ("\nEnter the strings (one per line): ");
        for (int i = 0; i < size; i++){
            strList[i] = scan.nextLine();
        }
        Sorting.insertionSort(strList);

        System.out.println ("\nYour strings in sorted order...");
        for (String s: strList) {
            System.out.println(s);
        }
        scan.close();
	}
}