import java.util.Scanner;
class Book {
     String name, author, genre;
      int date;

    Book(String name, String author, String genre, int date){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.date = date;
    }
    void print(){
        System.out.println(name);
        System.out.println(author);
        System.out.println(genre);
        System.out.println(date);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Book Name: ");
        String name = sc.nextLine();

        System.out.print("Author: ");
        String author = sc.nextLine();

        System.out.print("Genre: ");
        String genre = sc.nextLine();

        System.out.print("Published date: ");
        int date = sc.nextInt();

        Book book = new Book(name, author, genre, date);
        book.print();
    }
}
