//Задать два стека, поменять информацию местами.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        st1.push(1);
        st1.push(2);
        st2.push(3);
        st2.push(4);
        System.out.println("Первый стек: " + st1);
        System.out.println("Второй стек: " + st2);
        Iterator<Integer> i = st1.iterator();
        Iterator<Integer> i2 = st2.iterator();

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        while(i.hasNext()) {
            list.add(i.next());
        }

        while(i2.hasNext()) {
            list2.add(i2.next());
        }

        st1.clear();

        for(int j =0;j<list2.size();j++) {
            st1.push(list2.get(j));
        }

        st2.clear();

        for(int j =0;j<list.size();j++) {
            st2.push(list.get(j));
        }
        System.out.println("Первый стек после смены: " + st1);
        System.out.println("Второй стек после смены:  " + st2);
    }

}