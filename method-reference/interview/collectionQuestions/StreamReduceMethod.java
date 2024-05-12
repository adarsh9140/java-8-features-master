package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.Arrays;
import java.util.List;

public class StreamReduceMethod {

    public static void main(String[] args) {

        Integer[] intArray = {12,23,4,11};

        List<Integer> intList = Arrays.asList(intArray);

        Integer output  = intList.stream().reduce((a,b)->a*b).get();

        System.out.println(output);

        String text = "hello how are you";

        System.out.println(text.replaceAll(" " ,"-"));
    }
}
