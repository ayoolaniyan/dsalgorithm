//package com.example.helloworld;
//
//public class sort {
//    package solution;
//
//import api.*;
//import java.util.*;
//
//
//
//        /**
//         * Selection sort
//         */
//        public List<Integer> selectionSort(List<Integer> listVar) {
//            // Write your code here
//            int smallInt = 0;
//            int j=0;
//            int smallIntIndex = 0;
//
//            for(int i=0;i<listVar.size() - 1;i++){
//                smallInt = listVar.get(i);
//                smallIntIndex = i;
//                for(j=i+1;j<listVar.size();j++){
//                    if(listVar.get(j)<smallInt){
//                        smallInt = listVar.get(j);
//                        smallIntIndex = j;
//                    }
//                }
//
//                if (i != smallIntIndex) {
//                    Integer temp = listVar.get(smallIntIndex);
//                    listVar.set(smallIntIndex, listVar.get(i));
//                    listVar.set(i, temp);
//                }
//            }
//            return listVar;
//            // return new ArrayList<Integer>();
//        }
//
//        /**
//         * Insertion sort
//         */
//        public List<Integer> insertionSort(List<Integer> listVar) {
//            // Write your code here
//            for(int i = 1; i < listVar.size(); i++){
//                Integer key = listVar.get(i);
//                int j = i-1;
//                while(j>=0 && key.compareTo(listVar.get(j)) < 0){
//                    Integer x = listVar.get(j);
//                    listVar.set(j+1,x);
//                    j--;
//                }
//                listVar.set(j+1, key);
//            }
//            return listVar;
//            // return new ArrayList<Integer>();
//        }
//
//        /**
//         * Bubble sort
//         */
//        public List<Integer> bubbleSort(List<Integer> listVar) {
//            // Write your code here
//            for (int i = 0; i < listVar.size() - 1; i++) {
//                for (int j = i; j < listVar.size(); j++) {
//                    if (listVar.get(j) < listVar.get(i)) {
//                        Integer temp = listVar.get(j);
//                        listVar.set(j, listVar.get(i));
//                        listVar.set(i, temp);
//                    }
//                }
//            }
//            return listVar;
//            // return new ArrayList<Integer>();
//        }
//
//        /**
//         * Merge sort
//         */
//        public List<Integer> mergeSort(List<Integer> listVar) {
//            // Write your code here
//            return new ArrayList<Integer>();
//        }
//
//        /**
//         * Quicksort
//         */
//        public List<Integer> quicksort(List<Integer> listVar) {
//            // Write your code here
//            return new ArrayList<Integer>();
//        }
//
//    /** Reverse List
//     * Return the given list in reversed order. Each element in the given
//     * list contains a single character.
//     */
//    public List<String> reverse(List<String> listOfChars) {
//        // Write your code here
//        for (int i = 0, j = listOfChars.size() - 1; i < j; i++) {
//            listOfChars.add(i, listOfChars.remove(j));
//        }
//        return listOfChars;
//    }
//
//    /**
//     * Return n!, ie the factorial of n which is 1 x 2 x 3 ... x n
//     */
//    public int factorialRecursion(int n) {
//        // Write your code here
//        if (n <= 2) {
//            return n;
//        }
//        return n * factorial(n - 1);
//    }
//
//    /**
//     * Return n!, ie the factorial of n which is 1 x 2 x 3 ... x n
//     */
//    public int factorial(int n) {
//        // Write your code here
//        int fact = 1;
//        for (int i = 2; i <= n; i++) {
//            fact = fact * i;
//        }
//        return fact;
//    }
//
//}
//
//
//
