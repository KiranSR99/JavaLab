package Q36_2;

import Q36_1.AccessA;

public class AccessC extends AccessA {
    public static void main(String[] args) {
        AccessA acc = new AccessA();

//        //for default access modifier
//        //default access modifier cannot be accessed from outside of package.
//        System.out.println(acc.number);
//        System.out.println(acc.country);

        //for public access modifier
        System.out.println(acc.num);
        System.out.println(acc.flower);

        //for protected access modifier
        /*protected access modifier only can be accessible
        outside of package if class inherits the class of other package
         and this package have subclass. */
        AccessC access = new AccessC();
        System.out.println(access.key);
        System.out.println(access.animal);
    }
}
