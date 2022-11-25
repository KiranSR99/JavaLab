import java.util.Scanner;
public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book details:");
        System.out.println("-------------------");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Author: ");
        String author = sc.nextLine();

        System.out.print("Genre: ");
        String genre = sc.nextLine();

        System.out.print("Published Date: ");
        long publish = sc.nextLong();

        System.out.println("Name\t\tAuthor\t\tGenre\t\tPublished By");
        System.out.println(name+"\t\t"+author+"\t\t"+genre+"\t\t"+publish);
    }
}
