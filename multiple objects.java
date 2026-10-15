public class MultipleObjectsDemo {
    int x = 5;

    public static void main(String[] args) {
        MultipleObjectsDemo myObj1 = new MultipleObjectsDemo();
        MultipleObjectsDemo myObj2 = new MultipleObjectsDemo();

        myObj2.x = 10;   // only the second object's x changes

        System.out.println("myObj1 x = " + myObj1.x);
        System.out.println("myObj2 x = " + myObj2.x);
    }
}
