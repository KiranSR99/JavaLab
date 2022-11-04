
import java.util.Scanner;

public class Q14
{

    public static void main(String[] args) {

        System.out.println("Enter two numbers: ");
        Scanner a=new Scanner(System.in);
        int n1=a.nextInt();
        int n2=a.nextInt();
        for(int i=n1;i<=n2;i++){
            if(checkPrime(i)){
                System.out.print(i+" " );
            }
        }
    }
    public static boolean checkPrime(int num){
        if(num<2){
            return false;
        }
        else{
            for(int i=2;i<num-1;i++){
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}