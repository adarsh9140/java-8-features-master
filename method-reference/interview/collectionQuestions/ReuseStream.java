package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReuseStream {

    public static void main(String[] args) {


        //stream can  be reuse

        String[] names = {"akash","mahesh","raja","akash","baman"};
        Stream<String> nameList = Arrays.asList(names).stream();

        nameList.sorted().forEach(e-> System.out.println(e));

        List<String> name = nameList.filter((e->"akash".equalsIgnoreCase(e))).collect(Collectors.toList());
        Long count1  = nameList.filter(("akash"::equalsIgnoreCase)).count();

        System.out.println(name);
        System.out.println(count1);

        // here how we reuse the stream by using Supplier

        Supplier<Stream<String>> supplier = ()->Stream.of(names);

        List<String> name2 = supplier.get().filter((e->"akash".equalsIgnoreCase(e))).collect(Collectors.toList());
        Long count2  = supplier.get().filter(("akash"::equalsIgnoreCase)).count();


        System.out.println(name2);
        System.out.println(count2);
    }
}
