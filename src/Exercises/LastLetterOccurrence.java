package Exercises;

public class LastLetterOccurrence {
    public static void main(String[] args) {
        String name = "ratbu";
        lastOccurrence(name);
}

    private static void lastOccurrence(String name) {
        StringBuilder s = new StringBuilder(name).reverse();
        String converted = s.toString();
        char[] last = converted.toCharArray();
        int count = 0;
        for(int i=0;i<last.length;i++) {
            if(last[0]==last[i]) {
                count++;
            }
        }
        System.out.println(count + " ME IN");
    }
}
