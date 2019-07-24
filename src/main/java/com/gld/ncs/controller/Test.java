package com.gld.ncs.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list1.removeAll(list2);
        list1.addAll(list2);
        System.out.print(list1.toString());

    }
}
