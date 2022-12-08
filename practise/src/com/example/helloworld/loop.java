//package solution;
//
//import api.*;
//import java.util.*;
//
//public class Solution implements SolutionInterface {
//    private APICaller api;
//
//    public Solution(APICaller api) {
//        this.api = api;
//        // You can initiate and calculate things here
//    }
//
//    /**
//     * Tell the dog to eat bone number 0. No loop necessary.
//     */
//    public void level1() {
//        // Write your code here
//        api.eatBone(0);
//    }
//
//    /**
//     * Let the dog eat bones numbered 0, 1 and 2.
//     */
//    public void level2() {
//        // Write your code here
//        api.eatBone(0);
//        api.eatBone(1);
//        api.eatBone(2);
//    }
//
//    /**
//     * Use a loop to let the dog eat all bones. There 18 bones numbered from
//     * 0 to 17.
//     */
//    public void level3() {
//        // Write your code here
//        for (int i = 0; i <= 18; i++){
//            api.eatBone(i);
//        }
//    }
//
//    /**
//     * Let the dog eat only brown bones(8). There are 22 bones numbered from
//     * 0 to 21.
//     */
//    public void level4() {
//        // Write your code here
//        for (int i = 0; i < 22; i++) {
//            if(api.isBrownBone(i)) {
//                api.eatBone(i);
//            }
//        }
//    }
//
//    /**
//     * Let the dog eat all bones except for bone numbers 2, 4 and 5. There
//     * are 10 bones numbered from 0 to 9. Use the continue keyword.
//     */
//    public void level5() {
//        // Write your code here
//        for (int i = 0; i < 10; i++) {
//            if (i == 2 || i == 4 || i == 5) {
//                continue;
//            }
//            api.eatBone(i);
//        }
//    }
//
//    /**
//     * Let the dog eat available bones until it is time to go home. There are
//     * 10 bones numbered from 0 to 9. Use the break keyword.
//     */
//    public void level6() {
//        // Write your code here
//        for (int i = 0; i < 10; i++) {
//            if (api.isTimeForBreak()) {
//                break;
//            }
//            api.eatBone(i);
//        }
//    }
//
//    /**
//     * Let all dogs, eat their corresponding bones. Use nested loops.
//     */
//    public void level7() {
//        // Write your code here
//    }
//}