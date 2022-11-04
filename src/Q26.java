
import java.util.Scanner;
public class Q26 {
    public static void main(String[] args) {
        System.out.print("How many elements you want on array ? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[50];
        System.out.println("Enter the elements in array: ");

        for (int i=1; i<=n; i++){
            System.out.print("Element "+i+": ");
            array[i] = sc.nextInt();
        }
        System.out.println("\nElements of array are: ");
        for (int i=1; i<=n; i++){
            System.out.print(array[i]+" ");
        }

        int max = array[0];
        for (int i=0;i<=n;i++) {
            if (max < array[i])
                max = array[i];
        }

        System.out.println("\n\nThe greatest element of given array is "+max);
    }
}
