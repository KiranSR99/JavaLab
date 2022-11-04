import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner a = new Scanner(System.in);
        int n1= a.nextInt();
        int n2= a.nextInt();
        int sum=0;

        for (int i=n1;i<=n2;i++){
            sum+=i;
        }
        System.out.println("Sum of all the numbers between "+n1+" and "+n2+" is "+sum);
    }
}
