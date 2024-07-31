import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Suriya");// push element to stack
        stack.push("abc");
        stack.pop();// removes and returns the last element from a Python list by default
        Iterator itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }
}