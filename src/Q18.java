
import java.util.Scanner;

public class Q18{
	public static void main(String[] args){
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int n1=s.nextInt();
		int n2=s.nextInt();
		
		for(int i=n1;i<=n2;i++){
			if(i%2!=0){
				sum+=i;
			}
		}
		System.out.println("The sum of odd numbers between "+n1+" and "+n2+" is "+sum);
	}
}