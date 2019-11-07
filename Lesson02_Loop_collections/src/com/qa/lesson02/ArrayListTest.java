package com.qa.lesson02;

        import java.util.ArrayList;
        import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("1");

        list.add("2");

        list.add("3");

        list.add("4");

        list.add("5");

        list.add("6");

        System.out.println("ArrayList Before Reverse :" + list);

        Collections.reverse(list);

        System.out.println("ArrayList After Reverse :"+ list);
    }






}
