package ExerciseTrial;

import java.util.Arrays;

public class TwoWay {
    public static void main(String[] args) {
        twoWay();
    }

    public static void twoWay(){
        int[] list = {1, 2, 3, 4, 5};
        int left = 0;
        int right = list.length - 1;
        int target = 1;
        while (left < right) {
            if(list[left] == target) {
                System.out.println("ON THE LEFT");
            } else if(list[right] == target) {
                System.out.println("ON THE RIGHT");

            }
            left++;
            right--;
        }
    }
}
