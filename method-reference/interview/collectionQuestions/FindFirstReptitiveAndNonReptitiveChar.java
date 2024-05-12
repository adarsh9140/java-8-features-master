package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstReptitiveAndNonReptitiveChar {

    public static void main(String[] args) {


        String text = "hello world";

        Map<Character, Long> charCount = text.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        //charCount.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().get();

        System.out.println("firstNonReptitive is :: " + charCount.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().get());

        System.out.println("firstReptitive is :: " + charCount.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).findFirst().get());


    }

}
