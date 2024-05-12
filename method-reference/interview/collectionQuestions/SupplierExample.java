package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) throws InterruptedException {


        Supplier<ExpensiveResourceForSupplier> resourceSupplier = ExpensiveResourceForSupplier::new;


        // Resource is not initialized yet
        System.out.println("Resource not yet initialized...");

        // When needed, initialize and use the resource
        ExpensiveResourceForSupplier resource = resourceSupplier.get();
        resource.doSomeStuff();
    }
}
