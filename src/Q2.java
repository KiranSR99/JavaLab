
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter the value for given data types:");
        Scanner data= new Scanner(System.in);

        System.out.print("Boolean (true/false): ");
        boolean a= data.nextBoolean();

        System.out.print("Byte: ");
        byte b= data.nextByte();

        System.out.print("Integer: ");
        int c= data.nextInt();

        System.out.print("Short: ");
        short d= data.nextShort();

        System.out.print("Long: ");
        long e= data.nextLong();

        System.out.print("Float: ");
        float f= data.nextFloat();

        System.out.print("Double: ");
        double g= data.nextDouble();

        System.out.print("Character: ");
        char h= data.next().charAt(0);

        System.out.println("Your inputed values for different data types are:");
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g+"\n"+h);

    }
}