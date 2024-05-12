package com.javamultiplex.methodreference.interview.collectionQuestions;

public class ExpensiveResourceForSupplier {

    ExpensiveResourceForSupplier()  {

        System.out.println("expensive resource...");

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException  e){

        }
    }

    public void doSomeStuff(){

        System.out.println("doing stuff...");
    }
}
