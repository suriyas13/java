import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Object> k = new LinkedHashSet();
        Set<Integer> m = new LinkedHashSet();
        Integer[] a = { 23, 61, 96, 04, 59 };
        Integer[] b = { 57, 12, 96, 32, 100 };
        k.addAll(Arrays.asList(a));// used to add all the elements//
        /*
         * Arrays.asList used to convert integer array to collection
         */
        m.addAll(Arrays.asList(b));
        int n = 12;
        k.add(n);
        System.out.println("K:" + k);
        System.out.println("M:" + m);
        Set<String> o = new LinkedHashSet();
        String[] arr = { "Hello", "World" };
        o.addAll(Arrays.asList(arr));
        k.addAll(o);/* addAll to used for Union of two sets */
        System.out.println("K:" + k);
        Set<Integer> x = new LinkedHashSet();
        m.retainAll(k);// to find elements that are present in both sets(Intersection)
        System.out.println("M:" + m);
        k.removeAll(m);// Difference k-m
        System.out.println("K: " + k);
        k.remove(23);// remove element based on value
        System.out.println("K: " + k);
        k.clear();// remove all the elements
        System.out.println("K: " + k);
        k.addAll(m);
        if (m.containsAll(m)) {// return true if k and m have same elements
            System.out.println("True");
        }
        System.out.println(k.hashCode());// print the address .Convert hexadecimal value (address to integer)
        Iterator itr = m.iterator();// printint set using iterator
        System.out.print("K:");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println("K(Size):" + k.size());// return size of the set
    }
}
