package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.Arrays;
import java.util.List;

public class FindCommonElementsInArray {

    public static void main(String[] args) {

        List<String> firstList = Arrays.asList("amam","jay","anil","akash");

        List<String> secondList = Arrays.asList("amam1","jay","anil1","akash1");

        firstList.stream()
                .filter(secondList::contains)
                .forEach(System.out::println);

    }
}
