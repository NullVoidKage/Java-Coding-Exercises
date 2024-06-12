package Generics;

public class GenericsClass {
    public static void main(String[] args) {
        GenericClass<Integer> intObj = new GenericClass<>(5);
        System.out.println("Generic Class returns: "+ intObj.getData());
        GenericClass<String> stringObj = new GenericClass<>("RATBU");
        System.out.println("Generic Class returns: "+ stringObj.getData());

    }
}

class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}