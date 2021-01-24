public class Cordyceps implements Plant, Bug {
    @Override
    public void breath() {
        System.out.println("숨은 여름 겨울 둘 다 쉽니다~");
    }

    @Override
    public void photosynthesis() {
        System.out.println("여름엔 식물이라서 광합성합니다~");
    }

    public void insect() {
        System.out.println("겨울엔 곤충이라서 머리 가슴 배로 이루어져 있습니다~");
        System.out.println(head);
        System.out.println(chest);
        System.out.println(body);
    }
}
