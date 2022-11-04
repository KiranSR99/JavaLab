public class Q3 {
    public static void main(String[] args)
    {
        //Widening or Automatic Type Conversion
        System.out.println("\n\nWidening or Automatic Type Conversion");
        int i = 987;
        long l = i;
        float f = l;

        System.out.println("Integer value= " + i);
        System.out.println("Long value= " + l);
        System.out.println("Float value= " + f);

        //Narrowing or Explicit Conversion
        System.out.println("\n\nNarrowing or Explicit Conversion");
        double d=1234.5678;
        long e= (long)d;
        int a= (int)d;

        System.out.println("Double value= " + d);
        System.out.println("Long value= " + e);
        System.out.println("Integer value= " + a);

    }
}
