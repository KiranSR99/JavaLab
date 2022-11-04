
import java.util.Scanner;
public class Q29{
    public static void main(String[] args) {
        System.out.print("How many elements you want on array ? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[50];
        System.out.println("Enter the elements in array: ");

        for (int i=0; i<n; i++){
            System.out.print("Element "+(i+1)+": ");
            array[i] = sc.nextInt();
        }
        System.out.println("\nElements of array are: ");
        for (int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }

        int min = array[0];
        int secMin = array[1];
        for (int i = 0; i<n; i++) {
            //Compare elements of array with min
            if(array[i] < min){
                secMin = min;
                min = array[i];
            }
            else if(array[i] > min && array[i] < secMin){
                secMin = array[i];
            }
        }
        System.out.println("\n\nThe smallest element of given array is "+secMin);
    }
}
