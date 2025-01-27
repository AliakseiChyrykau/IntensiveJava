package main.java.by.intensiveJava;

import main.java.by.intensiveJava.MyArrayList;
import main.java.by.intensiveJava.MyList;

import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyList myList = new MyArrayList<Integer>();

        myList.add(Integer.valueOf(1));
        myList.add(Integer.valueOf(2));
        myList.add(Integer.valueOf(3));
        myList.add(Integer.valueOf(4));
        myList.add(Integer.valueOf(5));
        myList.add(Integer.valueOf(6));
        myList.add(3, 9);
        myList.add(5, 8);
        myList.add(99);
        myList.add(7);
        myList.add(12);
        myList.add(7);
        myList.add(7);

        myList.quickSort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return Integer.compare((Integer) o1, (Integer) o2);
            }
        });
        System.out.println(1);
        myList.get(1);
    }
}