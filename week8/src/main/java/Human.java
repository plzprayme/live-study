interface Human extends Life {
    void hello();

    default void sleep() {
        System.out.println("zzZZ");
    }
}
