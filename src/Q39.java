//Use of this and super keywords.
class Flower {
    String color = "Red";
}
class Rose extends Flower{
    private String color;
    Rose(){
        this.color = "Pink";
    } //use of 'this' keyword.
    void print(){
        System.out.println(color);
        System.out.println(super.color);  //use of 'super' keyword.
    }
}
public class Q39 {
    public static void main(String[] args) {
        Rose rose = new Rose();
        rose.print();
    }
}
