import java.util.Scanner;
public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your personal details:");
        System.out.println("----------------------------");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("Contact: ");
        long contact = sc.nextLong();

        System.out.println("Name\t\tAddress\t\tContact");
        System.out.println(name+"\t\t"+address+"\t\t"+contact);
    }
}
