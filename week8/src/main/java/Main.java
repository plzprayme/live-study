public class Main {
    public static void main(String[] args) {
        Human korean = new Korean();
        korean.hello();
        korean.sleep();

        Human american = new American();
        american.hello();
        american.sleep();


        test(korean);
        test(american);
    }

    // 부모 인터페이스
    public static void test(Human human) {
        System.out.println("Human TEST");
    }

    // 부모의 부모 인터페이스
    public static void test(Life life) {
        System.out.println("Life TEST");
    }

    // 동시에 존재할 때 부모 인터페이스 메소드가 동작한다.
}
