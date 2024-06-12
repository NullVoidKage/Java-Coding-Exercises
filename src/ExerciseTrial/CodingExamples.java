package ExerciseTrial;

public class CodingExamples {
    public static void main(String[] args) {
//        oddEven(13);
//        reverseString("Nikko");
//        swapTwoNumber(5, 10);
//        int[] number = {21, 2, 3, 40, 10};
//        checkIfListHasOddOrEvenNumber(number);
        factorial(200);
    }

    private static long factorial(long n) {
        if(n==1) {
            return 1;
        } else {
            return (n * factorial(n-1));
        }
    }

    private static void oddEven(int num) {
        if(num % 2 == 0) {
            System.out.println("EVEN NUMBER " + num);
        } else {
            System.out.println("ODD NUMBER " + num);
        }
    }
    private static void reverseString(String name) {
        StringBuilder stringBuilder = new StringBuilder(name).reverse();
        System.out.println(stringBuilder);
    }
    private static void swapTwoNumber(int a, int b) {
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        a = a + b; // 5 + 10 = 15
        b = a - b; // 15 - 10 = 5
        a = a - b; // 15 - 5 = 10
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
    private static void checkIfListHasOddOrEvenNumber(int[] number) {
        for(int num: number) {
            if(num % 2 != 0) {
                System.out.println("ODD " + num);
            } else {
                System.out.println("EVEN " + num);
            }
        }
    }
}
