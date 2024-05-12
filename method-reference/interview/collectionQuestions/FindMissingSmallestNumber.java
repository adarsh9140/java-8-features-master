package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.Arrays;

public class FindMissingSmallestNumber {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 4, 5, 6, 7, 8, 3, 9, 11};

        int num = 0;

        Arrays.sort(arr);

        for (int i=0;i<arr.length;i++){

            if(arr[i]==num)
                num++;
            else{
                System.out.println(num);
                break;
            }
        }
    }
}
