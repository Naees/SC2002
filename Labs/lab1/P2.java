package Labs.lab1;
import java.util.*;

public class P2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary: ");
        int salary = scanner.nextInt();
        System.out.println("Enter merit");
        int merit = scanner.nextInt();
        
        char grades = '?';
        if (salary >= 700 && salary <= 899)
        {
            if (salary <= 799 && merit < 20) {
                grades = 'B';
            }
            else {
                grades = 'A';
            }
        }
        else if (salary >= 600 && salary <= 799)
        {
            grades = 'B';
        }
        else if (salary >= 500 && salary <= 649){
            if (salary >= 600 && merit >= 10)
            {
                grades = 'B';
            }
            else 
            {
                grades = 'C';
            }
        }
        System.out.println("Grade " + grades);
        scanner.close();
    }
}