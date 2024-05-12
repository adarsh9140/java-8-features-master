package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionIdentityExample {

    public static void main(String[] args) {

        List<Integer> list =Arrays.asList(1,2,3,2,1,4,5,6,4,6,7,8,7,9,9,9,9,9);

        Map<Integer,Long> mapList = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(mapList);

        List<String> strList =Arrays.asList("as","ad","as","ae");

        Map<String,Long> mapStringList = strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(mapStringList);
    }
}
