package day36_ArrayList;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.set(4, 0);

        System.out.println(list1);
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            list2.add(i);
        }
        System.out.println(list2);

        for (int i = 0; i <= list2.size() - 1; i++) { // i: index numbers
            Integer each = list2.get(i); // each element in the list

            if (each % 2 != 0) {
                list2.set(i, each * 2);
            } else {
                list2.set(i, each * 3);
            }


        }

    }
}