import java.util.Scanner;

public class Problem7 {


    public void reverseArray(int n){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number(one by one): ");

        int a = scan.nextInt();
        if (n==1){
            System.out.print("Here it is: " + a);
            return;
        }else {
            reverseArray(n-1);
        }
        System.out.print(" "+ a);
    }
}
