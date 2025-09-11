class Parent {
    public Parent() {
        System.out.println("P no");
    }

    public Parent(String message) {
        System.out.println("P par");
    }
}

class Child extends Parent {
    public Child() { // 자식 클래스의 기본 생성자
        this("Call");
        System.out.println("C no");
    }

    public Child(String message) { // 파라미터로 String을 받았음
        System.out.println("C par");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
    }
}