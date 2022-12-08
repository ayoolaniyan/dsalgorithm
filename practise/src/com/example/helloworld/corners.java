package com.example.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class corners {
        public static void main(String[] args) {
            // write your code here
            int numberOfCows = 5;
            int fieldsCount = 5; // 5 x 5
            // get x position
            // get y position
            //final int[][] field = new int[fieldsCount][fieldsCount];
            // get cows in corners
            Integer cornerCows = getCornerCows(numberOfCows, fieldsCount);
            System.out.println(cornerCows);
            // get neighbors count
            //Integer neighborsCount = getNeighbors(numberOfCows);
            //System.out.println(neighborsCount);
        }
//        private static Integer getNeighbors(int numberOfCows) {
//            HashSet<List<Integer>> neighborsCount = new HashSet<>();
//            IntStream.range(0, numberOfCows)
//                    .forEach(
//                            cowIndex -> {
//                                int cowXValue = cowIndex; // get cow x value
//                                int cowYValue = cowIndex; // get cow y value
//                                List<Integer> cowPosition = Arrays.asList(cowXValue, cowYValue); // (x, y)
//                                // get all possible neighbors
//                                List<List<Integer>> neighbors = new ArrayList<>();
//                                neighbors.add(Arrays.asList(cowXValue - 1, cowYValue));
//                                neighbors.add(Arrays.asList(cowXValue + 1, cowYValue));
//                                neighbors.add(Arrays.asList(cowXValue, cowYValue - 1));
//                                neighbors.add(Arrays.asList(cowXValue, cowYValue + 1));
//                                // iterate over all neighbors
//                                neighbors.forEach(
//                                        n -> {
//                                            // check if a neighbor exists
//                                            IntStream.range(0, numberOfCows)
//                                                    .forEach(
//                                                            cowIndex2 -> {
//                                                                List<Integer> p = Arrays.asList(cowIndex2, cowIndex2); // (x, y)
//                                                                if (p.equals(n)) {
//                                                                    neighborsCount.add(cowPosition); // add the cow
//                                                                    neighborsCount.add(n); // add the neighbor
//                                                                }
//                                                            });
//                                        });
//                            });
//            return neighborsCount.size();
//        }
        private static Integer getCornerCows(int numberOfCows, int fieldsCount) {
            List<List<Integer>> corners = new ArrayList<>();
            corners.add(Arrays.asList(0, 0));
            corners.add(Arrays.asList(0, fieldsCount - 1));
            corners.add(Arrays.asList(fieldsCount - 1, 0));
            corners.add(Arrays.asList(fieldsCount - 1, fieldsCount - 1));
            AtomicInteger count = new AtomicInteger();
            IntStream.range(0, numberOfCows)
                    .forEach(
                            cowIndex -> {  //0, 1, 2 etc
                                int cowXValue = cowIndex; // API.getX(cowIndex)
                                int cowYValue = cowIndex; // API.getY(cowIndex)
                                List<Integer> cowPosition = Arrays.asList(cowXValue, cowYValue);
                                corners.forEach(
                                        corner -> {
                                            if (corner.equals(cowPosition)) {
                                                count.addAndGet(1);
                                            }
                                        });
                            });
            return count.get();
        }
}
