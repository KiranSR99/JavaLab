import java.util.Scanner;
public class Q30 {
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
        System.out.print("\n\nEnter the element to search: ");
        int element = sc.nextInt();

        int count = 0;
        for (int i=0;i<n;i++){
            if (array[i] == element){
                count++;
                System.out.println("Element found at index "+i);
            }
        }
        System.out.println("Number of repetition of "+element+" = "+count);
    }
}
