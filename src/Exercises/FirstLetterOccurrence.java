package Exercises;

public class FirstLetterOccurrence {
    public static void main(String[] args) {
        String name = "Java is awesome!";
        firstOccurrence(name);
    }

    public static int firstOccurrence(String name) {
        char[] c = name.toCharArray();
        int count = 0;
        for(int i = 0;i<c.length;i++) {
            if(c[0]==c[i]) {
                System.out.println(c[0] + " COUNT IS : " + count);

                count++;
            }
        }
        System.out.println(c[0] + " COUNT IS : " + count);
        return count;
    }
}
