package Q1;
import java.util.Iterator;

import DataStructures.IntLinkedList;

public class BigLinkedList {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();
    for(int i = 0; i< 200; i++)
        list.addFront((int)(Math.random()*100 +1));
    //todo the rest

    Iterator<Integer> iter = list.iterator();
    while(iter.hasNext())
        System.out.print(iter.next() + " ");
    System.out.println();
    }
    

}
