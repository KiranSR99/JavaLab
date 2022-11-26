import  java.util.Scanner;
public class Q31 {
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
        System.out.print("\nEnter the element to delete: ");
        int item  = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            if(array[i] == item)   //If element found
            {
                // shifting elements
                for(int j = i; j < n-1; j++)
                {
                    array[j] = array[j+1];
                }
                break;
            }
        }
        System.out.println("Elements in array after deletion: ");
        for(int i= 0; i<(n-1); i++) {
            System.out.print(array[i]+" ");
        }
    }
}