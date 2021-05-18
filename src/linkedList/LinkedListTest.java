package linkedList;

import java.util.*;

/**
 * This program demonstrates operations in linked lists.
 * @version 11.06 2021.5.18
 * @author liubin
 */

public class LinkedListTest
{
    public static void main(String[] args)
    {
        var a = new LinkedList<String>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        var b = new LinkedList<String>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        //merge the words from b into a

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.listIterator();

        while(bIter.hasNext())
        {
            if(aIter.hasNext())
            {
                aIter.next();
            }
            aIter.add(bIter.next());
        }

        System.out.println(a);

        //remove every second word from b

        bIter = b.iterator();
        while(bIter.hasNext())
        {
            bIter.next();
            if(bIter.hasNext())
            {
                bIter.next();
                bIter.remove();
            }
        }

        System.out.println(b);

        a.removeAll(b);

        System.out.println(a);
    }
}
