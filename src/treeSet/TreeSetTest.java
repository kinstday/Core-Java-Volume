package treeSet;

import java.util.*;

/**
 * This program sorts a set of Item objects by comparing their descriptions.
 * @version 11.06 2021.5.27
 * @author liubin
 */

public class TreeSetTest
{
    public static void main(String[] args)
    {
        var parts = new TreeSet<Item>();
        parts.add(new Item("Toaster",1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);

        var sortByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}
