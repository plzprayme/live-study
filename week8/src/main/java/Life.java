interface Life {
    // public static final 이 생략되어 있다.
    // 따라서 초기화하지 않으면 선언이 불가능하다.
    double breathInterval = 5;

    void breath();
}
