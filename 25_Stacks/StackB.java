
import java.util.ArrayList;

public class StackB {

    static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();

        //isEmpty
        public static boolean isEmpty() {
            // size fxn to get the size of the list means checking the values in stack
            return list.size() == 0;
        }

        //Push
        public static void push(int data) {
            list.add(data);
        }

        //Pop
        public static int pop() {
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //Peek
        public static int peek() {
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(0);
        stk.push(1);
        stk.push(2);
        stk.push(3);

        while (!stk.isEmpty()) {
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}
