package com.qa.arrvslinked;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Arraylistvslinkedlist {
    public static void main(String[] args) {


        HashSet<String> set = new HashSet<String>();
        set.add("pineapple");
        set.add("watermelon");
        set.add("apple");
        set.add("pear");
        set.add("quince");
        set.add("lemon");
        set.add("kiwi");


        System.out.println("Before HashSet<String> set => ");
        Iterator<String> i = set.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        LinkedList<String> llist = new LinkedList<>();

        llist.add("plum");
        llist.add("nut");
        llist.add("apple");
        llist.add("grape");
        llist.add("peach");
        llist.add("pear");
        llist.add("cherry");
        llist.add("orange");
        llist.add("watermelon");
        llist.add("apricot");
        llist.add("pineapple");

        set.retainAll(llist);

        System.out.println("LinkedList<String> llist => ");
        for (int j = 0; j < llist.size(); j++) {
            System.out.println(llist.get(j));}

        System.out.println("After HashSet<String> set => ");
        Iterator<String> f = set.iterator();
        while (f.hasNext())
            System.out.println(f.next());

      //  System.out.println("Common elements => " + set.stream().filter(llist::contains).collect(Collectors.toList()));




    }

        }











