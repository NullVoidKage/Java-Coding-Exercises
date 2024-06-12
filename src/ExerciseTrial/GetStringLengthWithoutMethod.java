package ExerciseTrial;

public class GetStringLengthWithoutMethod {
    public static void main(String[] args) {
        toString("NANI");
    }

    public static void toString(String name) {
        int count = 0;
        for(char c: name.toCharArray()) {
            System.out.print(c + " | ");
            count++;
        }
        System.out.println(count);
    }
}
