
import java.util.Scanner;

public class Q22
{
    public static void main(String[ ] args){
        System.out.print("Enter two numbers: ");
        Scanner a = new Scanner(System.in);
        int n1 = a.nextInt();
        int n2 = a.nextInt();

        int count, sum = 0;
        for(int number = n1; number <= n2; number++){
            count = 0;
            for (int i = 2; i <= number/2; i++){
                if(number % i == 0){
                    count++;
                    break;
                }
            }
            if(count == 0 && number != 1 ){
                sum = sum + number;
            }
        }
        System.out.println("Sum of prime numbers between "+n1+" and "+n2+" is "+sum);
    }
}  