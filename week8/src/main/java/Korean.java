public class Korean implements Human {
    @Override
    public void breath() {
        for (int i=0; i<breathInterval; i++) {
            System.out.println("나 숨쉬고 있어!");
        }
    }

    @Override
    public void hello() {
        System.out.println("안녕하세요");
    }
}
