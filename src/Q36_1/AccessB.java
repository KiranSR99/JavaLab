package Q36_1;

public class AccessB {
    public static void main(String[] args) {
        AccessA acc = new AccessA();

        //for default access modifier
        System.out.println(acc.number);
        System.out.println(acc.country);

        //for public access modifier
        System.out.println(acc.num);
        System.out.println(acc.flower);

//        //for private access modifier
//        /*private access modifier is only accessible within same class.
//        Also, not accessible outside of package. */
//        System.out.println(acc.element);
//        System.out.println(acc.game);

        //for protected access modifier
        System.out.println(acc.key);
        System.out.println(acc.animal);
    }
}
