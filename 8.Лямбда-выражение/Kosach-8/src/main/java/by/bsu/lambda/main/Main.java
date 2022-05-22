package by.bsu.lambda.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Дано три разных целых числа.
Реализовать лямбда-выражение, которое находит наибольшее из этих трех чисел.*/
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(3);
        Integer max = list.stream().reduce(Integer::max).get();
        System.out.println(list);
        System.out.println("max = " + max);
    }
}
