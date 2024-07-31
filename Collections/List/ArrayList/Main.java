import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Suriya");
        list.add("abc");
        list.subList(0, 1).clear();// 0 index is inclusive and 1 is exclusive
        ArrayList<String> list2 = new ArrayList<>();
        list.add("Suriya");
        list.add("Janani");
        list.addAll(list2);// add to list2 to list1
        System.out.println(list);
        System.out.println(list.retainAll(list2));// check if all list2 elements is in list1 elemets or not
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}