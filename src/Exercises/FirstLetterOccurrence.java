package Exercises;

public class FirstLetterOccurrence {
    public static void main(String[] args) {
        String name = "Java is awesome111!";
        stringHasNumber(name);
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

    public static void stringHasNumber(String num) {

        StringBuilder stringBuilder = new StringBuilder();
        for(char c:num.toCharArray()){
            if(Character.isDigit(c)){

                stringBuilder.append(c);
            }
        }
        System.out.println("Number is "+stringBuilder);

    }
}
