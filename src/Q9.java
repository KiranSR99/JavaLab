import java.sql.SQLOutput;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("Odd numbers between 1 to 30 are: ");
        for (int i=1;i<=30;i++){
            if (i%2!=0)
                System.out.print(i+" ");
        }
    }
}
