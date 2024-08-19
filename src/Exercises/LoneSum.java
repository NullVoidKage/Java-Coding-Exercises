package Exercises;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoneSum {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 1, 1);
        int[] arr = {1, 1, 3, 3, 4};
        twoSum(arr);
//        loneSum(list);
    }

    public static int loneSum(List<Integer> list) {
        Set<Integer> integerSet = new HashSet<>(list);
        String name = "SAAA";
        int sum = 0;
        for (Integer set: integerSet){
             sum += set;
        }
        System.out.println(sum);
        return sum;
    }


    public static void twoSum(int[] arr) {
        int total = 6;
        int sum;
        for(int i = 1;i <arr.length;i++) {
            for(int j = i; j<arr.length;j++) {
                if(arr[i]+arr[j]==total) {
                    System.out.println("Three sum");
                }
            }

        }
    }
}


// CREATE TABlE Order
// (id INT primary key);
//

// CREATE TABLE Customer
// (id INT PRIMARY KEY,
// Customer_id INT,
// (Foreign key(customer_id) REFERENCES Customer(id)
