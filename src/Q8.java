import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner a = new Scanner(System.in);
        int n1= a.nextInt();
        int n2= a.nextInt();

        for (int i=n1;i<=n2;i++){
            System.out.println(i);
        }
    }
}
