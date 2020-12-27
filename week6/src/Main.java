public class Main {
    public static void main(String[] args) {

        Mammalia person1 = new Human();
        person1.getHeight();
//        person1.getNationality();  // 자식 클래스의 메소드, 속성에는 캐스팅 없이 접근 불가
        // 그렇다면 왜 이렇게 쓸까? 다형성 때문에?

        Human person2 = new Human();
        person2.getNationality(); // 자식, 부모 모두 접근 가능

        // Dynamic Dispatch
        person1.getName();
        Mammalia whale = new Whale();
        whale.getName();



    }
}
