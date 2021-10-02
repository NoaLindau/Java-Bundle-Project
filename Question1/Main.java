public class Main {

    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<String>(5);
        stringStack.push("test1");
        stringStack.push("test2");
        stringStack.push("test3");

        Stack<Integer> intStack = new Stack<Integer>(5);
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);

        Stack<Stack> stackStack = new Stack<Stack>(2);
        stackStack.push(stringStack);
        stackStack.push(intStack);
        boolean done = false;
        while(done == false){
            try {
                Stack current = stackStack.pop();

                boolean innerDone = false;
                while (innerDone == false) {
                    try {
                        Object s = current.pop();
                        System.out.println("Found in stack - " + s.toString());
                    } catch (ArrayIndexOutOfBoundsException err) {
                        innerDone = true;
                    }
                }
            }catch(ArrayIndexOutOfBoundsException err){
                done = true;
            }
        }

    }
}
