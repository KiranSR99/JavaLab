class Wood{
    void use(){
        System.out.println("Used in classroom.");
    }
}
class Foam extends Wood{
    void material(){
        System.out.println("Made from wood.");
    }
}
class Duster extends Wood{
    void madeFrom(){
        System.out.println("A complete duster is made from Wood and Foam.");
    }
}
class Q38{
    public static void main(String[] args) {
        Foam foam = new Foam();
        Duster duster = new Duster();

        foam.use();
        foam.material();
        duster.use();
        duster.madeFrom();
    }
}