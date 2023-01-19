package linkedlists;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node{
        private int data;
        private Node next;
        public Node(int value){
            this.data = value;
        }
    }
    private Node first;
    private Node last;
    public void insert_end(int value){
        Node node = new Node(value);
        if(first == null){
            first = last = node;
        }
        else{
            last.next = node;
            last = node;
        }
    }

    public void insert_begin(int value){
        Node node = new Node(value);
        if(first == null){
            first = last = node;
        } else{
            node.next = first;
            first = node;
        }
    }

    public void print(){
        Node temp = first;
        while(temp!=null){
            System.out.print(temp.data);
            System.out.println(" ");
            temp = temp.next;
        }
    }

    public int indexOf(int value){
        Node current = first;
        int index = 0;
        if (current != null){
            while(current != null){
                if(value == current.data){
                    return index;
                }
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(int value){
        Node current = first;
        while (current != null){
            if(value == current.data)
                return true;
            current = current.next;
        }
        return false;
    }

    public void removeFirst(){
        if(first == null)
            throw new NoSuchElementException();

        if(first == last){
            first = last = null;
            return;
        }

        Node second = first.next;
        first.next = null;
        first = second;
    }

    public void removeLast(){
        if(first == null)
            throw new NoSuchElementException();

        if(first == last){
            first = last = null;
            return;
        }
        Node previous = getPrevious(last);
        last  = previous;
        last.next = null;
    }

    public Node getPrevious(Node node){
        Node current = first;
        while(current!=null){
            if(current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

    public int size(){
        Node current = first;
        int count = 0;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }

    public int[] toArray(){
        int[] array = new int[size()];
        Node current = first;
        int i = 0;
        while(current != null){
            array[i++] = current.data;
            current = current.next;
        }
        return array;
    }

    // reverse ex: [10-> 20-> 30]
    //               p   c   n
    //
    public void reverse(){
        if(first==null) return;
        Node previous = first;
        Node current = first.next;
        while (current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    public int removeAtPosition(int position){
        if(first == null)
            throw new NoSuchElementException();

        if(first == last){
            first = last = null;
            return -1;
        }

        Node current = first;
        if(position==0) {
            int data = first.data;
            first = current.next;
            return data;
        } else if (position<size() && position>0) {
            while (--position!=0){
                current = current.next;
            }
            int data = current.next.data;
            current.next = (current.next).next;
            last = current;
            return data;
        }
        return -1;
    }
}
