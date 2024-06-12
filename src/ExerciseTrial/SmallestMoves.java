package ExerciseTrial;

public class SmallestMoves {
    public static void main(String[] args) {
        int[] A = {6, 2, 3, 5, 6, 3};
        smallestMoves(A);
    }

    public static int smallestMoves(int[] A) {
        int length = A.length;
        int count = 0;
        for(int i = 0;i<length;i++) {
            for(int j = i + 1;j<length;j++) {
                if(A[i]==A[j]) {
                    A[j] = A[j]+1;
                    count++;
                }
            }
        }
        System.out.println("MOVES " +count + " " );
        for(int i=0;i<length;i++) {
            System.out.println(A[i]);
        }
       return count;
    }


    //Loop through the array
    //Check each if there's duplicate then
    //Check also if the array is 1...N
    //Then if the number is 1...N
    //pick a duplicate value then increase by 1
    //Else if the array don't start with 1
    // decrease a duplicate value until 1
}
