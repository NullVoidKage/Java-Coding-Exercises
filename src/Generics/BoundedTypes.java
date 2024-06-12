package Generics;

public class BoundedTypes {
    public static void main(String[] args) {
        BoundedClass<Integer> obj = new BoundedClass<>();

        obj.display();
        obj.getData(20);
    }
}

class BoundedClass <T extends Number> {

    protected void getData(T data) {
        System.out.println("T DATA " + data+1);
    }
    public void display() {
        System.out.println("This is a bounded type");
    }
}