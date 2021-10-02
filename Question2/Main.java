public class Main {

    public static void main(String[] args) {

        List test = new List("test");
        test.insertAtFront(3);
        test.insertAtFront(5);
        test.insertAtFront(2);
        test.insertAtFront(1);
        System.out.println(test.min());
        System.out.println(test.max());

    }
}
