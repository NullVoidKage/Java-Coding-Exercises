package Generics;

public class GenericsMethod {
    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        demoClass.genericsMethod("RATBU");
    }
}

class DemoClass {
    public <T> void genericsMethod(T data){
        System.out.println("Generics Method: "+data);
    }
}