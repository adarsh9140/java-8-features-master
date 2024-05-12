package com.javamultiplex.methodreference.interview.collectionQuestions;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDublicateInStringAndCount {

    public static void main(String[] args) {

        String text = "hello how are you";


        Map<Character, Long> charCountMap = text.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        //this print all words occurrence
        System.out.println(charCountMap);


        //but this print only duplicate words occurrence
       /* System.out.println("Duplicates in the string '" + text + "':");
        charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("'" + entry.getKey() + "' - " + entry.getValue() + " occurrences"));
*/

        charCountMap.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);

    }

}
