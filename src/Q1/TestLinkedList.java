package Q1;
import DataStructures.linkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        var list = new linkedList<Integer>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        for (int x : new int[]{1, 2, 3, 4, 5})
            list.add(x);
        list.print();
        list.remove(2);
        list.print();
        list.remove(0);
        list.print();
        list.remove(1);
        list.print();
    }    
}

// 1 2 3 4 5 
// 1 2 4 5 
// 2 4 5 
// 2 5 