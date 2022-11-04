public class Q25 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int sum = 0;
        for (int i=0; i<5; i++){
            sum+=array[i];
        }
        int avg = sum/5;
        System.out.println("Average of elements of given array is "+avg);
    }
}
