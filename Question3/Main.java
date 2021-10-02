import java.util.Collection;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>();
        for (int i = 0; i < 500; i++) {
            intStack.push(((int) (Math.random() * 10) + 1));
        }
        TreeMap m = calcfreq(intStack);
        System.out.println("Done");
        for (Object key : m.keySet()) {
            System.out.println(key+" - "+ m.get(key));
        }

    }

    private static TreeMap calcfreq (Collection coll ){
        TreeMap<Object,Integer> m = new TreeMap<Object,Integer>();
        for (Object obj: coll){
            if (m.containsKey(obj)){
                m.put(obj,((int) m.get(obj)) + 1);
            }else{
                m.put(obj,0);
            }
        }
        return m;
    }
}
