package linkedlists;

import java.util.Arrays;

public class LinkedListImpl {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert_end(10);
        list.insert_end(20);
        list.insert_end(30);
        list.print();
        list.insert_begin(0);
        System.out.println("Working");
        list.print();
        System.out.println("Index at "+list.indexOf(0));
        System.out.println("Item found "+list.contains(0));
        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();
        System.out.println(list.size());
        list.insert_end(10);
        list.insert_end(20);
        list.insert_end(30);
        System.out.println(Arrays.toString(list.toArray()));
        list.reverse();
        System.out.println(Arrays.toString(list.toArray()));
        list.removeLast();
        list.removeLast();
        list.removeLast();
        list.removeLast();
        System.out.println(list.removeAtPosition(0));
        System.out.println(Arrays.toString(list.toArray()));

    }
}
