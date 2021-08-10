package com.practice.arrays;

import java.util.Arrays;

public class SmallestIntegerNotInArray {

    public static void main(String[] args) {
        int[] a = {-3, -1};
        int n = smallestNotInInteger(a);
        System.out.println(n);
    }
    static int smallestNotInInteger(int[] A){
        int n = 0;
        if(A.length>0){
            Arrays.sort(A);
            for(int i=1; i<=A[A.length-1]; i++){
                int res = Arrays.binarySearch(A, i);
                n = i;
                if(res<0){
                    return i;
                }
            }
        }
        return n+1;
    }
}
