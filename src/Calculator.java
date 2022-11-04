
import java.util.Scanner;

public class Calculator{

    /* Java program to create a simple calculator which performs simple addition,
    subtraction, multiplication and division.
    */

    int n, i, num;

    public void doSum(){
        // This is the method to add numbers.
        int sum=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many numbers you want to add ? ");
        n = scan.nextInt();
        System.out.print("Enter " +n+ " numbers: ");
        for(i=0; i<n; i++)
        {
            num = scan.nextInt();
            sum = sum + num;
        }

        System.out.println("\nSum = " +sum);
    }

    public void doSub(){
        // This is the method to subtract numbers.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers for subtraction: ");
        System.out.print("Enter first number: ");
        int n1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scan.nextInt();

        if(n1>n2)
            System.out.println("Subtract = "+(n1-n2));
        else
            System.out.println("Subtract = "+(n2-n1));
    }

    public void doMul(){
        // This is the method to multiply numbers.

        int mul=1;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many numbers do you want to multiply ? ");
        n = scan.nextInt();
        System.out.print("Enter " +n+ " numbers: ");
        for(i=0; i<n; i++)
        {
            num = scan.nextInt();
            mul = mul * num;
        }

        System.out.println("\nMultiplication = " +mul);
    }

    public void doDiv(){
        // This is the method to divide numbers.
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers for division: ");
        System.out.print("Enter first number: ");
        int n1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scan.nextInt();

        if(n1>n2)
            System.out.println("Division = "+(n1/n2));
        else
            System.out.println("Division = "+(n2/n1));
    }

    public static void main(String[] args) {

        Calculator cp = new Calculator();

        char ch;
        do {
            System.out.println("\n\nWhat operation do you want to perform ?");
            System.out.println("\n         Enter Choices: ");
            System.out.println("----------------------------------");
            System.out.println("1 for Addition");
            System.out.println("2 for Subtraction");
            System.out.println("3 for Multiplication");
            System.out.println("4 for Division");
            System.out.println("5 for Exit\n");

            Scanner a = new Scanner(System.in);
            int choice = a.nextInt();

            switch (choice) {
                case 1:
                    cp.doSum();
                    break;

                case 2:
                    cp.doSub();
                    break;

                case 3:
                    cp.doMul();
                    break;

                case 4:
                    cp.doDiv();
                    break;

                case 5:
				    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter correct choice.");
                    break;
            }

            System.out.println("\nDo you want to perform any other calculation (Y/N) ?");
            ch = a.next().charAt(0);
        }
        while (ch=='Y'||ch=='y');
    }
}