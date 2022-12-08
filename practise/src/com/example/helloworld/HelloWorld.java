package com.example.helloworld;

import com.example.helloworld.state.Canvas;
import com.example.helloworld.state.EraserTool;

public class HelloWorld {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }


//        }
//        Vehicle newVehicle = new Vehicle("Ayo", "green");
//        newVehicle.name = "Tesla";
//        newVehicle.color = "Blue";
//        System.out.println("Vehicle name=" + newVehicle.name );
//        System.out.println("Vehicle color=" + newVehicle.color );
//        Bike newBike = new Bike();
//        newBike.makeNoise();

//        int arr[] = { 5,4,3,2,1 };
//
//        int temp;
//        for(int i=0; i < arr.length-1; i++){
//
//            for(int j=1; j < arr.length-i; j++){
//                if(arr[j-1] > arr[j]){
//                    temp=arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//            //check that last index has highest value in first loop,
//            // second last index has second last highest value and so on
//            System.out.println("Array after "+(i+1)+"th iteration:"+Arrays.toString(arr));
//        }
//        System.out.println("Vehicle name=" + Arrays.toString(arr) );
////        System.out.println("Array after sorting in ascending order:"+ Arrays.toString(bubbleSortAscending(arr)));

//        List<Integer> list = new ArrayList<>(Arrays.asList(100,4,2,3,5,8,34));
//        insertionSort(list);
//        for (Integer i: list)
//            System.out.println(i);


//        Stream<String> myStream = Arrays.asList("tree","","bush","","").stream();
//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 0));
//        AtomicInteger atomicInteger = new AtomicInteger(0);
//        Map<Integer, String> result3 = myStream
//                .collect(Collectors
//                        .toMap(x -> list., Function.identity()));
//        System.out.println(result3);

//        String[] keys= {"a", "b", "c"};
//        int[] vals= {1, 2, 3};


//        List<String> myStream = Arrays.asList("tree","","bush","","");
//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 0));
//
//
//        HashMap<String, Integer> hash= new HashMap<String, Integer>();
//
//        for(int i= 0; i < myStream.size(); i++){
//            hash.put(myStream.get(i), list.get(i));
//            System.out.println(myStream.get(i) + list.get(i));
//        }

    // initializing two dimensional array as literal
//
//        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//        //int[][] arr = {{width,2,3},{4,5,6},{7,8,9}};
//        ArrayList<Integer> al = new ArrayList<Integer>();
//        int x = 2, y = 2;
//        int width = 2; //change the value of width, according to the requirement
//        for(int i = 0; i < 5; i++){
//            for(int j = 0; j < 5; j++){
//                if( (i == (x-width) && ( (y+width) >= j && j >= (y-width))) || (i == (x+width) && ( (y+width) >= j && j >= (y-width))) || (j == (y-width) && ( (x+width) >= i && i >= (x-width))) || (j == (y+width) && ( (x+width) >= i && i >= (x-width)))  ){
//                    //if( x >= 0 && i < (i+width) && y >= 0 && j < (j+width))
//                    {
//                        al.add(arr[i][j]);
//                    }
//                }
//            }
//        System.out.println(al);
//
//    }
//
//
//    public void level6(List<Integer> hedgeDirections) {
//    // Write your code here
//        String[] keys = {"a","b","c","d"};
//
////        int values[] = { 0, 1, 2, 3 };
//
//        if(keys.length != hedgeDirections.size()) {
//            throw new IllegalArgumentException("Keys and Values need to have the same length.");
//        }
//        Map<String,Integer> map = new HashMap<>();
//        for (int i = 0; i < keys.length; i++) {
//            map.put(keys[i], hedgeDirections.get(i));
////            System.out.println(keys[i] + hedgeDirections.get(i));
//        }
//
//    }
//
//    public static List<Integer> insertionSort(List<Integer> listVar) {
//        // Write your code here
//        for(int i = 1; i < listVar.size(); i++){
//            Integer key = listVar.get(i);
//            int j = i-1;
//            while(j>=0 && key.compareTo(listVar.get(j)) < 0){
//                Integer x = listVar.get(j);
//                listVar.set(j+1,x);
//                j--;
//            }
//            listVar.set(j+1, key);
//        }
//        return listVar;
//    }
//
//    public void level4() {
//        // Write your code here
//        List<String> plants = new ArrayList<>(Arrays.asList("tree","tree","bush","tree","tree"));
//        int plant[] = { 0,1,2,3,4 };
//    }
//
//    public static List<Integer> changeValues(int a, int b) {
//        // Write your code here
//
//        return new ArrayList<Integer>();
//    }
//
//    private void merge(int[] left, int[] right, int[] result) {
//        int i = 0, j = 0, k = 0;
//
//        while (i < left.length && j < right.length) {
//            if (left[i] <= right[j])
//                result[k++] = left[i++];
//            else
//                result[k++] = right[j++];
//        }
//
//        while (i < left.length)
//            result[k++] = left[i++];
//
//        while (j < right.length)
//            result[k++] = right[j++];
//    }
//
//    public static List<Integer> mergeSort(List<Integer> listVar) {
//        return new ArrayList<Integer>();
//    }
//
//    public static List<Integer> selectionSort(List<Integer> listVar) {
//        // Write your code here
//        int smallInt = 0;
//        int j=0;
//        int smallIntIndex = 0;
//
//        for(int i=0;i<listVar.size() - 1;i++){
//            smallInt = listVar.get(i);
//            smallIntIndex = i;
//            for(j=i+1;j<listVar.size();j++){
//                if(listVar.get(j)<smallInt){
//                    smallInt = listVar.get(j);
//                    smallIntIndex = j;
//                }
//            }
//
//            if (i != smallIntIndex) {
//                Integer temp = listVar.get(smallIntIndex);
//                listVar.set(smallIntIndex, listVar.get(i));
//                listVar.set(i, temp);
//            }
//        }
//        return listVar;
////        return new ArrayList<Integer>();
//    }
//
//
//
//    public static List<Integer> bubbleSort(List<Integer> listVar) {
//        // Write your code here
//        for (int i = 0; i < listVar.size() - 1; i++) {
//            for (int j = i; j < listVar.size(); j++) {
//                if (listVar.get(j) < listVar.get(i)) {
//                    Integer temp = listVar.get(j);
//                    listVar.set(j, listVar.get(i));
//                    listVar.set(i, temp);
//                }
//            }
//        }
//        return listVar;
//
//    }


}